package com.LabTask.TryCatchException;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutBExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int n =sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter The Elements Into Arrays");
		for(int i=0;i<n;i++) {
			arr[i+1]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

	}

}
