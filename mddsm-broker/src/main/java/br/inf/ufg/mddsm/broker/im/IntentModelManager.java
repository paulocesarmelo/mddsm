package br.inf.ufg.mddsm.broker.im;

import java.lang.reflect.InvocationTargetException;

import org.codehaus.commons.compiler.CompileException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.inf.ufg.mddsm.controller.img.IntentModel;

/*
 * This class is responsible for coordinate the execution of Intent Models
 * deal with type of execution (sync or async) and concurrency control
 * 
 * @author Paulo César Melo
 * 
 */
public class IntentModelManager {
	
	private static final Logger log = LoggerFactory.getLogger(IntentModelManager.class);
	
	private IntentModel im;
	private IntentModelExecutor executor;
	private IntentModelRegistry register;
	
	private IntentModelRetriever retriever;
	
	private static IntentModelManager instance;
	
	private IntentModelManager() {
		executor = new IntentModelExecutor();
		register = new IntentModelRegistry();
	}
	
	public static IntentModelManager getInstance() {
		log.trace("getInstance()");
		if(instance == null) {
			instance = new IntentModelManager();
		}
		
		return instance;
	}
	
	public void processIM(IntentModel im) {
		log.trace("processIM(im:{})", im);
		this.im = im;
		
		System.out.println("execution type:"+im.getExecutionType());
		
		if(im.getExecutionType().equals("ASYNC"))
			registry();
		else
			execute();	
	}
	
	public void execute() {
		log.trace("execute()");
		try {
			executor.executeModel(im);
		} catch (CompileException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registry() {
		log.trace("registry()");
		register.registerIM(im);
	}
	
	//Called based on event
	public void loadIM(String id) {
		log.trace("loadIM(im:{})", im);
		this.im = retriever.getIM(id);
		this.execute();
	}
	
}
