package com.dsa;

public class MissingNumberArray {

	public static void main(String[] args) {

		int arr[]= {1,2,4,5};
		int arrsum=0;
		for(int i=0;i<arr.length;i++) {
			arrsum+=arr[i];
		}
		int actualSum=5*(5+1)/2;		
		int missNumber=actualSum-arrsum;
		
		System.out.println("Missing Number is : "+missNumber);
	}

}
