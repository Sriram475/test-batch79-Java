package com.sriram.constructors;

public class Vehicle {

	String type;

	Vehicle(String type) {
		this.type = type;
	}
}

class Car extends Vehicle {

	String brand;
	float price;

	Car(String type, String brand, float price) {
		super(type);

		this.brand = brand;
		this.price = price;
	}
}

class ElectricCar extends Car {

	int batteryCapacity;

	ElectricCar(String type, String brand, float price, int batteryCapacity) {

		super(type, brand, price);

		this.batteryCapacity = batteryCapacity;
	}

	void display() {
		System.out.println("Vehicle Type: " + type);
		System.out.println("Car Brand: " + brand);
		System.out.println("Car Price: " + price);
		System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
	}

	public static void main(String[] args) {

		ElectricCar e1 = new ElectricCar("Electric Vehicle", "Tesla", 5000000.0f, 100);

		e1.display();
	}

}