package com.ArraysTwoD;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Size : ");
		int row=sc.nextInt();
		System.out.println("Enter Coloumn Size : ");
		int col=sc.nextInt();
		int arr[][] = new int[row][col];
		
		creatingArray(arr,row,col,sc);
		
		result(arr,row,col);
		
		transpose(arr,row,col);
	}
	static void creatingArray(int arr[][],int row,int col,Scanner sc) {
		System.out.println("Enter The Array Elements : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	static void transpose(int arr[][],int row,int col) {
		System.out.println("Transpose of Matrix ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	
	static void result(int arr[][],int row,int col) {
		System.out.println("Normal Matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
