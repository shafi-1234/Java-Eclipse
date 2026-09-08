package com.dsa;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
		if(isMagic(i)) {
			System.out.println(i+" Magic Nummber");
		}
//		else {
//			System.out.println("Not a magic number");
//		}
		}
		

	}
	static boolean isMagic(int n ) {
		boolean status=false;
		int sum=0;
		int rem=0;
		do {
			sum=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum+=rem;
		}
		n=sum;
		}while(sum>9);
		
//		System.out.println(sum);
//		if(sum==1) {
//			 status =true;
//		}
		
		return sum==1;
		
	}
}
