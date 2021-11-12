package br.inf.ufg.mddsm.controller.tests

import org.eclipse.emf.common.util.EList
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import base.Manager
import br.inf.ufg.mddsm.controller.emf.EMFLoader
import br.inf.ufg.mddsm.controller.emf.EmfModelHandler
import br.inf.ufg.mddsm.controller.handlers.EventManager
import br.inf.ufg.mddsm.controller.img.DSC
import br.inf.ufg.mddsm.controller.img.ProcedureRepository
import br.inf.ufg.mddsm.controller.img.Procedure
import br.inf.ufg.mddsm.controller.manager.MainManager
import br.inf.ufg.mddsm.controller.manager.ManagerFacade
import br.inf.ufg.mddsm.controller.emf.ManagerFactory
import br.inf.ufg.mddsm.controller.emf.ModelHandler
import br.inf.ufg.mddsm.controller.resource.ResourceManager
import br.ufg.inf.mddsm.synthesis.ControlScript
import br.inf.ufg.mddsm.controller.script.ScriptInterpreter
import dsk.Dsk
import dsk.EDSCType
import br.inf.ufg.mddsm.controller.img.DSEvent
import br.inf.ufg.mddsm.controller.img.DSEntity
import br.inf.ufg.mddsm.controller.img.DSCRepository
import br.inf.ufg.mddsm.controller.img.Type


class TestLoadDSCs {
    
        static EventManager eventManager
        static MainManager mainManager
        static ResourceManager resourceManager
        static ProcedureRepository repo
        static ModelHandler modelHandler = new EmfModelHandler();
		
		static ArrayList<Procedure> procedures
		static ArrayList<DSC> dependencies
		static Dsk dsk
		static DSC classifier
		
		static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model"
		private static Logger log = LoggerFactory.getLogger(TestLoadDSCs.class);
        @BeforeAll
        //static void main(String[] args) {
			
		static void loadDSC() {
             
			log.trace("loadDSC()");
            def model = "$MODELS_PATH/dsk4testing2.xmi"
            
            //def resModel = modelHandler.load(model.toURI(), DscPackage.eNS_URI, DscPackage.eINSTANCE)
			
			dsk = modelHandler.load(model.toURI())
			
			//DSK dsk = (DSK) resModel
           	
			//EList list = dsk.getProcedures()					
			
			createDSCRepository()
			createProceduresRepository()
			
			//new ScriptInterpreter().interpret(new ControlScript())             
            
        }
		
		static void createDSCRepository() {
			log.trace("createDSCRepository");
			DSCRepository repo = DSCRepository.getInstance()
			ArrayList<DSC> parameters = new ArrayList<DSC>()
			int i = 0
			DSC dsc
			Type type
			dsk.getDscs().each { 
				println("inserting "+dsk.getDscs().get(i).getName())
				
				if(dsk.getDscs().get(i).getKind().value)
					type = Type.OPER
				else
					type = Type.ATTR
				
				dsc = new DSC(dsk.getDscs().get(i).getName(), type);
				dsc.setEntity(new DSEntity(dsk.getDscs().get(i).getEntity()))
				dsc.setEvents((ArrayList<DSEvent>) dsk.getDscs().get(i).getCondition()) 
				
				int j = 0
				dsk.getDscs().get(i).getParameters().each { 
					parameters.add((DSC) dsk.getDscs().get(i).getParameters().get(j++).getDsc())
				}
				
				dsc.setParameters(parameters)
				
				repo.addDSC(dsc)
				repo.addDSC(dsc.getEntity().getName(), dsc)
				
				i++
				
			}
			
			println ("DSC Repository created ("+repo.getAllDSCs().size+")...")
			
			
		}
		
		static void createProceduresRepository() {
			log.trace("createProcedureRepository()");
			println ("Creating repository ... ")
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
				println( procedure.getName() )
				int j=0
				while(j < dependencies.size) 
					println("Dependencies: "+dependencies.get(j++).getName())
				
				i++
				repo.addProcedure(procedure)
			}
			
			ProcedureRepository.instance = repo
			
			/*			
			Procedure procedure1 = new Procedure("0001", "SendBasic1", sendDSC, dependencies1);*/
			println ("Repository created ("+repo.getAllProcedures().size+")...")
		}
}
    
    