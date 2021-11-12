package br.inf.ufg.mddsm.broker.im;


import java.util.HashMap;
import java.util.Map;

import br.inf.ufg.mddsm.broker.im.metadata.EventCallBack;

public class EventRegister {
	
	
	static Map<String, EventCallBack> register = new HashMap<String, EventCallBack>();
	
	public static void registerEventListener(String event, EventCallBack callback){
		register.put(event, callback);
	}
	
	public static void deregisterEventListener(String event){
		register.remove(event);
	}
	
	public static boolean hasEventListenerRegistered(String event){
		return register.containsKey(event);
	}
	
	public static EventCallBack getRegisteredEventCallBack(String event){
		return register.remove(event);
	}
}
