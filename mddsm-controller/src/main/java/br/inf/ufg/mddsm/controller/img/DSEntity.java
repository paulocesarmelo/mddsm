package br.inf.ufg.mddsm.controller.img;

import java.io.Serializable;

import dsk.EDSEntity;
import dsk.impl.EDSEntityImpl;

public class DSEntity extends EDSEntityImpl implements Serializable, EDSEntity{

	private static final long serialVersionUID = 1L;
	
	public DSEntity(EDSEntityImpl entity) {
		setName(entity.getName());
	}
	
}
