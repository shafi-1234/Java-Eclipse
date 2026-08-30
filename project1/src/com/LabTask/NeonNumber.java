package com.LabTask;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch;
		do {
		int n =sc.nextInt();
		int ans=n*n;
		System.out.println(ans);
		int sum=0;
		int temp=0;
		while(ans>0) {
			temp=ans%10;
			sum += temp;
			ans /= 10;
		}
		if(sum==n) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not Neon Number");
		}
		System.out.println("Do You Want Continue (Yes/No) : ");
		ch=sc.next();

	}while(ch.equalsIgnoreCase("Yes"));
	}

}
