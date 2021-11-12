package br.inf.ufg.mddsm.controller.img;

import java.util.ArrayList;

public class IMRepository {
	
	private static IMRepository instance;

	private ArrayList<IntentModel> intentModels = new ArrayList();

	public void addIM(IntentModel im) {
		intentModels.add(im);
	}
	
	public ArrayList<IntentModel> getAllIntentModels() {
		return intentModels;
	}

	public void setIntentModels(ArrayList<IntentModel> intentModels) {
		this.intentModels = intentModels;
	}
	
	public IntentModel getIM(String id) {
		for (int i = 0; i < intentModels.size(); i++){
			if (intentModels.get(i).getId().equals(id))
				return intentModels.get(i);
		}
		return null;
	}
	
	public IntentModel getIntentModelWithDSC(DSC dsc){
		
		for (int i = 0; i < intentModels.size(); i++){
			if (intentModels.get(i).getInit().getClassifier().equals(dsc))
				return intentModels.get(i);
		}
		return null;
	}
	
	public boolean isEmpty(){
		return intentModels.isEmpty();
	}
	
	public static IMRepository getInstance(){
		if (instance == null)
			instance = new IMRepository();
		return instance;
	}
	
}
