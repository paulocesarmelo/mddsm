package br.inf.ufg.mddsm.broker.im;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.inf.ufg.mddsm.broker.im.metadata.Attribute;
import br.inf.ufg.mddsm.broker.im.metadata.Call;
import br.inf.ufg.mddsm.broker.im.metadata.EventCallBack;
import br.inf.ufg.mddsm.broker.im.metadata.EventWaitCall;
import br.inf.ufg.mddsm.controller.img.IntentModel;

public class IntentModelRegistry {
	private static final Logger log = LoggerFactory.getLogger(IntentModelRegistry.class);

	private IntentModel im;
	private ExecutionStateManager stateManager;
	private Call result;
	private LocalIMRepository repository;
	
	public IntentModelRegistry() {
		repository = LocalIMRepository.getInstance();
		stateManager = ExecutionStateManager.getInstance();
	}
	
	public void registerIM(IntentModel im) {
		log.trace("registerIM(im:{})", im);
		this.im = im;
		
		repository.addIM(im);
		
		// If the result of the last EU execution was a call to wait for a specific event
		//System.out.println("Will register: " + ((EventWaitCall)result).getEUId() + " in response to " + ((EventWaitCall)result).getEvent());
		// Store model in state manager for recall when event occurs
		stateManager.putAttribute(new Attribute(im.getId(), im));
		// Register requested event in event listener with current procedure and stated EU as responsible model elements
		//EventRegister.registerEventListener(((EventWaitCall)result).getEvent(), new EventCallBack(im.getId(), currentProcedure.getClassifier(), ((EventWaitCall)result).getEUId()));
		//EventRegister.registerEventListener(((EventWaitCall)result).getEvent(), new EventCallBack(im.getId()));
	}
	
}
