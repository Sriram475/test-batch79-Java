package com.sriram.codes;

public class BankAccountDemo {

	static int balance=1000;
	
	int deposit(int amount) {
	 return balance+=amount;
	}
	int withdraw(int amount) {
		return balance-=amount;
	}
	public static void main(String[] args) {
	 BankAccountDemo bd = new BankAccountDemo();
	 int amount = bd.deposit(500);
	 int amount1=bd.withdraw(300);
	 System.out.println("Total amount is:" + amount);
	 System.out.println("Total amount after withdrawing is : " + amount1);

	}

}
