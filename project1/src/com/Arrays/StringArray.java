package com.Arrays;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of Array : ");
		int size=sc.nextInt();
		String[] arr=  new String[size];
		sc.nextLine();
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextLine();
		}
		
//		for(String a:arr) {
//			System.out.print(a+" ");
//		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
