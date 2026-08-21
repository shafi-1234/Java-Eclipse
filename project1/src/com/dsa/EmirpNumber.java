package com.dsa;

import java.util.Scanner;

//An Emirp Number is a prime number whose reverse is also a different prime number.
//Example: 13
//13 is prime
//Reverse of 13 = 31
//31 is also prime
//13 ≠ 31
//Therefore, 13 is an Emirp Number.
//Note: A number like 11 is not Emirp because its reverse is the same number.

public class EmirpNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int n =sc.nextInt();
		if(isEmirpNumber(n)) {
			System.out.println(n+" is Emirp Number");
		}else {
			System.out.println(n+" is Not Emirp Number");
		}
		
	}
	//EmirpNumber
	static boolean isEmirpNumber(int n) {
		boolean status=false;
		int reverNum=reverse(n);
		if(isPrime(n)==isPrime(reverNum) && reverse(n)!=n ) {
			status=true;
			
		}
		return status;
	}
	// reverse Number
	static int reverse(int n) {
		int rem=0;
		int rev=0;
		while(n>0){
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		return rev;
	}
	// prime Number check
	static boolean isPrime(int n) {
		boolean status=true;
		if(n==0 || n==1) {
			return false;
		}
		int rem=0;
		for(int i=2;i<n;i++) {
			rem=n%i;
			if(rem==0) {
				return false;
			}
		}
		return status;
	}
	

}
