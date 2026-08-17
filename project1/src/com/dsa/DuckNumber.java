package com.dsa;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		if(isDuckNumber(n)) {
			System.out.println("Duck Number");
		}else {
			System.out.println("Not Duck Number");
		}
	}
	static boolean isDuckNumber(int n) {
		boolean status=false;
		int rem=0;
		String ch= Integer.toString(n);
		if(ch.charAt(0)=='0') {
			return false;
		}
		while(n>0) {
			rem=n%10;
			n=n/10;
			if(rem==0) {
				status=true;
				break;	
			}	
		
		}
		
		return status;
	}

}
