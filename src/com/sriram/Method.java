package com.sriram;

public class Method {
	
	Method(){
		Method4();
	}
	
	static void Method1() {
		System.out.println("In Method1 block");
		Method2();
		Method3();
	}
	
	static void Method2() {
		System.out.println("In Method2 block");
	}
	
	static void Method3() {
		System.out.println("In Method3 block");
	}
	
	void Method4() {
		System.out.println("In Method4 block");
		Method5();
	}
	
	void Method5() {
		System.out.println("In Method5 block");
		Method1();
	}
	
	static Method m = new Method();

	public static void main(String[] args) {


	}

}
