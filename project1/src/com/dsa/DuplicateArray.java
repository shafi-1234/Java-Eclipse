package com.dsa;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[]= {7,2,6,1,8,2,7};
		int n =arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
//			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[i+1]) {
					System.out.println("Duplicates Are : "+arr[i]);
//				}
			}
		}
	}

}
