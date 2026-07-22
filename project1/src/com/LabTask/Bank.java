package com.LabTask;

public class Bank {
	static String bankName ="SBI";
	static  int Ifsc = 2454545;
	static long  AccNO=10012010;

	String holderName;
	double bal;
	
//	{
//		AccNO++;
//	}
	Bank(String holderName,double bal ){
		
		this.holderName=holderName;
		this.bal=bal;
		AccNO++;
		
	}
	
	public static void main(String[] args) {
		
		Bank p1= new Bank("shafi",4000.0);
		p1.showDetaile();
		
		
		Bank p2= new Bank("shafi",4000.0);
		p2.showDetaile();
		
		Bank p3= new Bank("shafi",4000.0);
		p3.showDetaile();
		
		Bank p4= new Bank("shafi",4000.0);
		p4.showDetaile();
		
	}
	void showDetaile() {
		System.out.println("Bank Name : "+bankName);
		System.out.println("Account Number : "+AccNO);
		System.out.println("Enter the IFSC Number : "+Ifsc);
		System.out.println("Enter the Holder Name : "+holderName);
		System.out.println("Current  Balance : "+bal);
		System.out.println("Bank Name : "+bankName);
		System.out.println("----------------------------------");
		

	}

}
