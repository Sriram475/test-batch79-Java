package com.sriram;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ObjectDemo {

	public static void main(String[] args) {

		// BigInteger
		// we can pass string into a BigInteger but it converts it into a integer
		// we can't give text data in a string it gives a NumberFormatException
		// String str="huhddhuasdfghjkdfghj"; ---> gives exception

	    // String str1 = "63737838939887383879873873879";
		BigInteger bi = new BigInteger("63737838939887383879873873879");

		// String str = "884848494949";
		BigDecimal bd = new BigDecimal(884846678);
		
		// BigDecimal bd = new BigDecimal("783838388383838848734567890");
		
		String s="hsus";
		String s1 = new String("hsus");
		if(s.equals(s1)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}

		System.out.println(bi);
	    System.out.println(bd);

	}

}
