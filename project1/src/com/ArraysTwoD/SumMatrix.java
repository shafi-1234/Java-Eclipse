package com.ArraysTwoD;

import java.util.Arrays;
import java.util.Scanner;
public class SumMatrix {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the row  Size : ");
		int row=sc.nextInt();
		System.out.println("Enter The Coloumn Size : ");
		int col=sc.nextInt();
		int sum=0;
		int arr[][]= new int[row][col];
		System.out.println("Enter The Values into Metrics : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
			}
		}
		
// 		To Print Metrix
//		System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Sum OF all Elements : "+sum);
	}
	
	// sum of all elements
	

}
