package br.inf.ufg.mddsm.controller.img;

import java.util.LinkedList;

public class TotalTime {

	private static LinkedList<Long> times;
	private static TotalTime instance;
	
	public TotalTime() {
		times = new LinkedList<Long>();
	}
	
	public static void clearList() {
		times.clear();
	}
	
	public static void add(long time) {
		times.add(time);
	}
	
	public static TotalTime getInstance() {
		if (instance == null) {
			instance = new TotalTime();
		}
		
		return instance;
	}
	
	public static void printTimes() {
		if (times.size() <= 10000)
			for(int i = 0; i < times.size(); i++) {
				System.out.println(times.get(i));
			}
	}
	
	public static void avg() {
		
		long sum = 0;
		double avg;
		for(int i = 2; i < times.size(); i++) {
			sum += times.get(i);
		}
		avg = sum / (times.size()-2);
		System.out.println("Times size: "+times.size());
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
		
	}
	
}
