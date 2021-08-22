package com.ashifshadab.example1;

public class Test {

	public static void main(String[] args) {

		RainThread rainThread = new RainThread("Rain");
		
		ThunderStromThread thunderStromThread = new ThunderStromThread("ThunderStrom");
		
		CycloneThread cycloneThread = new CycloneThread("Cyclone");
		
		//cycloneThread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(rainThread.getName() +" Priority:: "+rainThread.getPriority());
		
		System.out.println(thunderStromThread.getName() +" Priority:: "+thunderStromThread.getPriority());
		
		System.out.println(cycloneThread.getName() +" Priority:: "+cycloneThread.getPriority());
		
		rainThread.start();
		thunderStromThread.start();
		cycloneThread.start();

	}

}
