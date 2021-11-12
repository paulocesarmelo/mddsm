package br.inf.ufg.mddsm.controller.resource;

import br.inf.ufg.mddsm.controller.manager.SignalInstance;

public interface Effector {
    Object execute(SignalInstance signal);
}
