package com.oops.inheritance;

public class Student1 {

    int id;
    String name;
    Address1 address;

    public Student1(int id, String name, Address1 address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    public Student1(Student1 other) {
        this.id = other.id;
        this.name = other.name;
        this.address = other.address;
    }
    
    public static void main(String[] args) {
    	Address1 addr = new Address1("Hyderabad", "Telangana");

    	Student1 s1 = new Student1(101, "Sriram", addr);
    	
    	System.out.println("Student id is:" + s1.id);
    	System.out.println("Student name is:" + s1.name);
    	System.out.println("Student address is:" + s1.address.city);
    	
    	Student1 s2 = new Student1(s1);
    	s2.id=102;
    	s2.name="shiva";
    	s2.address.city="Bangalore";
    	
    	System.out.println("Student id is:" + s2.id);
    	System.out.println("Student name is:" + s2.name);
    	System.out.println("Student address is:" + s2.address.city);
    	
    	System.out.println("Student id is:" + s1.id);
    	System.out.println("Student name is:" + s1.name);
    	System.out.println("Student address is:" + s1.address.city);
	}
}
