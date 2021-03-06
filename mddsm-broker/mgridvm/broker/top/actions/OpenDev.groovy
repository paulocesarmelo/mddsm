package broker.top.actions

import java.util.Map

import broker.top.adapters.ILocalControllerAdapter
import broker.top.adapters.LocalControllerAdapter
import broker.util.Util;
import br.inf.ufg.mddsm.broker.adapters.Event
import br.inf.ufg.mddsm.broker.manager.ManagerContext;
import br.inf.ufg.mddsm.broker.manager.SignalInstance
import br.inf.ufg.mddsm.broker.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.broker.state.StateHolder

class OpenDev implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		String ctrlrId = params["ctrlrId"]
		String devId = params["devId"]
		String mgcc = params["mgcc"]

		StateHolder state = ctx.stateManager.getType("top").get(mgcc)

		ILocalControllerAdapter lca = state.getAsSet("ctrlrs").find
		{
			it -> ctrlrId == it.id
		}

		Util.top_mhb_log "OpenDevice", params, state

		if(lca.resource.execute(new SignalInstance("openDev", params)))
		{
			lca.execute(new SignalInstance("openDevice", params))
//			lca.openDev(ctrlrId, devId)
			lca.notify(new Event('ack'))
			return true
		}
		return false
	}
}


