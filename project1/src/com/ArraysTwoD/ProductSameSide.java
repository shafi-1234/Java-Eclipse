package com.ArraysTwoD;

import java.util.Scanner;
//1 2 3    1 2 3    1  4  9
//4 5 6  * 4 5 6  = 16 20 36
//7 8 9    7 8 9    49 64 81

public class ProductSameSide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row Size : ");
		int row=sc.nextInt();
		System.out.println("Enter The Coloumn Size : ");
		int col =sc.nextInt();
		
		// First  array
		int arr[][]=new int[row][col];
		
		// reading Elements into Array
		creatingArray(arr,row,col,sc);
		
		// Result 
		result(arr);
		
		
		// Second Array 
		int arr1[][]= new int[row][col];
		
		//Reading Elements Into Array
		creatingArray(arr1,row,col,sc);
		
		// result 
		result(arr1);
		
		// Product Of Two Arrays 
		System.out.println("Product of Two Arrays ");
		int productArray[][]= product(arr,arr1,row,col);
		result(productArray);
		
		
	}
	
	// Creating Array
	static void creatingArray(int arr[][],int row,int col,Scanner sc) {
		System.out.println("Enter The Elements : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
	}
	// Product 
	static int[][] product(int arr[][],int arr1[][],int row ,int col) {
		int product[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				product[i][j]=arr[i][j]*arr1[i][j];
			}
		}
		return product;
	}
	
	//Result 
	static void result(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
