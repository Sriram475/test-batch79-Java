package com.oops;

public class Car extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("Car is starting...!");
	}
	
	@Override
	public void stop() {
		System.out.println("Car is stopping...!");
	}
	
	@Override
	public void sound() {
		System.out.println("Car is making a sound");
	}
    
	public void openSunRoof() {
		System.out.println("opening car sunroof...!");
	}
	
	public static void main(String[] args) {
		
	  Car c = new Car();
	  c.start();
	  c.stop();
	  c.openSunRoof();
	}
}
