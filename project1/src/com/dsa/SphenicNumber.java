package com.dsa;

//A Sphenic Number is a number that is the product of exactly three distinct prime numbers.
//Example: 30
//30 = 2 × 3 × 5
//2, 3 and 5 are three different prime numbers.
//Therefore, 30 is a Sphenic Number.


import java.util.Scanner;

public class SphenicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		for(int i=0;i<=n;i++) {
		if(isSphenicNumber(i)) {
			System.out.println(i+" is Sphenic Number");
		}
//		else {
//			System.out.println(i+" is Not Sphenic Number");
//		}
		}
		
	}
	static boolean isSphenicNumber(int n) {
		boolean status=false;
		int sum=1;
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0 && isprime(i)) {
				count++;	
				sum=sum*i;
				
			}
		}
		if( sum==n && count==3) {
			return true;
		}
		return false;
	}
	// prime check
	static boolean isprime(int n) {
		boolean status=true;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
			}
		}
		return status;
	}

}
