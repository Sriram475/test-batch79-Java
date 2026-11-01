package com.sriram;

public class DemoCounter {
	static int count = 0;
	{
	 count++;
	}
	
	public static void main(String[] args) {
	  DemoCounter dm = new DemoCounter();
	  DemoCounter dm1 = new DemoCounter();
	  DemoCounter dm2 = new DemoCounter();
	  
	  System.out.println("Object count is :" + DemoCounter.count);

	}

}
