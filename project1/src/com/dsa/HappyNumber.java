package com.dsa;

import java.util.Scanner;

// Q) 2.Write a Java program to check whether a given number is a Happy Number.
// definition - A Happy Number is a number where the repeated sum of the squares of its digits eventually becomes 1.
// Input - 19 =>1² + 9² = 82
//         8² + 2² = 68
//         6² + 8² = 100
//         1² + 0² + 0² = 1
// Output - Happy Number
public class HappyNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
		if(happyNumber(i)) {
			System.out.println(i+" Happy Number");
		}
		}
	}
	static boolean happyNumber(int n) {
		boolean status=false;
		int sum=0;
		int rem=0;
		do {
			sum=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum+=rem*rem;
			
		}
		n=sum;
		}while(sum>9);
		return sum==1;
		
	}

}
