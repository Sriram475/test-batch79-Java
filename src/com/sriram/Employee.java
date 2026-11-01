package com.sriram;

public class Employee {
	int empid;
	String empname;
	int salary;
	static String companyname;
	
	static {
		companyname="Shriram Finance";
		System.out.println("companyName:" + companyname);
	}
	
	{
	  System.out.println("In instance block");
	}

	public static void main(String[] args) {
      Employee emp1 = new Employee();
      Employee emp2 = new Employee();
      Employee emp3 = new Employee();

	}

}
