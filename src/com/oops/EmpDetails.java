package com.oops;

public class EmpDetails {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("sriram");
		emp.setSalary(100000.00);
		emp.setPassword("sriram@190");
		
		System.out.println("Employee Id is :" + emp.getId());
		System.out.println("Employee name is :" + emp.getName());
		System.out.println("Employee salary is :" + emp.getSalary());
		System.out.println("Employee password is :" + emp.getPassword());
	}

}
