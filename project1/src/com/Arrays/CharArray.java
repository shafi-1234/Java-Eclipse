package com.Arrays;
import java.util.Scanner;


public class CharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array : ");
		int n =sc.nextInt();
		char[] arr= new char[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
