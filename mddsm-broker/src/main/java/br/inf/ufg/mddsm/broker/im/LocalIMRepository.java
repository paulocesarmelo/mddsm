package br.inf.ufg.mddsm.broker.im;

import java.util.ArrayList;

import br.inf.ufg.mddsm.controller.img.DSC;
import br.inf.ufg.mddsm.controller.img.IMRepository;
import br.inf.ufg.mddsm.controller.img.IntentModel;

public class LocalIMRepository {

	private static LocalIMRepository instance;

	private ArrayList<IntentModel> intentModels = new ArrayList<IntentModel>();

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
	
	public static LocalIMRepository getInstance(){
		if (instance == null)
			instance = new LocalIMRepository();
		return instance;
	}
	
}
