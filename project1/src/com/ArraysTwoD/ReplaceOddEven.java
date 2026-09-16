package com.ArraysTwoD;

import java.util.Scanner;

public class ReplaceOddEven {
	static void CreatingArray(int arr[][],int row, int col,Scanner sc) {
		System.out.println("Enter The Elements : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
//	int[][] arr= {{1,2,3},
//				  {4,5,6},
//				  {7,8,9}};
	static void Show(int arr[][],int row, int col) {
		System.out.println("The Given Matrix is ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void replaceOddEven(int arr[][],int row,int col) {
		System.out.println("Replace The Odd and Even ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]%2==0) {
					arr[i][j]=0;
				}else {
					arr[i][j]=-1;
				}
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A row Number : ");
		int row=sc.nextInt();
		System.out.println("Enter A Coloumn Number : ");
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		CreatingArray(arr,row,col,sc);
		Show(arr,row,col);
		replaceOddEven(arr,row,col);
	}


}
