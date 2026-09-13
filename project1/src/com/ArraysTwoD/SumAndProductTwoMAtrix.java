package com.ArraysTwoD;

import java.util.Scanner;

public class SumAndProductTwoMAtrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row size : ");
		int row=sc.nextInt();
		System.out.println("Enter The col size : ");
		int col=sc.nextInt();
// Matrix 1
		int arr[][]= new int[row][col];
		creatingArray(arr,row,col,sc);
		
		
// Matrix 2
		int arr1[][]=new int[row][col];
		creatingArray(arr1,row,col,sc);
		
		
		
//// Print 1 matrix		
		result(arr,row,col);
		int sum1=sum(arr,row,col);
		int prodcut1=product(arr,row,col);
	
//// Print 2 Matrix
		result(arr1,row,col);
		int sum2=sum(arr1,row,col);
		int product2=product(arr1,row,col);
		
		System.out.println("The Sum of Two Matrix : "+(sum1+sum2));
		System.out.println("The Product of Two Matrix : "+(prodcut1+product2));

	}
	
	static void creatingArray(int arr[][],int row,int col,Scanner sc) {
		System.out.println("Enter  Matrix Elements : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		
	}
	static void result(int arr[][],int row,int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
	}
	static int sum(int arr[][],int row,int col) {
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
	static int product(int arr[][],int row,int col) {
		int product=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				product*=arr[i][j];
			}
		}
		return product;
	
	}

}
