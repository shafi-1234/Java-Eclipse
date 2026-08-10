package com.dsa;

public class ChechSortedArray {

	public static void main(String[] args) {
		int arr[]= {1,6,3,4,5};
		int n =arr.length;
		
		boolean status = true;
		for(int j=0;j<n-1;j++) {
			if(arr[j]>arr[j+1]) {
				status =false;
				break;
			}
		}
		System.out.println("The Given Array is Sorted : "+status);

	}

}
