package br.inf.ufg.mddsm.controller.img;

import java.io.Serializable;


import org.codehaus.janino.Parser.ParseException;
import org.codehaus.janino.Scanner.ScanException;
import org.codehaus.janino.ScriptEvaluator;

import br.inf.ufg.mddsm.controller.img.Call;
import dsk.impl.EExecutionUnitImpl;

public class ExecutionUnit extends EExecutionUnitImpl implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 554738223676867815L;
	
	final String boilerplateInclude = "import br.inf.ufg.mddsm.broker.im.*;";
	
	String id;
	String body = null;
	transient ScriptEvaluator script = new ScriptEvaluator();
	
	public ExecutionUnit(String id, String body){
		setId(id);
		setBody(boilerplateInclude + body);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBody() {
		return body;	
	}
	
	public ScriptEvaluator getCompiledBody(){
		return script;
	}
	
	public void setCompiledBody(ScriptEvaluator script){
		this.script = script;
	}

	public void setBody(String body) {
		this.body = body;
		//System.out.println(body);
	}
	
	//alterei este metodo para compilar comente quando estiver na camanada de broker
	public void setBody(String body, boolean cook) {
		this.body = body;
		//System.out.println(body);
		try {
			//script.setReturnType(Call.class);
			script.setReturnType(boolean.class);
			
			try {
				script.cook(body);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ScanException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (org.codehaus.janino.CompileException e) {
			e.printStackTrace();
		}
	}
}
