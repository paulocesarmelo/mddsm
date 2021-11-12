package br.ufg.inf.mddsm.adapter.cmd;

import adapter.EResource;
import br.ufg.inf.mddsm.adapter.resources.ISCResourceRepository;
import dsk.EDSC;
import iscadapter.ISCResource;
import iscadapter.resources.Capability;
import iscadapter.resources.ResourceType;

public class CmdManager {
	
	ISCResourceRepository iscRepo = ISCResourceRepository.getInstance();
	
	//InterSCity
	public String parseISCCmd(ISCResource resource, Capability cap) {
		
		if(cap.getFunction().equals(ResourceType.SENSOR)) {
			
		}else {
			
		}
		
		String cmd = "";

		
		
		
		return cmd;
	}
	
	//InterSCity
		public String parseISCCmd(ISCResource resource, EDSC dsc) {
			
			Capability cap = iscRepo.getCapability(resource, dsc);
			
			cap.setValue(dsc.getParameters().get(0).getValue());
			
			String cmd = "";
			
			if(cap.getFunction().equals(ResourceType.SENSOR)) {
				cmd+="capabilities: ["+cap.getName()+"]";
			}else {
				cmd+="{data: [ { uuid: ... , capabilities: { "+cap.getName()+":"+cap.getValue()+"} } ]";
				/*
				 * {
					  "data": [
					    {
					      "uuid": "b0ae6f76-521d-4199-9595-f52c99361052",
					      "capabilities": {
					        "semaphore": "green",
					        "illuminate": null
					      }
					    }
					  ]
					}
				 */
			}
			
			/*
			 * {
				  "uuids": [
				    "5ad20589-a3db-4521-b1bc-a21dde00a25c",
				    "b5d170b5-aaf3-42bc-9e47-58e3fe2a4846"
				  ],
				  "capabilities": [
				    "temperature",
				    "humidity"
				  ],
				  "matchers": {
				    "temperature.gte": 13.498,
				    "temperature.lte": 18.091,
				    "humidity.eq": 20.02
				  },
				  "start_range": "2016-06-25T12:21:29",
				  "end_range": "2016-06-25T16:21:29"
				}
			 */

			
			
			
			return cmd;
		}
}
