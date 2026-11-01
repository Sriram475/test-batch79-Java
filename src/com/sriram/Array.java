package com.sriram;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int num[] = { 1,2,3,4,5,8,10};
		int[] arr = new int[5];
		
		System.out.println("Enter the values of array");
		for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextInt();
		}
		
        System.out.println("The array values are:");
		for(int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]);
		}
		
		
	}

}
