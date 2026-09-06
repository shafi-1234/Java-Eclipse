package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class prime {
	
	static boolean isPrime(int i) {
		boolean status=true;
		if(i==0 || i==1) {
			status=false;
		}
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				 status=false;
				 break;
			}
			
		}
		return status;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int n =sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the Values : ");
		for(int i=0;i<n;i++) {
			
			arr[i]=i;
		}
		for(int i : arr) {
			if(isPrime(i)) {
				System.out.println("Prime Numbers are : "+i);
			}
			
		}

	}

}
