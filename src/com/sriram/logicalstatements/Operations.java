package com.sriram.logicalstatements;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String fyn="";
	 do {
	 System.out.println("enter a number :");
	 double a=sc.nextInt();
	 System.out.println("enter b number");
	 double b=sc.nextInt();
	 System.out.println("Enter a operation of your choice(+,-,*,/):");
	 String ch=sc.next();
	 double result=0;
	 switch(ch) {
	 case "+"-> result=a+b;
	 case "-"-> result=a-b;
	 case "*"-> result=a*b;
	 case "/"->{
		 if(b!=0) {
		 result=a/b;
		 }else {
			 System.out.println("Error: Division by zero is not allowed.");
		 }
	 }
	 default -> System.out.println("Invalid operator");
	 
	 }
	 
	 if (ch.equals("+") || ch.equals("-") || ch.equals("*")
             || (ch.equals("/") && b != 0)) {
         System.out.println("Result is: " + result);
     }
	 System.out.println("Do you still want to continue y for yes & n for no");
	 fyn=sc.next();
	 }while(fyn.equalsIgnoreCase("y"));
	  
	 System.out.println("Calculator closed..");

	}

}
