package com.sriram.arrays;

import java.util.Scanner;

public class SwapZeroes {

	public static void main(String[] args) {
		int j=0;
		int[] arr = { 1, 0, 0, 35, 4, 0, 38, 0 };
		for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					j++;
				}
		}
		System.out.println("Array elements after swapping :");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}
}