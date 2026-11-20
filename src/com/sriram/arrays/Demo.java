package com.sriram.arrays;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the size of array");
	 int n=sc.nextInt();
	 int even=0;
	 int odd=0;
	 int[] nums = new int[n];
	 System.out.println("enter the array of elements");
	 for(int i=0;i<n;i++) {
		nums[i]=sc.nextInt();
	 }
      
	 for(int i=0;i<n;i++) {
	  if(nums[i]%2==0) {
		 even++;
	  }else {
		  odd++;
	  }
	}
	 System.out.println("The no.of even elements in the array are: "+ even);
	 System.out.println("The no.of odd elements in the array are: "+ odd);

	}
}
