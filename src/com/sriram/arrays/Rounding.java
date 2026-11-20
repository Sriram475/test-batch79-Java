package com.sriram.arrays;

public class Rounding {

	public static void main(String[] args) {

		int[] arr = { 99, 95, 71, 84, 81, 75, 60 };
		int rounded;

		for (int i = 0; i < arr.length; i++) {
			rounded = Math.round(arr[i] / 10.0f) * 10;
			arr[i] = rounded;
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
