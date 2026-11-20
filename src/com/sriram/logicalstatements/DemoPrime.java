package com.sriram.logicalstatements;

import java.util.Scanner;

public class DemoPrime {
	static boolean isPrime(int n) {
		boolean status = true;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
		  if(n%i==0) {
			 status=false;
			 break;
		  }
		}
	 return status;
	}

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("please enter a number :");
	  int n=sc.nextInt();
	  if(isPrime(n)) {
		 System.out.println("Given number is a prime");
	  }else {
		 System.out.println("Given number is not a prime");
	  }

	}

}
