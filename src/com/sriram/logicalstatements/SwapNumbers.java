package com.sriram.logicalstatements;

public class SwapNumbers {

	public static void main(String[] args) {
		// using a third variable
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before swap" + a + " " + b);
		temp = a;
		a = b;
		b = temp;

		System.out.println("After swap" + a + " " + b);

		// without using a third variable
		int a1 = 5;
		int b1 = 6;

		System.out.println("Before swap" + a1 + " " + b1);

		a1 = a1 + b1;
		b1 = a1 - b1;
		a1 = a1 - b1;
		
		 System.out.println("After swap" + a1 + " " + b1);
		 
		 
		 
		 System.out.println("Before swap" + a1 + " " + b1);
		 
		 a1=a1^b1;
		 b1=a1^b1;
		 a1=a1^b1;
		 
		 System.out.println("After swap" + a1 + " " + b1);
		 
	}

}
