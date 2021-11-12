package br.ufg.inf.adapter.tests

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
	
	
	
	static int numberElements = 0;
	
	
	

	public static void main(String[] args) {
		
		numberElements = Integer.parseInt(JOptionPane.showInputDialog("Quantity of elements:"));
		
		
	}
	
	
	
}
