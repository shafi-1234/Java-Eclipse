package com.LabTask;

//import java.util.Random;
import java.util.Scanner;

public class RandomCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The range of Number : ");
		int n=sc.nextInt();
		int random=(int)(Math.random()*n);
		int chances=3;
		for(int i=1;i<=chances;i++) {
			System.out.println("Chance Left : "+(chances-i+1));
			System.out.println("Enter Guess The Number : ");
			int guess=sc.nextInt();
			
			if(guess==random) {
				System.out.println("You won");
				break;
			}else if(i<3) {
				System.out.println("Try Again");
			}
			else {
				System.out.println("You Lost");
			}
			System.out.println("-----------------------------------");

			
		
		}

	}

	
	

}
