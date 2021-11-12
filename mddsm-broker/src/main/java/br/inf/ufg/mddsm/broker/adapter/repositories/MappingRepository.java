package br.inf.ufg.mddsm.broker.adapter.repositories;

import java.util.HashMap;

public class MappingRepository {

	private HashMap<String, String> mappings;
	private MappingRepository instance = null;
	
	
	private MappingRepository() {
		mappings = new HashMap<String, String>();
	}
	
	public MappingRepository getInstance() {
		if(instance == null) {
			instance = new MappingRepository();
		}
		
		return instance;
	}
	
	public HashMap<String, String> getMappings() {
		return mappings;
	}

	public void setMappings(HashMap<String, String> mappings) {
		this.mappings = mappings;
	}
	
	public void add(String nameEntity) {
		//mappings
	}
	
	
}
