package com.ArraysTwoD;

import java.util.Scanner;
//1 2 3    9 8 7    10 10 10
//4 5 6  + 6 5 4  = 10 10 10
//7 8 9    3 2 1    10 10 10

public class SumSameSidesArrays {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row Size : ");
		int row=sc.nextInt();
		System.out.println("Enter THe Coloumn Size : ");
		int col=sc.nextInt();
		// 1 Matrix
		int arr[][]= new int[row][col];
		
		// Creating Elements in array
		CreatingArray(arr,sc);
		
		// Result Array
		result(arr);
		
		// 2 Matrix
		int arr1[][] = new int[row][col];
		
		// creating array
		CreatingArray(arr1,sc);
		
		// result
		result(arr1);
		
		// Sum of Two Array
		System.out.println("Sum of Two Arrays : ");
		int sumArray[][]=sum(arr,arr1,row,col);
		result(sumArray);
		
		
	}
	static void CreatingArray(int arr[][],Scanner sc ) {
		System.out.println("Enter The Array Elements ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	static void result(int arr[][]) {
		System.out.println("Matrix");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
	
	}
	static int[][] sum(int arr[][],int arr1[][],int row,int col){
		int sum[][]= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		return sum;
	}
}
