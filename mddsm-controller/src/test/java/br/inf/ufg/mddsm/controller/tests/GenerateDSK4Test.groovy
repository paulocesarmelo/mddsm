package br.inf.ufg.mddsm.controller.tests

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.impl.EClassImpl
import org.eclipse.emf.ecore.impl.EGenericTypeImpl
import org.eclipse.emf.ecore.EClassifier

import br.inf.ufg.mddsm.controller.emf.EmfModelHandler
import br.inf.ufg.mddsm.controller.emf.ModelHandler
import br.inf.ufg.mddsm.controller.img.Type
import dsk.Dsk
import dsk.EDSC
import dsk.EDSEntity
import dsk.impl.DskImpl
import dsk.DskPackage
import dsk.DskFactory
import dsk.EProcedure
import dsk.*
import testing2.Testing2Package
import testing2.TestingSchema
import m4md.EDomainSpecificEntity
import m4md.EActor

import mgridml.MgridmlPackage

import java.io.OutputStream
import java.io.FileOutputStream
import java.io.File

import javax.swing.JOptionPane
import java.util.LinkedList

class GenerateDSK4Test {
	
	
	static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model"
	//static ModelHandler modelHandler = new EmfModelHandler()
	static Dsk dsk
	static TestingSchema testing
	
	static String dsmlName = ""
	static String packageName = ""
	
	static String domainName = ""
	
	static int numberProcs = 0;

	public static void main(String[] args) {
		
		domainName = JOptionPane.showInputDialog("Informe o nome do domínio para gerar o DSK:");
		
		numberProcs = Integer.parseInt(JOptionPane.showInputDialog("Number of procedures:"));
		
		loadMetaModels();
		
	}
	
	static void loadMetaModels() {
		
		println("Loading metamodels...")
		
		List<String> entityNames = new LinkedList<String>()
		//def dsml = Testing2Package.eINSTANCE
		def dsml = MgridmlPackage.eINSTANCE
		def dskMetamodel = DskPackage.eINSTANCE
		
		println(dsml.eContents())
		
		
		for(content in dsml.eContents()){
			
			if( content instanceof EClassImpl ) {
				if ( content.getEAllSuperTypes().name[0].equals("EDomainSpecificEntity") ) {
					println("name: "+content.name)
					entityNames.add(content.name)
				}
			}
			
					
		}
		
		generateDSK(entityNames)
		
		//println("Metamodels ready!")
		
	}
	
	static void generateDSK(List<String> entityName) {
		
		println("Generating DSK...")
		
		DskPackage.eINSTANCE
		
		DskFactory factory = DskFactory.eINSTANCE
		
		Dsk newDsk = new DskImpl()
		//factory.createdsk()
		
		newDsk.setDomain(domainName)
		
		for(name in entityName) {
	
			EDSEntity entity = factory.createEDSEntity()
			
			entity.setName(name)
			
			newDsk.getEntities().add(entity)

		}
		
		EDSC[] dscs = new EDSC[4];
		
		for(int i=0; i<4;i++) {
			dscs[i] = factory.createEDSC();
			if(i==0) {
				dscs[i].setEntity(newDsk.getEntities().get(11))
			}else {
				dscs[i].setEntity(newDsk.getEntities().get(8))
			}
			dscs[i].setKind(EDSCType.OPER)
			dscs[i].setName("DSC"+(i+1))
			EDSEvent event = factory.createEDSEvent()
			event.setId("ev00"+(i+1))
			event.setName("Event"+(i+1))
			event.setType(EEventType.TOP)
			event.setMetaCmd(EMetaCmdType.ADD)
			dscs[i].getCondition().add(event)
			
			newDsk.getEvents().add(event)
			newDsk.getDscs().add(dscs[i])
		}
		
		EDSC dsc = factory.createEDSC();
		dsc.setEntity(newDsk.getEntities().get(12))
		dsc.setKind(EDSCType.OPER)
		dsc.setName("DSCTest")
		EDSEvent event = factory.createEDSEvent()
		event.setId("evTeste")
		event.setName("EventTest")
		event.setType(EEventType.TOP)
		event.setMetaCmd(EMetaCmdType.NONE)
		dsc.getCondition().add(event)
		newDsk.getEvents().add(event)
		newDsk.getDscs().add(dsc)
		
		int j=0;
		for(int i=0; i<numberProcs*0.6; i++) {
			EProcedure proc = factory.createEProcedure();
			
			if(i == numberProcs*0.3) {
				j++;
			}
				
			proc.setClassifier(dscs[j]);
			proc.setId("0"+(i+1))
			proc.setName("Procedure"+(i+1))
			proc.getDependencies().add(dscs[j+1])
			
			EExecutionUnit eu = factory.createEExecutionUnit()
			eu.setBody("return true;")
			eu.setId("eu"+(i+1))
			
			proc.getImpl().add(eu)
			
			newDsk.getProcedures().add(proc)
		}
		
		j++;
		for(int i=numberProcs*0.6; i<numberProcs; i++) {
			EProcedure proc = factory.createEProcedure();
			
			if(i == numberProcs*0.8)
				j++;
			
			proc.setClassifier(dscs[j]);
			proc.setId("0"+(i+1))
			proc.setName("Procedure"+(i+1))
			
			if(j<3)
				proc.getDependencies().add(dscs[j+1])
			
			EExecutionUnit eu = factory.createEExecutionUnit()
			eu.setBody("return true;")
			eu.setId("eu"+(i+1))
				
			proc.getImpl().add(eu)
				
			newDsk.getProcedures().add(proc)
		}
		
		for(int i=0; i<9*numberProcs; i++) {
			EProcedure proc = factory.createEProcedure();
			proc.setClassifier(dsc);
			proc.setId("test")
			proc.setName("ProceudreTest"+(i+1))
			
			EExecutionUnit eu = factory.createEExecutionUnit()
			eu.setBody("return false;")
			eu.setId("euTest"+(i+1))
			
			proc.getImpl().add(eu)
			
			newDsk.getProcedures().add(proc)
		}
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(MODELS_PATH+"/dsk4"+domainName+numberProcs+".xmi")); //change the name according of preferences of users
		
		resource.getContents().add(newDsk);
		
		println(resource.toString())
		
		try {
			OutputStream out = new FileOutputStream(new File(MODELS_PATH+"/dsk4"+domainName+numberProcs+".xmi"))
			resource.save(out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		println("DSK generated!")
	}
	
	static void generateDSKold(List<EEnumLiteral> cmdList) {
		
		println("Generating DSK...")
		
		DskPackage.eINSTANCE
		
		DskFactory factory = DskFactory.eINSTANCE
		
		Dsk newDsk = new DskImpl() 
		//factory.createdsk()
		
		newDsk.setDomain(domainName)
		
		for(cmd in cmdList) {
			EDSC dsc = factory.createEDSC()
			
			dsc.setName(cmd.toString())
			dsc.setKind(Type.OPER)
			
			newDsk.getDscs().add(dsc)
		}
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());	
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(MODELS_PATH+"/dsk4"+domainName+".xmi")); //change the name according of preferences of users
		
		resource.getContents().add(newDsk);
		
		println(resource.toString())
		
		try {
			OutputStream out = new FileOutputStream(new File(MODELS_PATH+"/dsk4"+domainName+".xmi"))
			resource.save(out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		println("DSK generated!")
	}
	
	Resource load(URI filepath, String eNS_URI='', EPackage ePackageInstance=null ) {
		EPackage.Registry.INSTANCE.put(eNS_URI, ePackageInstance)
		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE
		Map<String, Object> m = reg.getExtensionToFactoryMap()
		m.put("xmi", new XMIResourceFactoryImpl())

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl()

		// Get the resource
		def emfUri = org.eclipse.emf.common.util.URI.createURI(filepath.toString())
		Resource resource = resSet.getResource(emfUri, true)
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		def root =  resource.getContents()?.get(0)
		if(! root) {
			throw new RuntimeException("Cannot load model from $filepath")
		}

		return resource

	}
	
}
