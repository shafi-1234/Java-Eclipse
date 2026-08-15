package com.dsa;

import java.util.Scanner;

public class Amastrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int count=0;
			int rem=0;
			int sum=0;
			int temp=i;
		// count a number 
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		//count A Nummber
//		String digCount=Integer.toString(n);
//		int count =digCount.length();
		
		temp=i;
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.powExact(rem, count);
			temp /=10;
		}
		if(sum==i) {
			System.out.println(i+" is Amastrong");
		}
		}
		
	}
		

}
