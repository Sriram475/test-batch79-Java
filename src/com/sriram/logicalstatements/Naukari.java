package com.sriram.logicalstatements;

import java.util.Scanner;

public class Naukari {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = sc.nextLine();
		System.out.println("could you tell me your passed out year");
		int year = sc.nextInt();
		if (year == 2026) {
			System.out.println("yeah you are eligible,can we move on to few more questions");
			System.out.println("can i know your cgpa");
			float cgpa = sc.nextFloat();
			if (cgpa >= 8.0) {
				System.out.println("you are eligible");
                System.out.println("Do you have any active backlogs");
                boolean isBacklogsActive = sc.nextBoolean();
                if(! isBacklogsActive) {
                	System.out.println("you are eligible");
                	
                }else {
                	System.out.println("you are not eligible");
                }
			} else {
				System.out.println("you are not eligible");
			}
		} else {
			System.out.println("sorry ! you are not eligible");
		}

	}

}
