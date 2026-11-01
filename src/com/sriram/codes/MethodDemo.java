package com.sriram.codes;

public class MethodDemo {
	String studentname = "sriram";
	int rollnumber = 1253;
	String course = "Javafullstack";
	
	void displayStudentDetails(){
		System.out.println("Student name is:" + studentname);
		System.out.println("Student rollnumber  is:" + rollnumber);
		System.out.println("Student course is:" + course);
	}
	
	int calculateTotal(int m1,int m2,int m3) {
	  return m1+m2+m3;	
	}
	
	float calculateAverage(int m1,int m2,int m3) {
		return (m1+m2+m3)/3f;
	}
	
	public static void main(String[] args) {
	  MethodDemo md = new MethodDemo();
	  md.displayStudentDetails();
	  int total = md.calculateTotal(56,78,75);
	  float avg= md.calculateAverage(56,78,75);
	  System.out.println("Total marks is:" + total);
	  System.out.println("Average marks is:" + avg);
	}

}
