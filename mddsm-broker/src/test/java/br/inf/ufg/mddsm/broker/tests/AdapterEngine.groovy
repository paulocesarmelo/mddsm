package br.inf.ufg.mddsm.broker.tests

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

import iscadapter.InterScityAdapter
import iscadapter.IscadapterFactory
import iscadapter.impl.InterScityAdapterImpl

import adapter.EAdapter
import adapter.EDSCmd
import adapter.EEntity
import adapter.impl.EDSCmdImpl
import adapter.impl.EEntityImpl

import dsk.Dsk
import dsk.EDSC
import dsk.EDSCType
import dsk.EDSEntity
import dsk.impl.EDSEntityImpl
import dsk.impl.DskImpl
import dsk.EDSEvent
import dsk.impl.EDSEventImpl
import dsk.DskPackage
import dsk.DskFactory

import br.inf.ufg.mddsm.controller.emf.ModelHandler
import br.inf.ufg.mddsm.controller.emf.EmfModelHandler
import br.inf.ufg.mddsm.controller.img.Type

import m4md.EDomainSpecificEntity
import m4md.impl.EDomainSpecificEntityImpl
import m4md.EActor

import mgridml.MgridmlPackage

import java.io.OutputStream
import java.io.FileOutputStream
import java.io.File
import javax.swing.JOptionPane
import java.util.LinkedList
import java.util.Set
import java.util.HashSet
import java.util.HashMap

/*
 * This class is responsible for generate adapter model base including:
 * - DSC
 * - Entity
 */
class AdapterEngine {
	
	
	static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model"
	
	static Dsk dsk
	static ModelHandler modelHandler = new EmfModelHandler();
	
	static String dsmlName = ""
	static String packageName = ""
	
	static String platformName = ""
	
	static String domainName = ""
	
	static final HOME_PATH = "/home/paulo/Documentos/Repository/principal/mddsm/mddsm-controller"
	

	public static void main(String[] args) {
		
		platformName = JOptionPane.showInputDialog("Informe o nome da plataforma para gerar o Adapter:");
		
		domainName = JOptionPane.showInputDialog("Informe o nome domínio:");
		
		generate();
		
	}
	
	static void generate() {
		loadDSCs()
	}
	
	static void loadDSCs () {
		
		println("Loading dscs...")
		
		String MODELS_PATH = "$HOME_PATH-model/src/main/resources/model"
		
		def model = "$MODELS_PATH/dsk4"+domainName+".xmi"
		
		dsk = modelHandler.load(model.toURI())
		
		List<EDSC> dscs = new LinkedList<EDSCmd>()
		List<EDSEntity> entities = new LinkedList<EEntity>();
		
		
		EDSCmdImpl dsc = new EDSCmdImpl()
		
		int i=0
		
		Type type
		dsk.getDscs().each {
			println("seting entity");
			
			println("inserting "+dsk.getDscs().get(i).getName())
			
			if(dsk.getDscs().get(i).getKind().value)
				dsc.setKind(EDSCType.OPER)
			else
				dsc.setKind(EDSCType.ATTR)
			
			dsc.setName(dsk.getDscs().get(i).getName())
		
			EEntityImpl entity = new EEntityImpl()
			
			int j=0
			dsk.getEntities().each {
				if(dsk.getEntities().get(j).getName().equals(dsk.getDscs().get(i).getEntity().getName())){
					entity.setName(dsk.getEntities().get(j).getName())
					entity.setCommandPriority(dsk.getEntities().get(j).getCommandPriority())
					entities.add(entity)
					dsc.setEntity(entity)
				}
				j++
			}
			
			List<EDSEntity> entitiesTemp = new LinkedList<EEntity>();
			
			dsk.getEntities().each {
				entity = new EEntityImpl();
				entity.setName(dsk.getEntities().get(i).getName())
				entity.setCommandPriority(dsk.getEntities().get(i).getCommandPriority())
				entitiesTemp.add(entity)
				i++
			}
			
			entitiesTemp = removeDuplicates(entities, entitiesTemp)
			
			entities.addAll(entitiesTemp)
			
			println("seting events");
			
			/*ArrayList<EDSEvent> events = new ArrayList<EDSEvent>()
			for(event in dsk.getDscs().get(i).getCondition()) {
				events.add(event)
			}
			dsc.getCondition().addAll(events)*/
			
			dscs.add(dsc)
			i++
		}
		
		println("DSCs created with "+dscs.size()+ " elements")
		
		generateAdapterByDSC(dscs, entities)
	}
	
	
	static List<EDSEntity>  removeDuplicates(List<EDSEntity> entities1, List<EDSEntity> entities2) {
		HashMap<String, EDSEntity> map = new HashMap<String, EDSEntity>()
		HashMap<String, EDSEntity> map2 = new HashMap<String, EDSEntity>()
		
		int i=0;
		
		entities1.each{
			 map.put(entities1.get(i).getName(), entities1.get(i))
		}
		
		i=0
		 println(entities2.size())
		 entities2.each {
			 if(map.get(entities2.get(i).getName()) == null)
				 map2.put(entities2.get(i).getName(), entities2.get(i))
				 
			i++
		 }
	
		 entities2.clear()
		 entities2.addAll(map2.values())
		
		/*Set<String> set = new HashSet<>(entities);
		entities.clear();
		entities.addAll(set);*/
		 println(entities2.size())
		
		return entities2;
	}
	
	static void generateAdapterByDSC(List<EDSCmd> DSCs, List<EEntity> entities) {
		
		println("generating adapter base...")
		
		IscadapterFactory factory = IscadapterFactory.eINSTANCE
		
		EAdapter newAdapter = new InterScityAdapterImpl()
		
		newAdapter.setName(domainName)
		
		newAdapter.getDscs().addAll(DSCs)
		newAdapter.getEntity().addAll(entities)
		
		println("adapter base gemerated with " + newAdapter.getDscs().size()+"...")
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(MODELS_PATH+"/"+domainName+"-adapter.xmi")); //change the name according of preferences of users
		
		resource.getContents().add(newAdapter);
		
		println(resource.toString())
		
		try {
			OutputStream out = new FileOutputStream(new File(MODELS_PATH+"/"+domainName+"-adapter.xmi"))
			resource.save(out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
