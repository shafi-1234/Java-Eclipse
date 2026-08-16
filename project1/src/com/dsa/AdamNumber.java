package com.dsa;

//Example: 12
//Square of 12:
//12² = 144
//Reverse of 12:
//21
//Square of 21:
//21² = 441
//Reverse of 144:
//441
//Both match.
//Therefore, 12 is an Adam Number.

import java.util.Scanner;

public class AdamNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		if(isAdam(n)) {
			System.out.println(n+" is Adam Number");
		}else {
			System.out.println(n+" is Not Adam Number");
		}
		
	}
	static boolean isAdam(int n) {
		boolean status=false;
		int squareN=n*n;
		int revNum=reverse(n);
		int squarerevNum=revNum*revNum;
		if(squareN==reverse(squarerevNum)) {
			status=true;
		}
		return status;
		
	}
	// Reverse A Number 
	static int reverse(int n) {
		int rem=0;
		int rev=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		return rev;
	}

}
