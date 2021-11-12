package br.inf.ufg.metlang4md.tests.tools.parser

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

import mgridml.MgridmlPackage
import mgridml.MgridmlFactory
import mgridml.*
import mgridml.impl.*

import m4md.*

import java.io.OutputStream
import java.io.FileOutputStream
import java.io.File

import javax.swing.JOptionPane

class GenerateModels4Test {
	
	
	static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model/metamodel/mgridml-model"
	//static ModelHandler modelHandler = new EmfModelHandler()
	
	
	static String name = ""
	static String packageName = ""
	
	static int numberElements = 0;
	
	static String domainName = ""
	

	public static void main(String[] args) {
		
		numberElements = Integer.parseInt(JOptionPane.showInputDialog("Quantity of elements:"));
		
		loadMetaModels();
		
	}
	
	static void loadMetaModels() {
		
		println("Loading metamodels...")
		
		//def dsml = MgridmlPackage.eINSTANCE
		def mgridMetamodel = MgridmlPackage.eINSTANCE

		
		/*def resDSML = load(dsml.toURI(), Testing2Package.eNS_URI, Testing2Package.eINSTANCE)
		
		dsk = resDSK.getContents().get(0)
		testing = (TestingSchema) resDSML.getContents().get(0)*/
		
		generateModel();
		
		//println("Metamodels ready!")
		
	}
	
	static void generateModel() {
		
		println("Generating model...")
		
		MgridmlPackage.eINSTANCE
		
		MgridmlFactory factory = MgridmlFactory.eINSTANCE
		
		MGridSchema schema = new MGridSchemaImpl();
		
		MGridControlSchema cs = factory.createMGridControlSchema();
		
		MGridDataSchema ds = factory.createMGridDataSchema();
		
		ds.setCs(cs);
		
		int numberElementsTotal = numberElements/3
		
		//if(numberElements % 2 == 1)
			//numberElementsTotal++
		
		println("Number elements partial: "+numberElementsTotal)
		
		for(int i=0; i < numberElementsTotal; i++) {
			LoadController lc = factory.createLoadController()
			lc.setCardinality(0)
			lc.setCommandPriority(0)
			lc.setControllerID("lc"+(i+1));
			lc.setCritical(CriticalEnum.ANY)
			lc.setDescription("Load Controller fot Test")
			lc.setName("LoadController"+(i+1))
			lc.setKindInteraction(ECoordinationBehavior.LOCAL)
			lc.setLowerWattage(110)
			lc.setUpperWattage(220)
			
			LoadDeviceType ldt = factory.createLoadDeviceType()
			ldt.setCardinality(ECardinality.ONE)
			ldt.setCritical(CriticalEnum.SENSITIVE)
			ldt.setInteractionBehavior(EInteractionBehavior.SYNC)
			ldt.setTypeName("SeasonalDevice"+(i+1))
			ldt.setSoTypeID("ldt"+(i+1))
			ldt.setUsage(UsageEnum.HVAC)
			
			lc.getLoadDeviceType().add(ldt)
			
			cs.getActor().add(lc)
			
			LoadDevice ld = factory.createLoadDevice()
			ld.setArisingBehavior(EArising.STATIC)
			ld.setCommandPriority(0)
			ld.setControl(ControlEnum.CONTROLLABLE)
			ld.setCritical(CriticalEnum.SENSITIVE)
			ld.setDeviceName("Heater"+(i+1))
			ld.setPlantE_ID("ld"+(i+1))
			ld.setType(ldt)
			ld.setWattage(120)
			ld.setOperational(false)
			
			/*DeviceProperty dp = factory.createDeviceProperty()
			dp.setAttribute("temp")
			dp.setValue("75")
			
			ld.getDeviceProperty().add(dp)*/
			
			ds.getItem().add(ld)
			
		}
		
		/*if(numberElements % 2 == 1) {
			ds.getItem().removeLast()
			
		}*/
		
		schema.setMgridModelID("mgrid1")
		schema.setCs(cs)
		schema.setDs(ds)
		
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());	
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(MODELS_PATH+"/appTest"+numberElements+".xmi")); //change the name according of preferences of users
		
		resource.getContents().add(schema);
		
		println(resource.toString())
		
		try {
			OutputStream out = new FileOutputStream(new File(MODELS_PATH+"/appTest"+numberElements+".xmi"))
			resource.save(out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		println("model generated!")
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
