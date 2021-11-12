package br.inf.ufg.mddsm.controller.script;

import br.inf.ufg.mddsm.broker.manager.MainManager;
import br.inf.ufg.mddsm.controller.img.IntentModel;

public class Dispatcher {
	
	private static MainManager brokerManager;
	
	public static void dispatch(IntentModel im, MainManager manager) {
		
		brokerManager = manager;
		brokerManager.executeIM(im);
		
	}
	
}
