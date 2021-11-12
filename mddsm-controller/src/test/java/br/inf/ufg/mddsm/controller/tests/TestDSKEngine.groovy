package br.inf.ufg.mddsm.controller.tests

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EEnumLiteral

import br.inf.ufg.mddsm.controller.emf.EmfModelHandler
import br.inf.ufg.mddsm.controller.emf.ModelHandler
import br.inf.ufg.mddsm.controller.img.Type
import dsk.Dsk
import dsk.EDSC
import dsk.impl.DskImpl
import dsk.DskPackage
import dsk.DskFactory
import testing2.Testing2Package
import testing2.TestingSchema

import java.io.OutputStream
import java.io.FileOutputStream
import java.io.File

import javax.swing.JOptionPane

class TestDSKEngine {
	
	
	static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model"
	//static ModelHandler modelHandler = new EmfModelHandler()
	static Dsk dsk
	static TestingSchema testing
	
	static String dsmlName = ""
	static String packageName = ""
	
	static String domainName = ""
	

	public static void main(String[] args) {
		
		domainName = JOptionPane.showInputDialog("Informe o nome do domínio para gerar o DSK:");
		
		loadMetaModels();
		
	}
	
	static void loadMetaModels() {
		
		println("Loading metamodels...")
		
		def dsml = Testing2Package.eINSTANCE
		def dskMetamodel = DskPackage.eINSTANCE
		
		
		for(cmd in dsml.getCmdType().getELiterals()) {
			println(cmd.toString())
		}
		
		/*def resDSML = load(dsml.toURI(), Testing2Package.eNS_URI, Testing2Package.eINSTANCE)
		
		dsk = resDSK.getContents().get(0)
		testing = (TestingSchema) resDSML.getContents().get(0)*/
		
		generateDSK(dsml.getCmdType().getELiterals())
		
		println("Metamodels ready!")
		
	}
	
	static void generateDSK(List<EEnumLiteral> cmdList) {
		
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
