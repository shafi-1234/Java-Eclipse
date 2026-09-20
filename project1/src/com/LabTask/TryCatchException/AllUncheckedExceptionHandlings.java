package com.LabTask.TryCatchException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AllUncheckedExceptionHandlings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Method Started");
		System.out.println("Enter A Number : ");
		String s1= sc.next();
		System.out.println("Enter A Number : ");
		String s2 =sc.next();
		
		int num1=0;
		int num2 = 0;
		
//		 Number Format Exception
		System.out.println();
		try {
			 num1=Integer.parseInt(s1);
			 
			 num2=Integer.parseInt(s2);
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception Handled Continue the code");
			
		}
		
// 		Arithmetic Exception
		
		try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e2) {
			System.out.println("Arithmetic Exception Handled");
		}
		
//		ArrayIndexOutOfBoundsException
		
		System.out.println("Enter Size Of Array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		//	arr[6]=10;
 
		for(int i=0;i<size;i++) {
		
			try {
				System.out.println("Enter The Elements Of Array : ");
				arr[i+1]=sc.nextInt();
			}
			catch(ArrayIndexOutOfBoundsException e3) {
				System.out.println("Array Index Out Of Bounds Exception Handled");
			}			
		}
		
		System.out.println(Arrays.toString(arr));

		
//		InputMismatchException
		try {
		System.out.println("Enter a Number : ");
		int number =sc.nextInt();
		}
		catch(InputMismatchException e4) {
		System.out.println("Input Mismatch Exception Handled");
		}
		
		
//		Null Pointer Exception
		String name=null;
		try {
		System.out.println(name.length());
		}
		catch(NullPointerException e5) {
			System.out.println("Null Pointer Exception Handled");
		}
		

// 		String Out of Bound Exeception
		String s="Shafi";
		System.out.println("Your String is : "+s);
		try {
		System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e6) {
			System.out.println("String IndexOutOfBounds Exception Handled");
		}
		
		// where Finally is Going to used for Closing Statemets
		
		finally {
			sc.close();
		}
		
		System.out.println("Main Method Ended");

	}

}
