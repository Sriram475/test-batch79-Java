package com.sriram;

public class Calculation {
	static int total() {
		int total=450;
		int cookie=10;
		int chocolate=15;
		total = total - (cookie * 5) - (chocolate * 10);
		return total;
	}

	public static void main(String[] args) {
	    System.out.println(total());
	}

}
