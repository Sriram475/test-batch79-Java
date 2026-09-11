package com.sriram;

public class Student {
	static String collegeName="VIT"; 
	int studentId;
	String studentName;
	int studentMarks;

	public static void main(String[] args) {
	 
     Student s1 = new Student(); 
     s1.studentId = 101;
     s1.studentName = "sriram";
     s1.studentMarks = 70;
     
     System.out.println("College name:" + collegeName);
     System.out.println(s1.studentId);
     System.out.println(s1.studentName);
     System.out.println(s1.studentMarks);
	}

}
