package com.sriram.logicalstatements;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("The Menu items are :");
	  System.out.println( "1.pizza - 200 \n 2.Burger - 120 \n 3.Biryani - 180 \n 4.Noodles - 100");
	  System.out.println("please enter yout category");
	  String catg = sc.next();
	  System.out.println("please enter your quantity");
	  int quantity=sc.nextInt();
	  int item_price=0;
	  double totalbill =0;
	  switch(catg) {
	    case "pizza" ->{
	    	System.out.println("Your ordered item is Pizza");
	    	item_price+=200;
	    	totalbill = quantity * item_price;
	    }
	    case "Burger" ->{
	    	System.out.println("Your ordered item is Pizza");
	    	item_price+=120;
	    	totalbill = quantity * item_price;
	    }
	    case "Biryani" ->{
	    	System.out.println("Your ordered item is Pizza");
	    	item_price+=180; 
	    	totalbill = quantity * item_price;
	    }
	    case "Noodles" ->{
	    	System.out.println("Your ordered item is Pizza");
	    	item_price+=100;
	    	totalbill = quantity * item_price;
	    }
	  }
	  System.out.println("Your total bill amount is :" + totalbill);

	}

}
