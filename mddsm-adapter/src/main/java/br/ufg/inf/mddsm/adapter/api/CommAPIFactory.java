package br.ufg.inf.mddsm.adapter.api;

import adapter.ECommAPI;
import adapter.ECommunication;

public class CommAPIFactory {
	
	//param element from model ECommunication
	CommAPI createCommApi(ECommunication com) {
		
		CommAPI api = null;
		
		switch(com.getApi().getValue()) {
			case ECommAPI.REST_VALUE:
				api = new RestAPI();
				break;
			case ECommAPI.GRAPHQL_VALUE:
				break;
			default:
				break;
		}
		
		return api;
		
	}
	
}
