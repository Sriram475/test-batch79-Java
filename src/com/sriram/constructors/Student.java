package com.sriram.constructors;

public class Student {
	int rollnumber;
	String name;

	Student() {
		System.out.println("In no-arg constructor");
		rollnumber = 5252;
		name = "sriram";
	}
	
	int age;
	String branch;
	Student(String name,int age,String branch){
		this.name=name;
		this.age=age;
		this.branch=branch;
		System.out.println("name is:" + name);
		System.out.println("age is:" + age);
		System.out.println("branch is:" + branch);
	}

	void display() {
		System.out.println("Roll number is:" + rollnumber);
		System.out.println("name is:" + name);
	}
	

	public static void main(String[] args) {
       Student s = new Student();
       s.display();
       Student s1 = new Student("srikanth",26,"cse");
	}

}
