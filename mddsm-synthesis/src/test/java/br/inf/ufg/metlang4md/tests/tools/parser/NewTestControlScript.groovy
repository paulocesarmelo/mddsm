package br.inf.ufg.metlang4md.tests.tools.parser

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.impl.EAttributeImpl
import org.eclipse.emf.ecore.impl.EcorePackageImpl
import org.junit.Ignore
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.compare.AttributeChange

import groovy.time.*;

import br.inf.ufg.mddsm.controller.manager.MainManager
import br.inf.ufg.mddsm.controller.img.LoadDSCs

import br.ufg.inf.mddsm.synthesis.Command
import br.ufg.inf.mddsm.synthesis.CommandAction
import br.ufg.inf.mddsm.synthesis.ControlScript
import br.ufg.inf.mddsm.synthesis.api.EmfModelComparator
import br.ufg.inf.mddsm.synthesis.api.EmfModelHandler
import br.ufg.inf.mddsm.synthesis.api.ModelComparator
import br.ufg.inf.mddsm.synthesis.api.ModelHandler
import m4md.EActor
import m4md.EDomainSpecificType
import m4md.EDomainSpecificEntity
import m4md.EDomainSpecificCommand
import testing.BaseClass
import testing.Sandbox
import testing2.Testing2Package
import mgridml.MgridmlPackage

import javax.swing.JOptionPane

import java.util.Iterator;

class NewTestControlScript extends GroovyTestCase {
	// System.getProperty("user.dir") == $PROJECT-PATH
	//static final String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model"
	String MODELS_PATH = System.getProperty("user.dir") + "-model/src/main/resources/model"
	static private ModelHandler modelHandler = new EmfModelHandler()
	
	MainManager controllerManager = new MainManager()
	
	void testGenerateValidScript(String appModelName) {
		
		//setup() 
		
		//String appModelName = JOptionPane.showInputDialog("App model name: ");
		
		//def timeStart = new Date();
		
		//println("\n################# SYNTHESIS LAYER #################\n")
			
		def oldModel = "$MODELS_PATH/metamodel/mgridml-model/app0.xmi"
		def newModel = "$MODELS_PATH/metamodel/mgridml-model/"+appModelName+".xmi"
		
		def resOldModel = modelHandler.load(oldModel.toURI(), MgridmlPackage.eNS_URI, MgridmlPackage.eINSTANCE)
		def resNewModel = modelHandler.load(newModel.toURI(), MgridmlPackage.eNS_URI, MgridmlPackage.eINSTANCE)
		
		ModelComparator modelComparator = new EmfModelComparator(resOldModel)
		
		def diffs = modelComparator.compares(resNewModel)
		
		ControlScript script = new ControlScript(diffs)
		
		//println script
		
		/*println "Sending script to controller layer...\n"
		*/
		//def timeStart = new Date();
		controllerManager.process(script) 

		//def timeStop = new Date();
		
		//TimeDuration duration = TimeCategory.minus(timeStop, timeStart)
		//println duration.toMilliseconds()
		
		//println "End of processing!"
	}

	@Ignore
	void setup() {
		println "Setuping ..."
		//config the layers model
		
		//Load DSC
		LoadDSCs.loadDSC()
	}
}

















