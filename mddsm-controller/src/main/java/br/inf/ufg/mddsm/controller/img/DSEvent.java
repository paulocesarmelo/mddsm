package br.inf.ufg.mddsm.controller.img;

import java.io.Serializable;

import dsk.EDSEvent;
import dsk.impl.EDSEventImpl;

public class DSEvent extends EDSEventImpl implements Serializable, EDSEvent{

	public DSEvent (EDSEventImpl event) {
		super.setName(event.getName());
		super.setId(event.getId());
		super.setType(event.getType());
		super.setMetaCmd(event.getMetaCmd());
	}
	
}
