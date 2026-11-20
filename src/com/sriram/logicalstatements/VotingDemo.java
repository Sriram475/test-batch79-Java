package com.sriram.logicalstatements;

import java.util.Scanner;

public class VotingDemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age:");
	int age=sc.nextInt();
	sc.nextLine();
	System.out.println("enter your citizenship");
	String citizenship = sc.next();
	sc.nextLine();
	System.out.println("Do you have VoterId");
	String voterid=sc.next();
	
	if(age<0) {
		System.out.println("Invalid age");
	}else if(age<18) {
		System.out.println("you are not eligible to vote");
	}else if(!(citizenship.equalsIgnoreCase("Indian"))) {
		System.out.println("you are not eligible to vote");
	}else if(!(voterid.equalsIgnoreCase("yes"))) {
		System.out.println("you are not eligible to vote");
	}else {
		System.out.println("you are eligible to vote");
	}
}
}
