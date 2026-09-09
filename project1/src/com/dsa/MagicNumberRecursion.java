package com.dsa;

import java.util.Scanner;

public class MagicNumberRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number :");
		int n =sc.nextInt();
		if(isMagicNumber(n)) {
			System.out.println("magic Number");
		}else {
			System.out.println(" not magic Number");

		}

	}
	static int SumofN(int n ) {
		int rem=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
	static boolean isMagicNumber(int n ) {
		boolean status=false;
		int newSum=SumofN(n);
		if(newSum==1) {
			status=true;
		}
		return isMagicNumber(newSum);
	}

}
