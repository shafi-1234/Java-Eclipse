package com.Sortings;

import java.util.Arrays;

public class BubbleSortOptimized {

	public static void main(String[] args) {
		int arr[]= {1,1,3,5,7,9};
		int temp=0;
		int count=0;
		int countInner=0;
		int countOuter=0;
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
				countInner++;
				
			}
			
			countOuter++;
			if(count==0) {
				break;
			}

		}
		System.out.println("Loops Done By Outer Loop : "+countOuter);
		System.out.println("Loops Done By Inner Loop : "+countInner);

		
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
	}

}
//Brute Force
//Before Sorting : 
//[1, 1, 3, 5, 7, 9]
//Loops Done By Outer Loop : 5
//Loops Done By Inner Loop : 15
//After Sorting : 
//[1, 1, 3, 5, 7, 9]

//OptimiZed Code
//Before Sorting : 
//[1, 1, 3, 5, 7, 9]
//Loops Done By Outer Loop : 1
//Loops Done By Inner Loop : 5
//After Sorting : 
//[1, 1, 3, 5, 7, 9]

