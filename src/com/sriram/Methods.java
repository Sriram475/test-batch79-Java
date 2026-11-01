package com.sriram;

public class Methods {

	static void Greeting() {
		System.out.println("In Greeting Method");
		Greeting_1();
	}

	static void Greeting_1() {
		System.out.println("In Greeting_1 Method");
	}

	void Hello() {
		System.out.println("In Hello method");
		Greeting();
		Hi();
	}

	void Hi() {
		System.out.println("In Hi method");
	}

	public static void main(String[] args) {
		System.out.println("Main Method started");
		Methods m = new Methods();
		m.Hello();
		System.out.println("Main Method ended");

	}

}
