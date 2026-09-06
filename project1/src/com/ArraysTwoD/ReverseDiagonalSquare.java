package com.ArraysTwoD;

public class ReverseDiagonalSquare {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},
					  {4,5,6},
					  {7,8,9}};
		
		display(arr);
		reverseEvenIndexes(arr);
		display(arr);
		multiplyoddIndex(arr);
		SquareRhombus(arr);
		display(arr);
		System.out.println(arr.hashCode());
		System.out.println(arr);
	}
	static void reverseEvenIndexes(int arr[][]) {
		for(int i=0;i<arr.length;i+=2) {
			for(int j=0,k=arr[i].length-1;j<k;j++,k--) {
				
					int temp=arr[i][j];
					arr[i][j]=arr[i][k];
					arr[i][k]=temp;
				
			}
		}
	}
	
	static void multiplyoddIndex(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i%2!=0 && i!=j) {
					arr[i][j]*=2;
				}
			}
		}
	}
	static void SquareRhombus(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					arr[i][j]=arr[i][j]*arr[i][j];
				}
			}
		}
	}
	
	static void display(int arr[][]) {
		System.out.println("The Given Matrix is :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
