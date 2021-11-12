package br.inf.ufg.mddsm.controller.script;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.codehaus.commons.compiler.CompileException;

import br.inf.ufg.mddsm.controller.img.Association;
import br.inf.ufg.mddsm.controller.img.DSC;
import br.inf.ufg.mddsm.controller.img.Executor;
import br.inf.ufg.mddsm.controller.img.IMRepository;
import br.inf.ufg.mddsm.controller.img.IntentModel;
import br.inf.ufg.mddsm.controller.img.NaiveGenerator;
import br.inf.ufg.mddsm.controller.img.NaiveSelector;
import br.inf.ufg.mddsm.controller.img.Negotiate;
import br.inf.ufg.mddsm.controller.img.ProcedureRepository;
import br.inf.ufg.mddsm.controller.img.Type;
import br.ufg.inf.mddsm.synthesis.Command;
import br.inf.ufg.mddsm.controller.img.NaiveValidator;

/*
 * Class responsible for insert operational semantics
 */
public class ScriptProcessor {
	
	static List<String> commands;
	static ArrayList<IntentModel> matchingModels = null;
	static ArrayList<IntentModel> validModels = null;
	static IntentModel bestModel = null;
	
	static IMRepository IMrepository = IMRepository.getInstance();
	
	static boolean debug = false;
	
	/*public void process(List<String> commands) {
		this.commands = commands;
		System.out.println("Processing script...");
		
		DSC dsc = new DSC("Send", Type.OPER);
		
		generateIMs(dsc);
	}*/
	
	public static String process(String dsCommand) {
		
		//System.out.println("Processing commad: "+dsCommand);
		
		DSC dscInit = new DSC(dsCommand, Type.OPER);
		
		return generateIMs(dscInit);
		
	}
	
	public static String process (DSC dsc) {
		//System.out.println("Processing commad: "+dsc.getName());
		
		DSC dscInit = dsc;
		
		return generateIMs(dscInit);
	}
	
	public static String generateIMs(DSC dsc) {
		
		System.out.println("Generating IMs...");
		
		// Get initial DSC
		DSC initialDSC = dsc;

		if(debug) System.out.println("DSC initial: " + initialDSC.getName());

		// Find all models which match command
		matchingModels = (new NaiveGenerator()).generateModels(initialDSC);

		// Find valid models based on user preferences
		validModels = (new NaiveValidator()).validateModels(matchingModels, dsc);

		// Find the best model based on cost
		bestModel = (new NaiveSelector()).getBestModel(validModels);

		IMrepository.addIM(bestModel);

		printIMs(matchingModels, bestModel);
		
		return bestModel.getId();
			
	}
	
	public static void generateIMsOLD(DSC dsc) {
	
		System.out.println("Generating IMs...");
		
		Iterator<String> i = commands.iterator();
		
		while(i.hasNext()) {
		
			// Get initial DSC
			DSC initialDSC = new DSC(i.next(), Type.OPER);
			
			System.out.println("DSC initial: "+initialDSC.getName());
			
			// Find all models which match command
			matchingModels = (new NaiveGenerator()).generateModels(initialDSC);
			
			// Find valid models based on user preferences
			validModels = (new NaiveValidator()).validateModels(matchingModels, dsc);
			
			// Find the best model based on cost
			bestModel = (new NaiveSelector()).getBestModel(validModels);
		
			IMrepository.addIM(bestModel);
			
			printIMs(matchingModels, bestModel);
			
		}
		
	}
	
	public void executeModel(IntentModel bestModel) {
		System.out.println("Beginnning Model Execution");
		
		try {
			(new Executor()).executeModel(bestModel, new Negotiate("System.out.println(\"Precondition executing...\"); return true;"));
		} catch (CompileException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void printIMs(ArrayList<IntentModel> matchingModels, IntentModel bestModel) {
		// Format and print report
		System.out.println("We generated " + matchingModels.size() + " models");
		System.out.println();
					
		if (matchingModels.size() > 0)
			System.out.println("The best model is:\n" + bestModel.prettyPrinter());
			//System.out.println("The best model is:\n" + bestModel.prettyPrinter());
			
					
		if(debug) System.out.println("\n\nThe full list of models:\n");
		if(debug)
			for (int k = 0; k < matchingModels.size(); k++){
				System.out.println(matchingModels.get(k).prettyPrinter());
			}
	}
	
	public void addNFProperties() {
		
	}
	
}
