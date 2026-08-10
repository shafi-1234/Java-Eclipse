package com.LabTask;

public class bankAccount {
	String accountHolder;
	int accountNumber;
	double balance;
	
	public bankAccount() {
		this("Unknown");
	}
	public bankAccount(String accountHolder) {
		this(accountHolder,0);
	}
	public bankAccount(String accountHolder,int accountNumber) {
		this(accountHolder,accountNumber,0.0);
	}
	public bankAccount(String accountHolder,int accountNumber,double balance) {
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	
	void display() {
		System.out.println("Account Holder Name : "+accountHolder);
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Total Balance : "+balance);
		System.out.println("--------------------------------------------");

		
	}

	public static void main(String[] args) {
		bankAccount p1= new bankAccount();
		p1.display();
		
		bankAccount p2= new bankAccount("Krishna");
		p2.display();
		bankAccount p3= new bankAccount("Krishna",123456);
		p3.display();
		bankAccount p4= new bankAccount("Krishna",123456,3000.0);
		p4.display();

	}

}
