package com.ArraysTwoD;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row NUmber : ");
		int row=sc.nextInt();
		System.out.println("Enter The Coloumn Number : ");
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		int product=1;
		System.out.println("Enter The Elements into Metrix : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				product*=arr[i][j];
			}
		}
		
		// To Print Matrix
//		System.out.println(Arrays.deepToString(arr));
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		// Prdouct of Matrix
		System.out.println("Product Of Element in the metrics : "+product);
	}

}
