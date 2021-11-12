package br.inf.ufg.mddsm.broker.im;

import br.inf.ufg.mddsm.controller.img.IMRepository;
import br.inf.ufg.mddsm.controller.img.IntentModel;

public class IntentModelRetriever {

	private IMRepository repository;
	
	public IntentModel getIM(String id) {
		IntentModel im = repository.getIM(id);
		
		return im;
	}
}
