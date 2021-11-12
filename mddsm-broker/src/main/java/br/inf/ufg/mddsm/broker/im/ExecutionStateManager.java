package br.inf.ufg.mddsm.broker.im;

import java.util.HashMap;

import br.inf.ufg.mddsm.broker.im.metadata.Attribute;


/**
 * 
 * @author karl
 * 
 * Basic state manager. No facilities for permission or role access. 
 */

public class ExecutionStateManager {
	
	private HashMap<String, Attribute> attributes = new HashMap<String, Attribute>();
	
	private static ExecutionStateManager manager;
	
	public void putAttribute(Attribute attribute){
		putAttribute(attribute.getName(), attribute);
	}
	
	public boolean hasAttribute(String name){
		return attributes.containsKey(name);
	}
	
	public void putAttribute(String name, Attribute attribute){
		attributes.put(name, attribute);
	}
	
	public Attribute getAttribute (String name){
		return attributes.get(name);
	}
	
	public void clearAttribute (String name){
		attributes.remove(name);
	}
	
	private ExecutionStateManager() {};
	
	public static synchronized ExecutionStateManager getInstance(){
		if (manager == null)
			manager = new ExecutionStateManager();
		return manager;
	}
}
