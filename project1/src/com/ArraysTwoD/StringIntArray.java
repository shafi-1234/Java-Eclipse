package com.ArraysTwoD;
import java.util.Arrays;
import java.util.Scanner;

//Enter a size of Row : 
//2

//Row 1
//RollNo|
//Name|
//Marks|

//Row2
//Grade|
//1
//Shafi
//96
//A
//RollNo| Name| Marks| Grade| 
//1 Shafi 96 A 

public class StringIntArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter a size of Row : ");
		int row=sc.nextInt();
		System.out.println("Enter a size of coloumn : ");
		int col=sc.nextInt();
		sc.nextLine();
		String[][] arr = new String[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextLine();
			}
		}

		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(String[] a1:arr) {
//			for(String a:a1) {
//				System.out.print(a+" ");
//			}
//			System.out.println();
//		}
	}

}
