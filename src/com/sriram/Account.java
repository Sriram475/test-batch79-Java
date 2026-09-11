package com.sriram;

public class Account {
    int Accno;
    String name;
    int salary;
    static int accountNoGenerater=1424;
    
    {
      accountNoGenerater++;
    }
    
	public static void main(String[] args) {
	 Account a1 = new Account();
	 Account a2 = new Account();
	 a1.Accno = accountNoGenerater;

	 System.out.println("Account number:" + a1.Accno);
	}

}
