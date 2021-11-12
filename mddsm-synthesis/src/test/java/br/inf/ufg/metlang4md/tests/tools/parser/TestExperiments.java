package br.inf.ufg.metlang4md.tests.tools.parser;

import javax.swing.JOptionPane;

import br.inf.ufg.mddsm.controller.img.TotalTime;

public class TestExperiments {

	public static void main(String[] args) {
		String answer;
		long sum=0;
		NewTestControlScript test = new NewTestControlScript();
		TotalTime time = TotalTime.getInstance();
		test.setup();
		do {
		String appModelName = JOptionPane.showInputDialog("App model name:");
		System.out.println();
		int cycles = Integer.parseInt(JOptionPane.showInputDialog("Cycles:"));
		time.clearList();
		for(int cont =0 ; cont<cycles; cont++) {
			//long i = System.currentTimeMillis();
			
			test.testGenerateValidScript(appModelName);
			
			//long f = System.currentTimeMillis();
			
			//long time = f - i;
			//System.out.print("Test "+(cont+1)+": ");
			//System.out.println(time);
			//if(cont>1) sum+=time;
		}
		time.printTimes();
		time.avg();
		//double avg=sum/10.0;
		//System.out.println("Avg: "+avg);
		answer = JOptionPane.showInputDialog("New test? (y or n) ");
		
		}while(answer.equals("y"));
		
	}
	
}
