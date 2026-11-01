package com.sriram;

public class Wrapper {
	
	Integer studentid=12452;
	 String studentname="ram";
	 Integer age=22;
	 Double marks=89.1353;
	 Character grade='A';
	 Boolean passed=true;
	 
	public static void main(String[] args) {
	  Wrapper w = new Wrapper();
	 System.out.println("Student Id is : " + w.studentid);
	 System.out.println("Student name is : " + w.studentname);
	 System.out.println("Student Age is : " + w.age);
	 System.out.println("Student Marks is : " + w.marks);
	 System.out.println("Student Grade is : " + w.grade);
	 System.out.println("Result is : " + w.passed);
	 
	}

}
