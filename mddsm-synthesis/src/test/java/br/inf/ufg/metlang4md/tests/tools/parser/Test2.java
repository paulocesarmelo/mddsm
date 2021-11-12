package br.inf.ufg.metlang4md.tests.tools.parser;

import br.ufg.inf.mddsm.synthesis.api.ModelComparator;
import br.ufg.inf.mddsm.synthesis.api.ModelHandler;
import testing.TestingPackage;

import java.io.File;
import java.util.List;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.ecore.resource.Resource;

import br.ufg.inf.mddsm.synthesis.ControlScript;
import br.ufg.inf.mddsm.synthesis.api.EmfModelComparator;
import br.ufg.inf.mddsm.synthesis.api.EmfModelHandler;

public class Test2{
	
	static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model";
	static private ModelHandler modelHandler = new EmfModelHandler();
	
	
    public static void main(String[] args) {
        
        //TestControlScript tcs = new TestControlScript()
        
        Test2.testGenerateValidScript();
        System.out.println( "generated!");
        
    }
	
	static void testGenerateValidScript() {
		System.out.println("GenerateValidScript");
		
		File oldModel = new File(MODELS_PATH+"/metamodel/testing/SandboxToCreateScript.xmi");
		File newModel = new File(MODELS_PATH+"/metamodel/testing/SandboxToCreateScript2.xmi");

		Resource resOldModel = modelHandler.load(oldModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE);
		Resource resNewModel = modelHandler.load(newModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE);
		ModelComparator modelComparator = new EmfModelComparator(resOldModel);
		
		List<Diff> diffs = modelComparator.compares(resNewModel);
		ControlScript script = new ControlScript(diffs);

		System.out.println(script);

	}
    
    
}