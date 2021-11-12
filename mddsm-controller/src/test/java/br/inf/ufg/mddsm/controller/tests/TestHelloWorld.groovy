package br.inf.ufg.mddsm.controller.tests

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import br.inf.ufg.mddsm.controller.adapters.Call
import br.inf.ufg.mddsm.controller.adapters.EventNotifier
import br.inf.ufg.mddsm.controller.adapters.Manageable
import base.Manager
import br.inf.ufg.mddsm.controller.emf.EMFLoader
import br.inf.ufg.mddsm.controller.emf.ManagerFactory
import br.inf.ufg.mddsm.controller.handlers.EventManager
import br.inf.ufg.mddsm.controller.manager.MainManager
import br.inf.ufg.mddsm.controller.manager.ManagerContext
import br.inf.ufg.mddsm.controller.manager.ManagerFacade
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance
import br.inf.ufg.mddsm.controller.resource.ResourceManager
import groovy.util.logging.Log4j2

@Log4j2
class TestAction implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		log.info "Executing TestAction with params: ${params}"
		return new Object();
	}
	
}

interface TestHelloAdapter {
	Object testCallAdapter(Object arg)
}

@Log4j2
class TestHelloAdapterImpl implements TestHelloAdapter, Manageable {

	@Override
	public void setEventNotifier(EventNotifier eventListener) {
	}

	@Override
	@Call(name="testCallAdapter", parameters=["arg"])
	public Object testCallAdapter(Object arg) {
		log.info "Executing testCallAdapter with params: ${param}"
		return new Object()
	}
	
}

class TestHelloWorld {

	static EventManager eventManager
	static MainManager mainManager
	static ResourceManager resourceManager
	
	@BeforeAll
	static void main(String[] args) {
		
		Manager managerDef = EMFLoader.loadFirst("hello.xmi", Manager)
		eventManager = new EventManager()
		mainManager = new ManagerFactory().createManager(managerDef)
		resourceManager = mainManager.resourceManager
		
		mainManager.start()
		test();
	}
	
	@AfterAll
	static void tearDown() {
		mainManager.stop()
	}
	
	@Test
	static void test() {
		TestFrontEnd frontend = new TestFrontEnd(mainManager)
		frontend.testCall(new Object())
	}

}

class TestFrontEnd extends ManagerFacade {
	public TestFrontEnd(MainManager manager) {
		super(manager)
	}
	
	def testCall(def arg) {
		enqueue("testAction", ["arg":arg])
	}
}
