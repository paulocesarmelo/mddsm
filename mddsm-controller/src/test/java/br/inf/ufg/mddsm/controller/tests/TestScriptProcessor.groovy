package br.inf.ufg.mddsm.controller.tests

import br.inf.ufg.mddsm.controller.manager.MainManager
import br.ufg.inf.mddsm.synthesis.ControlScript
import br.ufg.inf.mddsm.synthesis.Command

class TestScriptProcessor{
	
	private static MainManager mainManager
	private static ControlScript script
	private static Command command
	
	public static void main(String[] args) {
		
		mainManager = new MainManager()
				
		mainManager.process(script);
				
	}
	
}