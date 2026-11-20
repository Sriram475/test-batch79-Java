package com.sriram.logicalstatements;

import java.util.Scanner;

public class TernaryDemo {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
//	 System.out.println("Enter a number of your choice");
//	 int n=sc.nextInt();
//	 System.out.println((n<0)? "negative" : "positive");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int largest = ((a>b)?((a>c)?a : c):b);
	}

}
