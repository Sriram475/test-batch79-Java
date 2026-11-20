package com.oops.encapsulation;

public class Account {

	private long accountnumber;
	private double balance;
	private String name;
	
		
	public String toString() {
		return "Account Details";
	}
	
	public Account() {
		
	}
	public Account(long accountnumber,double balance,String name){
		this.accountnumber=accountnumber;
		this.balance=balance;
		this.name=name;
	}
	
	public void setAccountNumber(long accountnumber) {
		this.accountnumber=accountnumber;
	}
	
	public long getAccountNumber() {
		return accountnumber;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public  double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
