package com.oops.inheritance;

class Vehicle {
	int speed = 50;
	
	void display() {
		System.out.println("In vehicle display method..!");
		System.out.println("Speed of vehicle is..." + speed);
	}
}

class Car extends Vehicle {
	int speed = 200;

	@Override
	void display() {
		System.out.println("In car display method..!");
		System.out.println("Speed of car is..." + speed);
	}

}

public class TestDemo1 {

	public static void main(String[] args) {
  
		Vehicle v = new Car();
		v.display();
	    System.out.println(v.speed);	
	}

}
