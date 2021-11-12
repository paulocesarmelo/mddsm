package br.inf.ufg.mddsm.controller.img

import org.eclipse.emf.common.util.EList

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import base.Manager
import br.inf.ufg.mddsm.controller.emf.EMFLoader
import br.inf.ufg.mddsm.controller.emf.EmfModelHandler
import br.inf.ufg.mddsm.controller.handlers.EventManager
import br.inf.ufg.mddsm.controller.manager.MainManager
import br.inf.ufg.mddsm.controller.manager.ManagerFacade
import br.inf.ufg.mddsm.controller.emf.ManagerFactory
import br.inf.ufg.mddsm.controller.emf.ModelHandler
import br.inf.ufg.mddsm.controller.resource.ResourceManager
import br.ufg.inf.mddsm.synthesis.ControlScript
import br.inf.ufg.mddsm.controller.script.ScriptInterpreter
import dsk.Dsk

import javax.swing.JOptionPane


class LoadDSCs {
    
        static EventManager eventManager
        static MainManager mainManager
        static ResourceManager resourceManager
        static ProcedureRepository repo
        static ModelHandler modelHandler = new EmfModelHandler();
		
		static ArrayList<Procedure> procedures
		static ArrayList<DSC> dependencies
		static Dsk dsk
		static DSC classifier
		
		//static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model"
		static final PAULO_PATH = "/home/paulo/Documentos/Repository/principal/mddsm/mddsm-controller"
		
		private static Logger log = LoggerFactory.getLogger(LoadDSCs.class);
		
		private static boolean debug = false;
        
        //static void main(String[] args) {
			
		static void loadDSC() {
             
			String MODELS_PATH = "$PAULO_PATH-model/src/main/resources/model"
			
			if(debug) log.trace("loadDSC()");
			//println "$MODELS_PATH"
			String numberOfProc = JOptionPane.showInputDialog("Number of procedures for test: ");
            def model = "$MODELS_PATH/dsk4mgrid"+numberOfProc+".xmi"
            
            //def resModel = modelHandler.load(model.toURI(), DscPackage.eNS_URI, DscPackage.eINSTANCE)
			
			dsk = modelHandler.load(model.toURI())
			
			//DSK dsk = (DSK) resModel
           	
			//EList list = dsk.getProcedures()					
			
			createDSCRepository()
			createRepository()
			
			//new ScriptInterpreter().interpret(new ControlScript())             
            
        }
		
		static void createDSCRepository() {
			//log.trace("createDSCRepository");
			println("Creating DSC Repository...")
			DSCRepository repo = DSCRepository.getInstance()
			ArrayList<DSC> parameters = new ArrayList<DSC>()
			int i = 0
			DSC dsc
			Type type
			dsk.getDscs().each {
				//println("inserting "+dsk.getDscs().get(i).getName())
				
				if(dsk.getDscs().get(i).getKind().value)
					type = Type.OPER
				else
					type = Type.ATTR
				
				dsc = new DSC(dsk.getDscs().get(i).getName(), type);
				//println("seting entity");
				dsc.setEntity(new DSEntity(dsk.getDscs().get(i).getEntity()))
				//println("seting events");
				
				ArrayList<DSEvent> events = new ArrayList<DSEvent>()
				for(event in dsk.getDscs().get(i).getCondition()) {
					events.add(new DSEvent(event))
				}
				dsc.setEvents(events)
				
				//dsc.setEvents((ArrayList<DSEvent>) dsk.getDscs().get(i).getCondition()) NOT USED
				//println("seting parameters");
				int j = 0
				dsk.getDscs().get(i).getParameters().each {
					parameters.add((DSC) dsk.getDscs().get(i).getParameters().get(j++).getDsc())
				}
				
				dsc.setParameters(parameters)
				//println("add dsc on list");
				repo.addDSC(dsc)
				//println("add dsc on map");
				repo.addDSC(dsc.getEntity().getName(), dsc)
				
				i++
				
			}
			
			println ("DSC Repository created ("+repo.getAllDSCs().size+")...")
			
			
		}
		
		static void createRepository() {
			//log.trace("createRepository()");
			println ("Creating Procedure repository ... ")
			ProcedureRepository repo = ProcedureRepository.getInstance()
			int i = 0
			dsk.getProcedures().each {				
				
				dependencies = new ArrayList<DSC>()
				
				ArrayList<DSC> dep = new ArrayList<DSC>()
				dep = (ArrayList<DSC>) dsk.getProcedures().get(i).getDependencies()
				
				int k=0
				while(k < dep.size){
					DSC dscTmp = new DSC(dep.get(k).getName(), Type.OPER)
					dependencies.add(dscTmp)
					k++
				}
				
				//alterar para pegar o tipo do modelo				
				classifier = new DSC(dsk.getProcedures().get(i).getClassifier().getName(), Type.OPER)
					
				Procedure procedure = new Procedure(dsk.getProcedures().get(i).getId(), dsk.getProcedures().get(i).getName(), classifier, dependencies)
				
				ExecutionUnit eu = new ExecutionUnit(dsk.getProcedures().get(i).getImpl().get(0).getId(), dsk.getProcedures().get(i).getImpl().get(0).getBody());
				procedure.setStartEU(eu)
				//println( procedure.getName() )
				int j=0
				//while(j < dependencies.size) 
					//println("Dependencies: "+dependencies.get(j++).getName())
				
				i++
				repo.addProcedure(procedure)
			}
			
			ProcedureRepository.instance = repo
			
			/*			
			Procedure procedure1 = new Procedure("0001", "SendBasic1", sendDSC, dependencies1);*/
			println ("Procedure repository created ("+repo.getAllProcedures().size+")...")
		}
}
    
    