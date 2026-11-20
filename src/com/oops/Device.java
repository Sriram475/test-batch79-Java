package com.oops;

public class Device {

	private String brand;
	private int price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	void displayDetails() {
		System.out.println("In Device class");
		System.out.println("Brand name is:" + brand);
		System.out.println("Device price is:" + price);
	}

}

class Laptop extends Device{
	
	String brand;
	int price;
	
	public void RunIDE() {
		System.out.println("In laptop class method..!!");
		System.out.println("Laptop is working..!!");
	}
	
	public void CompileCode() {
		System.out.println("In laptop class method..!!");
		System.out.println("Code is compiled..");
	}
	
    Laptop(String brand,int price){
    	this.brand=brand;
    	this.price=price;
    }
	
	@Override
	void displayDetails() {
		System.out.println("In Device class");
		System.out.println("Brand name is:" + brand);
		System.out.println("Device price is:" + price);
	}
}

class Mobile extends Device{
	
	void makecall() {
		System.out.println("Mobile can make call");
	}
	
	void takephoto() {
		System.out.println("Mobile can take photos");
	}
	
	
}
