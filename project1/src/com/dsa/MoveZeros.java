package com.dsa;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {

		int arr[]= {1,2,0,5,0,6,0};
		int n =arr.length;
		int temp=0;
		int left=0;
		
		for(int right=0;right<arr.length;right++) {
			if(arr[right]!=0) {
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
