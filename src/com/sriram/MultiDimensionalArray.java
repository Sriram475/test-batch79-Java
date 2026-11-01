package com.sriram;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] nums = new int[3][4];

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of array");
		//Intialization of values
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
        System.out.println("The array values are:");
        //Accessing the values
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}
