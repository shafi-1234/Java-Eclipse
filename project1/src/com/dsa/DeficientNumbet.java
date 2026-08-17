package com.dsa;

import java.util.Scanner;

//Example: 8
//Proper divisors:
//1, 2, 4
//Sum:
//1 + 2 + 4 = 7
//7 < 8
//Therefore, 8 is a Deficient Number.

public class DeficientNumbet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		if(isDeficientNumbet(n)) {
			System.out.println(n+" is Deficient Number");
		}else {
			System.out.println(n+" is Not Deficient Number");
		}
		
	}
	static boolean isDeficientNumbet(int n) {
		boolean status=false;
		int rem=0;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum<n) {
			status=true;
		}
		return status;
	}

}
