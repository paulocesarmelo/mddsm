package br.inf.ufg.mddsm.controller.img;


import java.util.ArrayList;

import org.apache.commons.lang3.SerializationUtils;

import com.rits.cloning.*;
import br.inf.ufg.mddsm.controller.img.ProcedureRepository;
import dsk.EDSC;

public class NaiveGenerator implements Generator{
	
	private static Cloner cloner = new Cloner();
	private boolean debug = false;
	
	public ArrayList<IntentModel> generateModels(DSC initDSC) {
		
		if(debug) System.out.println("Generating models...");
		
		/** Collection to store final set of models */
		ArrayList<IntentModel> matchingModels = new ArrayList<IntentModel>();
		
		/** Get procedures for the current DSC */
		ArrayList<Procedure> matchingProcedures = ProcedureRepository.getInstance().getProceduresWithDSC(initDSC);
		//System.out.println(initDSC.getName() + ": " + matchingProcedures.size() +" procedures associated");
		
		
		if (matchingProcedures.isEmpty()){
			//System.out.println("Procedure repository is empty!");
			return null;
		}
		
		for (int i = 0; i < matchingProcedures.size(); i++){
			if(debug)
				System.out.println(matchingProcedures.get(i).getClass());
			
			/** Temporary collection of models for current level */
			ArrayList<IntentModel> tempMatchingModels = new ArrayList<IntentModel>();
			ArrayList<DSC> dependencies = matchingProcedures.get(i).getDependency();
		
			if(debug) {
				System.out.println("Procedure name: "+ matchingProcedures.get(i).getName());
				System.out.println("Number of dependencies: "+dependencies.size());
			}
			/** If no dependencies, return model with only current procedure */
			if (dependencies.isEmpty()){
				if(debug)
				System.out.println("No dependencies!");
				matchingModels.add(new IntentModel(matchingProcedures.get(i)));
			} else {
				/** If further dependencies, make recursive call, then join */
				ArrayList<IntentModel> subModels = null;
				
				for (int j = 0; j < dependencies.size(); j++){				
					
					if(debug)
						System.out.println(matchingProcedures.get(i).getName() + " is calling: " + dependencies.get(j).getName());
					
					subModels = generateModels(dependencies.get(j));
					
					/** If a procedure is not available to meet a stated dependency, that model is removed. */
					if (subModels != null){
						if(debug) System.out.println("Submodels is not null");
						/**If first dependency, create new set of models, otherwise merge new and current models*/
						if (j == 0){
							ArrayList<IntentModel> singleModelList = new ArrayList<IntentModel>();
							singleModelList.add(new IntentModel(matchingProcedures.get(i)));
							tempMatchingModels = mergeModels(singleModelList, subModels);
						} else {
							tempMatchingModels = mergeModels(tempMatchingModels, subModels);
						}
					} else {
						if(debug) System.out.println("Submodels is null");
						tempMatchingModels.clear();
					}
				}
			}
			if(debug) System.out.println("TempMatchingModels size: " +tempMatchingModels.size() );

			/**Add lower layer models to final collection*/
			matchingModels.addAll(tempMatchingModels);
		}
		if(debug) System.out.println("Finalizing the generation of models...\n");
		return matchingModels;
		
	}
	
	/*
	 * Join models by merging on initial procedure of first set of models (cross product).
	 */
	static ArrayList<IntentModel> mergeModels(ArrayList<IntentModel> models, ArrayList<IntentModel> sub){
		ArrayList<IntentModel> newModels = new ArrayList<IntentModel>();
		
		for (int i = 0; i < models.size(); i++){
			for (int j = 0; j < sub.size(); j++){
				
				//IntentModel newModel = cloner.deepClone(models.get(i));
				//IntentModel newModel = models.get(i);
				//IntentModel newModel = IntentModel.clone(models.get(i));
				IntentModel newModel = (IntentModel) SerializationUtils.clone(models.get(i));
				newModel.addDependency(newModel.getInit().getId(), sub.get(j).getInit());
				newModel.addAllDependencies(sub.get(j).getAllDependencies());
				newModels.add(newModel);
			}
		}
		return newModels;
	}	

	
}
