package com.LabTask.TryCatchException;

import java.util.Scanner;

//.Develop a Java program to process a passenger booking.
//The system receives:
//Passenger ID and age as String
//Seat number as String
//Number of passengers
//Passenger details in an array
//Different passenger data using Object[]
//Perform these operations using multiple separate try-catch blocks:
//Convert passenger ID and age to numbers.
//Calculate average baggage: Total Baggage / Number of Passengers.
//Search a passenger using an array index.
//Cast an Object value to the expected type.
//Perform an operation on passenger data that may be null.
//Calculate booking average: Total Amount / Number of Seats.
//Handle: NumberFormatException, ArithmeticException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException, ClassCastException, and NullPointerException.
//Condition: Use separate try-catch blocks and ensure the program continues after an exception.

public class PassangerBooking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size OF BUS :" );
		int size =sc.nextInt();
		
		Object Passenger[]= {"Shafi",88,"RLO"};
		try {
		for(int i=0;i<Passenger.length;i++) {
			String s=(String)Passenger[i];
			System.out.println(s);
		}
		}catch(ClassCastException c) {
			
		}
		
		while(true) {
			try {
				System.out.println("Enter Passenger ID : ");
				String pid=sc.next();
				int id=Integer.parseInt(pid);
//				Passenger[i+1]=id;
				break;
		
			}
			catch(NumberFormatException e1) {
				System.out.println(e1.toString());
				System.out.println("Please Enter Correct ID !");
			}
		
		}
		
		while(true) {
			try {
				System.out.println("Enter passenger Age : ");
				String page=sc.next();
				int age=Integer.parseInt(page);
//				Passenger[i+1]=age;
				break;
		
			}
			catch(NumberFormatException e2) {
				System.out.println(e2.toString());

				System.out.println("Please Enter Correct Age !");
			}
		
		}
		while(true) {
			try {
				System.out.println("Enter Seat Number as String : ");
				String seatNo=sc.next();
				int seatno=Integer.parseInt(seatNo);
//				Passenger[i+1]=seatno;
				break;
		
			}
			catch(NumberFormatException e3) {
				System.out.println(e3.toString());

				System.out.println("Please Enter Correct SeatNumber !");
			}
		
		}
		
		
		double avg_bagage = 0;
		while(true) {
			System.out.println("Enter Bagage Capacity : "); 
			double taotalbagage=sc.nextInt();
			sc.nextLine();
			
		try {
			avg_bagage=taotalbagage/size;
//			Passenger[i+1]=taotalbagage;

			break;
		}catch(ArithmeticException e4) {
			System.out.println("Can Your Enter Correct Details: ");
		}
		}
		System.out.println("Average bagage : "+avg_bagage);
		
		double booking_average=0;
		while(true) {
		System.out.println("Enter Total Amount : ");
		double total_amount=sc.nextDouble();
		try {
		 booking_average=total_amount/size;
//			Passenger[i+1]=booking_average;

		break;
		}catch (ArithmeticException e5){
			System.out.println("Enter Correct Details !!");
		}
		
		}
		System.out.println("Averege Booking is : "+booking_average);
		}
}
