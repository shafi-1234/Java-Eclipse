package com.LabTask;
import java.util.*;
public class Patient {
	String patient_Name;
	int age;
	double room_Charge_Per_Day;
	int number_of_Days_Admitted;
	
	

	



	public Patient(String name, int age, double charge, int days) {
		
		patient_Name = name;
		this.age = age;
		room_Charge_Per_Day = charge;
		number_of_Days_Admitted = days;
		
		
	}
	
	
	void show() {
		System.out.println("Expected OutPut : ");
		System.out.println("Patient Name : "+patient_Name);
		System.out.println("Enter Age : "+age);
		System.out.println("Room charge Per day : "+room_Charge_Per_Day);
		System.out.println("Days Admited : "+number_of_Days_Admitted);
		double total_bill=(room_Charge_Per_Day)*(number_of_Days_Admitted);

		System.out.println("Total Hospital Bill : "+total_bill);
		System.out.println("----------------------------------------------");
		
	}







	public static void main(String[] args) {
		String ch;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Patient Name :");
		String name=sc.nextLine();
		System.out.println("Enter the age : ");
		int age =sc.nextInt();
		System.out.println("Enter the room charge per day : ");;
		double charge =sc.nextDouble();
		System.out.println("Number of days admited : ");
		int days=sc.nextInt();
		Patient p1= new Patient(name,age,charge,days);
		p1.show();
		System.out.println(p1);
		
		System.out.print("Do yo want to containue : ");
		ch = sc.next();
		
		}while(ch.equalsIgnoreCase("yes"));
		

		

	}

}
