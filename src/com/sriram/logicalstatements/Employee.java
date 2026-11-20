package com.sriram.logicalstatements;

public class Employee {
	int id;
	String name;
	float salary;
	Employee(int id,String name,float salary){
	    this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("Employee's id is : " + id);
		System.out.println("Employee's name is : " + name);
		System.out.println("Employee's initial salary is : " + salary);
	}
	
	static void  updatesalary(float salary) {
		float bonus = salary * 0.1f;
		salary += bonus;
		System.out.println("Employee's final salary after 10% bonus is :" + salary);
	}

	public static void main(String[] args) {
		
      Employee e = new Employee(142,"sriram",100000.0f);
      updatesalary(100000.0f);
	}

}
