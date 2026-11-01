package com.sriram;

public class WrapperDemo {
    Integer studentid=1626;
    Integer marks=78;
    Boolean status=true;
    int n = marks;
	public static void main(String[] args) {
	 
	WrapperDemo wm = new WrapperDemo();
	System.out.println("studentid is :" + wm.studentid);
	System.out.println("Student Marks is :" + wm.marks);
	System.out.println("Result is :" + wm.status);
	System.out.println("Wrapper to int  :" + wm.n);
	}

}
