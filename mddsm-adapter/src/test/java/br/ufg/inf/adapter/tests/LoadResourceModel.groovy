package br.ufg.inf.adapter.tests

import br.ufg.inf.mddsm.adapter.emf.EmfModelHandler
import br.ufg.inf.mddsm.adapter.emf.ModelHandler

import br.ufg.inf.mddsm.adapter.resources.ResourceRepository

import iscadapter.IscadapterPackage
import iscadapter.IscadapterFactory
import iscadapter.impl.*
import iscadapter.ISCResource
import iscadapter.InterScityAdapter

/*import java.io.OutputStream
import java.io.FileOutputStream
import java.io.File*/

//import javax.swing.JOptionPane

class LoadResourceModel {
	
	
	static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model/metamodel/adapter-model"
	static ModelHandler modelHandler = new EmfModelHandler()
	
	static InterScityAdapter adapter;

	public static void main(String[] args) {
		
		println("test ...")
		loadMetaModels();
		
	}
	
	static void loadMetaModels() {
		
		println("Loading metamodel...")
		
		def model = "$MODELS_PATH/slml-adapter.xmi"
		
		def resModel = modelHandler.load(model.toURI(), IscadapterPackage.eNS_URI, IscadapterPackage.eINSTANCE);
		
		adapter = (InterScityAdapter) resModel.getContents().get(0)
		
		println(adapter)
		
		createResourceRepository();
		
		println("Metamodels ready!")
		
	}
	
	static void createResourceRepository() {
		
		println("Generating model...")
		
		IscadapterFactory factory = IscadapterFactory.eINSTANCE
		
		ResourceRepository repository = ResourceRepository.getInstance()
		
		println("Quantity of resources: "+adapter.getResources().size())
		
		int i=0;
		adapter.getResources().each {
			repository.addResource(adapter.getResources().get(i))
			i++
		}
		
		println repository.printRepository()
		
		ISCResource res = repository.getResource("a")
		
		println res.getComposition().toString()
		
		println("model generated!")
	}
	
}
