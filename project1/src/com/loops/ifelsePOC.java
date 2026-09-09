package com.loops;

import java.util.Scanner;

public class ifelsePOC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vcube Matrimony");
		System.out.println("Whats Your Name");
		String name=sc.nextLine();
		if(name.contains("Reddy")|| name.contains("reddy")){
			System.out.println("Can you plese give your asset value");
			double asset=sc.nextDouble();
			System.out.println("Can You plese Share your ssalary");
			double salary=sc.nextDouble();
			if(asset>5000000 || salary >200000) {
				System.out.println("Nice to Know your Details");
			
				System.out.println("How Many siblings Do You Have : ");
				int n =sc.nextInt();
				if(n<=2) {
					System.out.println("Nice To Know");
					System.out.println("How Many Sisters Do You Have : ");
					int sis=sc.nextInt();
					if(sis <=1) {
						System.out.println("Ohh Nice to Know");
						System.out.println("Your Sister Mariage is completed");
						boolean mar=sc.nextBoolean();
						if(mar=true) {
							System.out.println("Nice To Know");
							System.out.println("Do You have any loans ");
							boolean loans= sc.nextBoolean();
							if(loans=!true) {
								System.out.println("Ohh Nice to Know");
							}else {
								System.out.println("We Not moving wityh you thank you for showing intrest");
							}
						}else {
							System.out.println("Ohh Sorry we Are not moving with You");
						}
					}else {
						System.out.println("Thank you for intrest but we not moving forward with you");
					}
				}else {
					System.out.println("Ohh Sorry we Are not moving with You");
				}
			}else {
				System.out.println("Your Profile is not match with our expetentaion");
			}
		}else {
			System.out.println("Sorry Your Profile is Not Selected");
		}
		

	}

}
