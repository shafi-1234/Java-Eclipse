package com.ArraysTwoD;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Row Number : ");
		int row=sc.nextInt();
		System.out.println("Enter Coloumn NUmber : ");
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		creatingArray(arr,row,col,sc);
		Result(arr,row,col);
		swap(arr,row,col);
		diagonal(arr,row,col);
	}
	static void creatingArray(int arr[][],int row,int col,Scanner sc) {
		System.out.println("Enter The NUmbers ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	static void Result(int arr[][],int row ,int col) {
		System.out.println("MAtrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void swap(int arr[][],int row,int col) {
		System.out.println("Swap of Matrix");
		int n =arr.length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][n-1];
				arr[i][n-1]=temp;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void diagonal(int arr[][],int row,int col) {
		System.out.println("Diagonal Squares");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					System.out.print(arr[i][j]*arr[i][j]+" ");
				}else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	

	

}
