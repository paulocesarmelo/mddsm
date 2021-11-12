package br.inf.ufg.mddsm.controller.img;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import dsk.EEventType;

import br.ufg.inf.mddsm.synthesis.CommandAction;

public class DSCRepository {
private static DSCRepository instance;
	
	
	ArrayList<DSC> dscs = new ArrayList<DSC>();
	HashMap<String, ArrayList<DSC>> map = new HashMap<String, ArrayList<DSC>>();
	boolean debug = false;
	
	public void addDSC(DSC dsc) {
		dscs.add(dsc);
	}
	
	public DSC getDSC(String name){
		
		for (int i = 0; i < dscs.size(); i++){
			if (dscs.get(i).getName().equals(name))
				return dscs.get(i);
		}
		return null;
	}
	
	
	public ArrayList<DSC> getAllDSCs(){
		return dscs;
	}
	
	public ArrayList<DSC> getAllDSCs(String entityName){
		return map.get(entityName);
	}
	
	public void addDSC(String entityName, DSC dsc) {
		
		ArrayList<DSC> dscs = null;
		
		try {
			dscs = map.get(entityName);
			dscs.add(dsc);
			map.put(entityName, dscs);
		}catch(NullPointerException e) {
			dscs = new ArrayList<DSC>();
			dscs.add(dsc);
			map.put(entityName, dscs);
		}
		
		
		/*if(map.get(entityName).equals(null)) {
			System.out.println("is empty");
			dscs = new ArrayList<DSC>();
		}else {
			System.out.println("is not empty");
			dscs = map.get(entityName);
		}*/
		
	}
	
	public boolean isEmpty(){
		return dscs.isEmpty();
	}
	
	public HashMap<String, ArrayList<DSC>> getMap() {
		return map;
	}

	public void setMap(HashMap<String, ArrayList<DSC>> map) {
		this.map = map;
	}
	
	public HashMap<String, ArrayList<DSC>> getDSCs(String entityName, CommandAction metaCmd) {
		
		HashMap<String, ArrayList<DSC>> map = new HashMap<String, ArrayList<DSC>>();
		DSCRepository repository = DSCRepository.getInstance();
		ArrayList<DSEvent> events = new ArrayList<DSEvent>();
		ArrayList<DSC> syncDSCs=new ArrayList<DSC>(), asyncDSCs=new ArrayList<DSC>();
		boolean sync =false, async=false;
		if(debug) System.out.println(entityName+" getDSCs");
		ArrayList<DSC> dscs = repository.getAllDSCs(entityName);
		
		if(dscs != null) {
		Iterator<DSC> it = dscs.iterator();
		
		while(it.hasNext()) {
		
			DSC dsc = it.next();
			
			events = (ArrayList<DSEvent>) dsc.getEvents();
			
			int i=0;
			
			if(debug) System.out.println(dsc.getName());
			
			while(i < events.size() && (!sync || !async)) { 
				if(debug) System.out.println("Event: "+events.get(i).getName());
				if(debug) System.out.println("Event Meta command: "+events.get(i).getMetaCmd().toString());
				if(debug) System.out.println("Meta command: "+metaCmd.toString());
				if(events.get(i).getType() == EEventType.TOP && events.get(i).getMetaCmd().toString().equals(metaCmd.toString())) {
					sync = true;
					if(debug) System.out.println("sync true");
				}else if(events.get(i).getType() == EEventType.BOTTOM && !metaCmd.toString().equals("DELETE")) {
					async = true;
					if(debug) System.out.println("async true");
				}
				
				i++;
				
			}
			
			if(sync) {
				syncDSCs.add(dsc);
				sync = false;
			}
			
			if(async) {
				asyncDSCs.add(dsc);
				async = false;
			}
				
		}
		
		map.put("SYNC", syncDSCs);
		map.put("ASYNC", asyncDSCs);
		
		}
		
		return map;
		
	}

	public static DSCRepository getInstance(){
		if (instance == null)
			instance = new DSCRepository();
		return instance;
	}
}
