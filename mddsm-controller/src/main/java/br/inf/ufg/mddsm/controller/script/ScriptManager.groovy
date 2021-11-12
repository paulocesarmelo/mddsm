package br.inf.ufg.mddsm.controller.script

import java.util.concurrent.TimeUnit

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import br.inf.ufg.mddsm.broker.manager.MainManager

import br.inf.ufg.mddsm.controller.manager.SignalInstance
import br.ufg.inf.mddsm.synthesis.ControlScript
import br.inf.ufg.mddsm.controller.img.IntentModel
import br.inf.ufg.mddsm.controller.img.TotalTime

class ScriptManager{
	
	private ScriptInterpreter interpreter;
	private HashMap<String, String> intentModel
	private static MainManager brokerManager;
	private static ScriptManager instance = null;
	
	private static Logger log = LoggerFactory.getLogger(ScriptManager.class);
	
	private static boolean debug = false;
	
	private ScriptManager() {
		if(debug) log.trace("new ScriptManager");
		brokerManager = new MainManager();
	}
	
	public static ScriptManager getInstance() {
		
		if( instance == null ) {
			instance = new ScriptManager();
		}
		
		return instance;
	}
	
	public void process(ControlScript script) {
		if(debug) log.trace("process(script:{})", script);
		interpreter = new ScriptInterpreter();
		interpreter.interpret(script) // generate and select
		
	}
	
	public static void dispatch(IntentModel im) {
		//Dispatcher
		if(debug) log.trace("dispatch(im:{})", im);
		println "Dispatching call to broker layer..."
		
		//long t1 = System.nanoTime();
		
		Dispatcher.dispatch(im, new MainManager())
		
		/*long t2 = System.nanoTime();
		long totalTime = TimeUnit.MILLISECONDS.convert((t2-t1), TimeUnit.NANOSECONDS);
		//long totalTime = t2 - t1;
		//System.out.println("SE("+script+"):" + TimeUnit.MILLISECONDS.convert((t2-t1), TimeUnit.NANOSECONDS) + " ms");
		System.out.println("EU processed: " + totalTime + "ms");
		TotalTime time = TotalTime.getInstance();
		TotalTime.add(totalTime);*/
		
		/*
		new Thread() {
			public void run() {
				Dispatcher.dispatch(im, brokerManager)
				//not implemented yet
			}
		}.start();
		*/
		
		//log.trace("call dispatched!");
		println "Call dispatched!"
	}
	
	public static void register(IntentModel im) {
		//RegistryRequester
		if(debug) log.trace("register(im:{})", im);
		println "Registering IM..."
		
		//RegistryRequester.register(im, brokerManager)
		
		
		/*new Thread() {
			public void run() {
				RegistryRequester.register(im, brokerManager)
			}
		}.start();*/
		
		
		println "IM registered!"
	}
	
}