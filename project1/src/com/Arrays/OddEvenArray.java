package com.Arrays;

import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Array : ");
		int n =sc.nextInt();
		int oddCount=0;
		int evenCount=0;
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int a:arr) {
			if(a%2==0) {
				System.out.println(a+"Even Number");
				oddCount++;
				
			}else {
				System.out.println(a+"Odd Number");
				evenCount++;
			}
		}
		System.out.println("Even Count : "+evenCount);
		System.out.println("Odd Count : "+oddCount);

	}

}
