package com.sriram;

public class StudentDemo {
	static {
		String collegename="Vishnu";
		System.out.println("collegename is : " + collegename);
	}
	
	{
		System.out.println("student object created");
	}
	
	void display() {
	  int studentid=1253;
	  String studentname="Ram";
	  String branch="IT";
	  System.out.println("studentid is : " + studentid);
	  System.out.println("studentname is : " + studentname);
	  System.out.println("branch is : " + branch);
	}
	
	static void displaycollegedetails() {
		String collegelocation="Bhimavaram";
		System.out.println("collegelocation is : " + collegelocation);
	}
	
	
	public static void main(String[] args) {
      displaycollegedetails();
      StudentDemo std = new StudentDemo();
      std.display();

	}

}
