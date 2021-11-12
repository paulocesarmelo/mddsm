package br.inf.ufg.metlang4md.tests.tools.parser

import br.ufg.inf.mddsm.synthesis.api.ModelComparator
import br.ufg.inf.mddsm.synthesis.api.ModelHandler
import testing.TestingPackage
import br.ufg.inf.mddsm.synthesis.ControlScript
import br.ufg.inf.mddsm.synthesis.api.EmfModelComparator
import br.ufg.inf.mddsm.synthesis.api.EmfModelHandler

class Test{
	
	static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model"
	static private ModelHandler modelHandler = new EmfModelHandler()
	
	
    static void main(String[] args) {
        
        //TestControlScript tcs = new TestControlScript()
        
        Test.testGenerateValidScript()
        println "generated!"
        
    }
	
	static void testGenerateValidScript() {
		println ("GenerateValidScript")
		
		def oldModel = "$MODELS_PATH/metamodel/testing/SandboxToCreateScript.xmi"
		def newModel = "$MODELS_PATH/metamodel/testing/SandboxToCreateScript2.xmi"

		def resOldModel = modelHandler.load(oldModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)
		def resNewModel = modelHandler.load(newModel.toURI(), TestingPackage.eNS_URI, TestingPackage.eINSTANCE)
		ModelComparator modelComparator = new EmfModelComparator(resOldModel)
		
		def diffs = modelComparator.compares(resNewModel)
		ControlScript script = new ControlScript(diffs)

		println script

	}
    
    
}