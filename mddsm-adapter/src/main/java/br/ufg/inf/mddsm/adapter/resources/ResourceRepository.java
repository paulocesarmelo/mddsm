package br.ufg.inf.mddsm.adapter.resources;

import java.util.ArrayList;

import adapter.EDSCmd;
import adapter.EResource;
import br.inf.ufg.mddsm.controller.img.DSEntity;
import dsk.EDSC;
import iscadapter.ISCResource;
import iscadapter.resources.Capability;

public class ResourceRepository {

	private static ResourceRepository instance;
	
	private ArrayList<EResource> resources = new ArrayList<EResource>();
	
	public static ResourceRepository getInstance(){
		if (instance == null)
			instance = new ResourceRepository();
		return instance;
	}
	
	public void addResource(EResource resource) {
		resources.add(resource);
	}
	
	/*
	 * Return resource based on resource name
	 */
	public EResource getResource(String name) {
		
		EResource resource = null;
		
		for(int i=0; i<resources.size(); i++) {
			resource = resources.get(i);
			if(resource.getName().equals("name")) {
				return resource;
			}
		}
		
		return resource;
		
	}
	
	/*
	 * Return resrouce based on entity name
	 */
	public EResource getResource(DSEntity entity) {
		ISCResource resource = null;
		
		for(int i=0; i<resources.size(); i++) {
			resource = (ISCResource) resources.get(i);
			if(resource.getDSEntity().getName().equals(entity.getName())) {
				return resource;
			}
			
		}
		
		return resource;
	}
	
	public ArrayList<EResource> getAllResources(){
		return this.resources;
	}
	
	public boolean isEmpty() {
		return this.resources.isEmpty();
	}
	
	public void printRepository() {
		
		EResource resource = null;
		if(!isEmpty()) {
			for(int i=0; i<resources.size(); i++) {
				resource = resources.get(i);
				System.out.println(resource.getName());
			}
		}else {
			System.out.println("Repository is empity!");
		}
		
	}
	
}