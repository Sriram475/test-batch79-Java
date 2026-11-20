package com.sriram.codes;

import java.util.Scanner;

public class RandomNum{

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int num = (int)(Math.random()*100);
	 System.out.println("you got 3 chances to win the game:");
	 int i=0;
	 do{
		 System.out.println("Enter a number of your choice");
		 int guess=sc.nextInt();
		 if(guess == num) {
		   System.out.println("Congratulations you won!!");
		   break;
		 }else if(guess<num) {
		   System.out.println("your'e bit low Please try again!!");
		 }else {
			 System.out.println("your'e bit higher Please try again!!");	
		 }
		 i++;
	 }while(i<3);
     if(i==3) {
    	System.out.println("you lost!!");
    	System.out.println("The original number was :" + num);
     }
	}

}
