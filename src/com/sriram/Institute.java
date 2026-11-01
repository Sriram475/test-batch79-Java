package com.sriram;

public class Institute {
	static String trainername1 = "pavan";
	static String trainername2 = "srikanth";
	String employee_name;
	int employee_Id;
	String employee_Designation;

	public static void main(String[] args) {
	
	Institute in1 = new Institute();
	
	in1.employee_name = "sriram";
	in1.employee_Id = 101;
	in1.employee_Designation = "IT";
	
	System.out.println("Trainers names: " + trainername1 + " " + trainername2);
	
	System.out.println("employee name :" + in1.employee_name);
     
	}

}
