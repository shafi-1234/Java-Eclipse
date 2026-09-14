package com.Arrays;

import java.util.Arrays;

public class SortedMergeArray {

	public static void main(String[] args) {

		int a1[]= {7,2,4,3,4};
		int a2[]= {2,1,6,3};
//		Arrays.sort(a1);
		
		int a3[]= new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++) {
			a3[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[a1.length+i]=a2[i];
		}
//		Arrays.sort(a3);
		System.out.println(Arrays.toString(sortArray(a3)));
	}
	static int[] sortArray(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(	int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
