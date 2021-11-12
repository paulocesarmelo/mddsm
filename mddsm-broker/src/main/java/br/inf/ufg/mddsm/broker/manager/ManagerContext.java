package br.inf.ufg.mddsm.broker.manager;

import br.inf.ufg.mddsm.broker.im.IntentModelManager;
import br.inf.ufg.mddsm.broker.resource.ResourceManager;
import br.inf.ufg.mddsm.broker.state.StateManager;


public interface ManagerContext {
    public StateManager getStateManager();

    public MainManager getMainManager();

    public ResourceManager getResourceManager();
    
    public IntentModelManager getIntentModelManager();
}
