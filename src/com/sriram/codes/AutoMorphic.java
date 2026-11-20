package com.sriram.codes;

import java.util.Scanner;

public class AutoMorphic {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a number");
	 int n = sc.nextInt();
	 int square = n * n;
     int temp=n;
     int count=0;
     int divisor=1;
     while(temp>0) {
      count++;
      temp=temp/10;
     }
     for(int i=1;i<=count;i++) {
       divisor = divisor * 10;
     }
     if(square % divisor == n) {
    	 System.out.println("Given number is a Automorphic number");
     }else {
    	 System.out.println("Given number is not a Automorphic number");
     }
	}
}
