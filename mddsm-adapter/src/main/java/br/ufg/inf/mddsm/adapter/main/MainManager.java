package br.ufg.inf.mddsm.adapter.main;

import adapter.EResource;
import br.inf.ufg.mddsm.controller.img.DSEntity;
import br.inf.ufg.mddsm.controller.img.IntentModel;
import br.ufg.inf.mddsm.adapter.cmd.CmdManager;
import br.ufg.inf.mddsm.adapter.resources.ISCResourceRepository;
import br.ufg.inf.mddsm.adapter.resources.ResourceRepository;
import dsk.EDSC;
import iscadapter.ISCResource;
import iscadapter.resources.Capability;

public class MainManager implements AdapterInterface{

	CmdManager cmdManager;
	ResourceRepository repo;
	ISCResourceRepository iscRepo;
	
	@Override
	public void proccess(IntentModel im) {
		
		repo = ResourceRepository.getInstance();
		
		
		EDSC dsc = im.getInit().getClassifier();
		
		DSEntity entity = im.getInit().getClassifier().getEntity();
		
		//verify if adapter model is interscity adapter
		EResource resource = repo.getResource(entity);
		
		if (resource instanceof ISCResource) {
			ISCResource res = (ISCResource) resource;

			String cmd = cmdManager.parseISCCmd(res, dsc);
			
			//call commManaager 
		}
		
		
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
	}
	
}
