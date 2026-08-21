package com.dsa;

import java.util.Scanner;
//Binary representation:
//9 → 1001
//Number of 1s = 2
//2 is even, so 9 is an Evil Number.

public class EvilNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int n =sc.nextInt();
		if(isEvilNumber(n)) {
			System.out.println("Evil Number");
		}else {
			System.out.println("Not Evil Number");
		}
	}
	static boolean isEvilNumber(int n) {
		boolean status=false;
	
		String num=Integer.toString(n);
		int len=num.length();
		int count=0;
		int rem=0;
		// Using For Loop[
		for(int i=0;i<len;i++) {
			if(num.charAt(i)=='1') {
				count++;
			}
			
		}
		// Using While Loop
//		while(n>0) {
//			rem=n%10;
//			n=n/10;
//			if(rem==1) {
//				count++;
//			}
//			
//		}
		if(count%2==0) {
			status=true;
		}
		
		
		return status;
	}

}
