package com.LabTask.TryCatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineStudentPortal {

	public static void main(String[] args) {
		
		int sub1 = 0;
		int sub2 = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size : ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		while(true) {
		System.out.println("Enter The Student ID : ");
		try {
			int name =sc.nextInt();
			break;
		}catch(InputMismatchException e){
			System.out.println("Input Mismatch Exception Handled");
			System.out.println("Please Enter Correct ID !!");
		}
		}
		
		
		String s=null;
		try {
			System.out.println(s.length());
		}catch(NullPointerException e1) {
			System.out.println("NullPointerException Handled");
		}
		
		try {
		System.out.println("Enter Sub1 marks");
		String marks1=sc.next();
		System.out.println("Enter Sub1 marks");
		String marks2=sc.next();
		 sub1=Integer.parseInt(marks1);
		sub2=Integer.parseInt(marks2);
		}
		catch(NumberFormatException e2) {
			System.out.println("Number Format Exception Handled");
		}
		
		try {
			
			double marks=sub1/sub2;
		}catch(ArithmeticException e3){
			System.out.println("Arithmetic Exception Handled");
			
		}
		
		for(int i=0;i<size;i++) {
			arr[i+1]=sc.nextInt();
		}
		
	}

}
