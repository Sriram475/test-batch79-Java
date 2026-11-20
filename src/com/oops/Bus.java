package com.oops;

public class Bus extends Vehicle{
    
	@Override
	public void start() {
		System.out.println("Bus is starting");
	}
    
	@Override
	public void stop() {
		System.out.println("Bus is stopping");
	}
	
	@Override
	public void sound() {
		System.out.println("Bus is making horn sound");
	}
}
