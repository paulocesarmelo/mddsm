package br.inf.ufg.mddsm.broker.im.metadata;

import br.inf.ufg.mddsm.controller.img.DSC;

public class EventCallBack {
	String modelId;
	DSC callbackProcedureDSC;
	String eUId;
	
	public EventCallBack(String modelId, DSC callbackProcedureDSC, String eUId) {
		super();
		this.modelId = modelId;
		this.callbackProcedureDSC = callbackProcedureDSC;
		this.eUId = eUId;
	}
	
	public EventCallBack(String modelId) {
		super();
		this.modelId = modelId;
	}
	
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public DSC getCallbackProcedureDSC() {
		return callbackProcedureDSC;
	}
	public void setCallbackProcedureDSC(DSC callbackProcedureDSC) {
		this.callbackProcedureDSC = callbackProcedureDSC;
	}
	public String geteUId() {
		return eUId;
	}
	public void seteUId(String eUId) {
		this.eUId = eUId;
	}
}
