package br.inf.ufg.mddsm.broker.im.metadata;

public class EUCall extends Call {
	
	String eUId;
	
	public EUCall(String eUId){
		this.eUId = eUId;
	}
	
	public String getEUId(){
		return eUId;
	}
}
