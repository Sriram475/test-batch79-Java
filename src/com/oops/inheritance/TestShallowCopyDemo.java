package com.oops.inheritance;

class Employee implements Cloneable {
	int id;
	String name;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

}

class Address {

	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class TestShallowCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address add = new Address("Hyderabad");

		Employee emp1 = new Employee(1, "Mohan", add);
		System.out.println("************************");
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.address.city);//Hyd
		System.out.println("************************");

		Employee emp2 = (Employee) emp1.clone();
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.address.city);//Hyd
		System.out.println("************************");

		emp2.id = 2;
		emp2.name = "sai";
		emp2.address.city = "Banglore";
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.address.city);//Banglore 
		System.out.println("************************");
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.address.city);//Banglore
		System.out.println("************************");

	}

}