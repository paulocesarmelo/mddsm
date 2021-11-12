package br.inf.ufg.mddsm.controller.script

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.compare.AttributeChange


import br.inf.ufg.mddsm.controller.img.DSC
import br.inf.ufg.mddsm.controller.img.IMRepository
import br.inf.ufg.mddsm.controller.img.Type
import br.inf.ufg.mddsm.controller.img.IntentModel;

import br.ufg.inf.mddsm.synthesis.Command
import br.ufg.inf.mddsm.synthesis.CommandAction
import br.ufg.inf.mddsm.synthesis.ControlScript
import metalang4md.EActor
import metalang4md.EItem

import m4md.EDomainSpecificType
import m4md.EDomainSpecificEntity
import m4md.EDomainSpecificCommand



class ScriptInterpreter2{
	
	static IMRepository IMrepository = IMRepository.getInstance();
	String IMid;
	IntentModel im;
	private static Logger log = LoggerFactory.getLogger(ScriptManager.class);
	
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
		
		log.trace("interpret(script:{})", script);
		
		println("Interpreting script... ")
		
		List<Command> commands = script.commands
				
		/*for(cmd in commands){
			extractDSCommand(cmd)
		}*/
		extractDSCommand(commands)
		
	}
	
	public void extractDSCommand(List<Command> commands) {
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