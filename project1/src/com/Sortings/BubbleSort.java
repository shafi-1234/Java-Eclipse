package com.Sortings;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {1,1,3,5,7,9};
		int temp=0;
		int countInner=0;
		int countOuter=0;
		int count=0;
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				countInner++;
				
			}
			countOuter++;
//			if(count==0) {
//				break;
//			}
		}
		System.out.println("Loops Done By Outer Loop : "+countOuter);
		System.out.println("Loops Done By Inner Loop : "+countInner);

		
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
	}

}
