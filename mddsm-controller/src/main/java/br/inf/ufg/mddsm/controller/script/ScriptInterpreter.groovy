package br.inf.ufg.mddsm.controller.script

import java.util.concurrent.TimeUnit

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.compare.AttributeChange


import br.inf.ufg.mddsm.controller.img.DSC
import br.inf.ufg.mddsm.controller.img.DSEvent
import br.inf.ufg.mddsm.controller.img.IMRepository
import br.inf.ufg.mddsm.controller.img.Type
import br.inf.ufg.mddsm.controller.img.IntentModel;
import br.inf.ufg.mddsm.controller.img.DSCRepository
import br.inf.ufg.mddsm.controller.img.TotalTime


import br.ufg.inf.mddsm.synthesis.Command
import br.ufg.inf.mddsm.synthesis.CommandAction
import br.ufg.inf.mddsm.synthesis.ControlScript

import metalang4md.EActor
import metalang4md.EItem

import m4md.EDomainSpecificType
import m4md.EDomainSpecificEntity
import m4md.EControlSchema
import m4md.EDataSchema
import m4md.EDomainSpecificCommand

import java.util.HashMap
import java.util.ArrayList

import dsk.EEventType
import dsk.EMetaCmdType


class ScriptInterpreter{
	
	static IMRepository IMrepository = IMRepository.getInstance();
	String IMid;
	IntentModel im;
	private static Logger log = LoggerFactory.getLogger(ScriptInterpreter.class);
	boolean debug = false;
	
	/*public void interpretOld(ControlScript script) {
		
		//List<Command> commands = script.commands
						
		/*commands.each{
			extractDSCommand($(it))
		}
		
		println("Interpreting script... ")
		
		List<String> commands = script.commandsList
		//List<Command> commands = script.command
				
		new ScriptProcessor().process(commands)
		
	}*/
	
	public void interpret(ControlScript script) {
		
		//log.trace("interpret(script:{})", script);
		
		println("Interpreting script... ")
		
		List<Command> commands = script.commands
		
		extractDSCommand(commands)
		
	}
	
	public void extractDSCommand(List<Command> commands) {
	
		//log.trace("extractDSCommand(commands:{})", commands);
		
		HashMap<String, ArrayList<DSC>> map = new HashMap<String, ArrayList<DSC>>()
		DSCRepository repository = DSCRepository.getInstance()
		
		if(debug) println("Extracting Domain Specific command... ")
		def diff2
		Command metaCommand
		Iterator<Command> it = commands.iterator()
	
		long sumTime=0;
		
		while(it.hasNext()) {
			diff2 = it.next()
			if(diff2 instanceof ReferenceChange || diff2 instanceof AttributeChange) {
				metaCommand = new Command(diff2)
				//println metaCommand.action()
				//println metaCommand.source()
				//println metaCommand.value()
				
				//if(metaCommand.source() instanceof EDomainSpecificEntity){ NOT USED
				if((metaCommand.source() instanceof EControlSchema || metaCommand.source() instanceof EDataSchema) && metaCommand.value() instanceof EDomainSpecificEntity) {
					map = repository.getDSCs(metaCommand.value.eClass().name, metaCommand.action())
					
					//genarete IM
					for(dsc in map.get("SYNC")) {
						if(debug) println("Processing sync command: "+ dsc.getName())
						IMid = ScriptProcessor.process(dsc)
						im = IMrepository.getIM(IMid)
						im.setExecutionType("SYNC")
						if(debug) println("dispatching...")
						
						long t1 = System.nanoTime();
						ScriptManager.getInstance().dispatch(im)
						long t2 = System.nanoTime();
						sumTime+=(t2-t1);
					}
					
					for(dsc in map.get("ASYNC")) {
						if(debug) println("Processing async command: "+ dsc.getName())
						IMid = ScriptProcessor.process(dsc)
						im = IMrepository.getIM(IMid)
						im.setExecutionType("ASYNC")
						if(debug) println("registering...")
						ScriptManager.getInstance().register(im)
					}
						
				}
				
			}
		}
		//long t2 = System.nanoTime();
		//long totalTime = TimeUnit.MILLISECONDS.convert(sumTime, TimeUnit.NANOSECONDS);
		long totalTime = sumTime;
		//long totalTime = t2 - t1;
		//System.out.println("SE("+script+"):" + TimeUnit.MILLISECONDS.convert((t2-t1), TimeUnit.NANOSECONDS) + " ms");
		System.out.println("EU processed: " + totalTime + "ns");
		TotalTime time = TotalTime.getInstance();
		TotalTime.add(totalTime);
	
	}
	
	public void extractDSCommandOld(List<Command> commands) {
		log.trace("extractDSCommand(commands:{})", commands);
		
		println("Extracting Domain Specific command... ")
		def diff2
		Command metaCommand
		Iterator<Command> it = commands.iterator()

		while(it.hasNext()) {
			diff2 = it.next()
			if(diff2 instanceof ReferenceChange || diff2 instanceof AttributeChange) {
				metaCommand = new Command(diff2)
				println metaCommand.action()

				switch(metaCommand.action()) {
					case CommandAction.ADD:
					case CommandAction.CHANGE:

						
						if(metaCommand.source() instanceof EDomainSpecificEntity && metaCommand.value() instanceof EDomainSpecificCommand) {
							for(cmds in metaCommand.value().cmd) {
								println("Processing command: "+cmds.toString())
								IMid = ScriptProcessor.process(cmds.toString())
							}
						}
						//get IM generated and insert behavior
						if(metaCommand.value() instanceof EDomainSpecificType) {
							Map metadata = metaCommand.valueMetadata()
							println "Interaction Behavior"
							println metadata["interactionBehavior"]
							String interactionType = metadata["interactionBehavior"].toString()
							im = IMrepository.getIM(IMid)
							im.setExecutionType(interactionType)
							
							if(interactionType.equals("SYNC")) {
								ScriptManager.dispatch(IMid)
							}else if(interactionType.equals("ASYNC")) {
								ScriptManager.register(IMid)
							}
						}

						break;
					case CommandAction.DELETE:
						break;
					default: println("Unknown action!")
				}
			}

			println "\n"

		}
	}
	
	/*public HashMap<String, ArrayList<DSC>> getDSCs(String entityName, CommandAction metaCmd) {
		
		HashMap<String, ArrayList<DSC>> map = new HashMap<String, ArrayList<DSC>>()
		DSCRepository repository = DSCRepository.getInstance()
		ArrayList<DSEvent> events = new ArrayList<DSEvent>()
		ArrayList<DSC> syncDSCs=new ArrayList<DSC>(), asyncDSCs=new ArrayList<DSC>();
		boolean sync =false, async=false;
		
		ArrayList<DSC> dscs = repository.getAllDSCs(entityName)
		Iterator<DSC> it = dscs.iterator()
		
		while(it.hasNext()) {
		
			DSC dsc = it.next();
			
			events = dsc.getEvents();
			
			int i=0;
			
			while(i < events.size && (!sync || !async)) { 
				if(events.get(i).getType() == EEventType.TOP && events.get(i).getMetaCmd().getLiteral().equals(metaCmd.getLiteral())) {
					sync = true;
				}else if(events.get(i).getType() == EEventType.BOTTOM) {
					async = true;
				}
				
				i++;
				
			}
			
			if(sync) {
				syncDSCs.add(dsc);
				sync = false;
			}
			
			if(async) {
				asyncDSCs.add(dsc);
				async = false
			}
				
		}
		map.put("SYNC", syncDSCs);
		map.put("ASYNC", asyncDSCs);
		return map;
		
	}*/
	
	public void extractDSCommand(Command metaCommand) {
		Map metadata = metaCommand.valueMetadata();
		
		switch(metaCommand.action()) {
			case CommandAction.ADD:
			case CommandAction.CHANGE:
				
				//verificar se o target é uma instancia de Item ou Ator
				
				if(metaCommand.value() instanceof EActor || metaCommand.value() instanceof EItem)
					for(cmd in command.value().cmd)
						ScriptProcessor.process(cmd.toString())
				
				/*EObject source = metaCommand.source()
				EStructuralFeature feature = source.eClass().getEStructuralFeature("name")
				String sourceName = (String)source.eGet(feature)
				
				EObject target = metaCommand.target()
				EStructuralFeature feature2 = source.eClass().getEStructuralFeature("name")
				String targetName = (String)target.eGet(feature2)
				
				String associationName = sourceName+targetName;
				 
				DSC dsc = new DSC(associationName, Type.ASSOC);

				assert metadata.get("interactionBehavior") == "SYNC"*/
												
				break
				
			default:
				log.error "Action ${action} not supported"
				throw new RuntimeException("Action not supported")
		}
		
	}
	
}