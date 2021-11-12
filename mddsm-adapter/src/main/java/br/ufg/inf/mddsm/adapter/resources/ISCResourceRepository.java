package br.ufg.inf.mddsm.adapter.resources;

import java.util.ArrayList;

import adapter.EResource;
import dsk.EDSC;
import iscadapter.ISCResource;
import iscadapter.resources.Capability;

public class ISCResourceRepository extends ResourceRepository{

	private static ISCResourceRepository instance;
	
	public static ISCResourceRepository getInstance(){
		if (instance == null)
			instance = new ISCResourceRepository();
		return instance;
	}	
	
	public Capability getCapability(ISCResource resource, EDSC dsc) {
		
		Capability capability;
		
		for(int i=0; i<resource.getCapabilities().size(); i++) {
			capability = resource.getCapabilities().get(i);
			for(int j=0; j<capability.getDsc().size();j++) {
				if(dsc.equals(capability.getDsc().get(j))){
					return capability;
				}
			}
		}
		
		return null;
		
	}
	
}
