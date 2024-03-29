package br.inf.ufg.mddsm.broker.emf

import base.Manager
import br.inf.ufg.mddsm.broker.autonomic.AutonomicManager
import br.inf.ufg.mddsm.broker.manager.MainManager
import br.inf.ufg.mddsm.broker.manager.SignalHandlerManager
import br.inf.ufg.mddsm.broker.policy.PolicyEvaluationManager
import br.inf.ufg.mddsm.broker.policy.metadata.Metadata
import br.inf.ufg.mddsm.broker.resource.ResourceManager
import br.inf.ufg.mddsm.broker.state.StateManager

class ManagerFactory {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ManagerFactory.class);
    private HandlerFactory handlerFactory = new HandlerFactory()
    private ResourceManagerFactory objectManagerFactory = new ResourceManagerFactory()
    private MetadataFactory metadataFactory = new MetadataFactory()

    MainManager createManager(Manager manager) {
		log.trace("createManager(manager:{})", manager)
        SignalHandlerManager signalHandlerManager = handlerFactory.createSignalHandlerManager(manager.handlers)
        ResourceManager resourceManager = objectManagerFactory.createObjectManager(manager.resourceManager)

        Metadata metadata = metadataFactory.createMetadata(manager)
        MainManager mainManager = new MainManager(metadata, signalHandlerManager, resourceManager, new StateManager(manager.stateManager.stateTypes))

        if (manager.autonomicManager) {
            AutonomicManager mape = new AutonomicManager(manager.autonomicManager, mainManager.getContext())
            signalHandlerManager.register(-1, mape.getSignalHandler())
        }

        if (manager.policyManager) {
            PolicyEvaluationManager pem = new PolicyEvaluationManager(manager.policyManager)
            signalHandlerManager.register(-1, pem.getSignalHandler())
        }
		
		/*
		if (manager.intentModelManager) {
			IntentModelManager imm = new IntentModelManager(manager.intentModelManager)
			signalHandlerManager.register(-1, imm.handlers)
				
		}
		*/

		log.trace("createManager() = {}", mainManager)
        mainManager
    }
}
