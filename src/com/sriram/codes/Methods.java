package com.sriram.codes;

import java.util.Scanner;

public class Methods {

	static int addition(int m1,int m2) {
		return m1+m2;
	}
	static int subtraction(int a1,int a2) {
		return a1-a2;
	}
	static int multiplication(int b1,int b2) {
		return b1 * b2;
	}
	static float division(int c1,int c2) {
		return c1 / c2;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers of your choice");
	final int a=sc.nextInt();
    final int b=sc.nextInt();
    // Methods m = new Methods();
    int add=Methods.addition(a,b);
    int sub= Methods.subtraction(a, b);
    int mul=Methods.multiplication(a, b);
    float div= Methods.division(a, b);
    System.out.println("Addition of two numbers is:" + add);
    System.out.println("Subtraction of two numbers is:" + sub);
    System.out.println("Multiplication of two numbers is:" + mul);
    System.out.println("Division of two numbers is:" + div);
    
   
    
	}

}
