package com.LabTask;
import java.util.*;
public class calculatorTerinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch;
		do {
		System.out.print("Enter the First Numnber : ");
		int n1 =sc.nextInt();
		System.out.println("Enter The Second Number : ");
		int n2=sc.nextInt();
		System.out.println("Enter The Operatot (+ or -) : ");
		String op = sc.next();
		int res=(op.equals("-"))?(n1-n2):(n1+n2);
		System.out.println("Your Result is "+res);
		
		System.out.println("Do You want continue(Yes/No) ");
		ch =sc.next();
		}while(ch.equalsIgnoreCase("Yes"));

	}

}
