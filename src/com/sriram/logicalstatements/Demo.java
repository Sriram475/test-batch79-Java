package com.sriram.logicalstatements;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter your category: 1.Domestic \n 2.Commercial");
	String connection = sc.next();
	float Totalbill =0f;
	switch(connection) {
	case "Domestic" -> {
	 System.out.println("please enter no.of units");
	  int units=sc.nextInt();
	  if(units<=100 && units < 300) {
		  Totalbill = units * 2;
	  }else {
		  Totalbill = units * 3;
	  }
	  System.out.println("Units consumed : "+units);
	  if(units<=100 && units < 300) {
	  System.out.println("Rate per unit is Rs:2/-");
	  }else {
		 System.out.println("Rate per unit is Rs:3/-");
	  }
	  System.out.println("Total bill amount is : " + Totalbill);
	}
	case "Commercial" ->{
		 System.out.println("please enter no.of units");
		int units=sc.nextInt();
		  if(units<=100) {
			  Totalbill = units * 4;
		  }else if(units > 100 && units <= 300){
			  Totalbill = units * 6;
		  }else {
			  Totalbill = units * 8;
		  }
		  System.out.println("Units consumed : "+units);
		  if(units<=100) {
		  System.out.println("Rate per unit is Rs:4/-");
		  }else if(units > 100 && units <= 300) {
			  System.out.println("Rate per unit is Rs:6/-")  ;
		  }else {
			 System.out.println("Rate per unit is Rs:8/-");
		  }
		  System.out.println("Total bill amount is : " + Totalbill);
	}
	}

	}

}
