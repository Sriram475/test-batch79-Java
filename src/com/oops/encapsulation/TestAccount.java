package com.oops.encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		
	 Account a = new Account();
	 
	 Account a1 = new Account(76353663,20200.00,"sriram");
	 
	 System.out.println("Account number is:" + a.getAccountNumber());
	 System.out.println("Balance is:" + a.getBalance());
	 System.out.println("Account holder name is:" + a.getName());
	 
	 System.out.println("Account number is:" + a1.getAccountNumber());
	 System.out.println("Balance is:" + a1.getBalance());
	 System.out.println("Account holder name is:" + a1.getName());
	 
	 System.out.println(a1);
	}

}
