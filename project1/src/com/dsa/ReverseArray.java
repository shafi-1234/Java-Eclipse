package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size Of Array : ");
		int n =sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int left=0;
		int right=n-1;
		int temp=0;
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
