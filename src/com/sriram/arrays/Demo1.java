package com.sriram.arrays;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of array");
		 int n=sc.nextInt();
		 int pos=0;
		 int neg=0;
		 int[] nums = new int[n];
		 System.out.println("enter the array of elements");
		 for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		 }
	      
		 for(int i=0;i<n;i++) {
		  if(nums[i]>1) {
			 pos++;
		  }else {
			  neg++;
		  }
		}
		 System.out.println("The no.of positive elements in the array are: "+ pos);
		 System.out.println("The no.of negative elements in the array are: "+ neg);

	}

}
