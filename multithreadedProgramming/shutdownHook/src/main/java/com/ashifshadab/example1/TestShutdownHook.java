package com.ashifshadab.example1;

public class TestShutdownHook {

	public static void main(String[] args) {

		Runtime runtime=Runtime.getRuntime();  
		
		runtime.addShutdownHook(new MyThread());
		
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		
		try{
			
			Thread.sleep(3000);
			
		}catch (Exception e) {
			e.printStackTrace();
		}  
		

	}

}
