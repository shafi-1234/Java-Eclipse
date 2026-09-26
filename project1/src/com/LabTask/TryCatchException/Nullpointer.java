package com.LabTask.TryCatchException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nullpointer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = " ";
		int id;
		double marks;
		
		System.out.println("Enter Size Of Array : ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		sc.nextLine();
		try {
		for(int i=0;i<size+1;i++) {
			
			while (true) {

				try {
					System.out.println("Enter The Student ID : ");
					id = sc.nextInt();
					sc.nextLine();
					arr[i]=id;
					break;
				} catch (InputMismatchException e1) {
					System.out.println(e1.toString());
					System.out.println("Enter Student ID : ");
					sc.nextLine();

				}
			}
			while (true) {
				try {
					System.out.println("Enter A Name : ");
					s = sc.nextLine();
					if (s.equalsIgnoreCase("null")) {
						s = null;
					}
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
					System.out.println("Please Enter Correct Details !!");
				}
			}

			
			
			while(true) {
				try {
					System.out.println("Enter Marks of Sub 1 : ");
					String m1=sc.next();
					System.out.println("Enter Marks of sub 2 : ");
					String m2=sc.next();
					int sub1=Integer.parseInt(m1);
					int sub2=Integer.parseInt(m2);
					marks=(sub1+sub2)/2;
					System.out.println("Average Marks : "+marks);
					break;
				}
				catch(NumberFormatException e2) {
					System.out.println(e2.toString());
					System.out.println("Enter Correct marks : ");
				}
			}
			
		}
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(Arrays.toString(arr));
		}
		finally {
			sc.close();
		}

	}

}
