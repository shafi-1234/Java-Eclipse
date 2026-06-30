package com.basics;

//this is a keyword in java to invoke current class Object data members.
public class Cricketer {

//  Global variable 
//	Heap Area when we create Object 
//	instance variable 
	int jerseyNo;
	String cricketerName;

	int age = 21;

//	static variable 
//	Method area when class loaded 
	static int countryId = 91;
	static String countryName = "India";

	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team ");// 15 --> 11

		System.out.println("Object1 info *********************");
		Cricketer msd = new Cricketer();
		msd.jerseyNo = 7;
		msd.cricketerName = "Mahendrs Singh Dhoni";

		System.out.println("Coutry ID : " + countryId);

		System.out.println("Jersey Number : " + msd.jerseyNo);
		System.out.println("Name of the Cricketer : " + msd.cricketerName);

		System.out.println("Object2 info *********************");
//		For every Object its creating new copy with default data for instance data.
//		For all the objects same copy will be sharable for static data. 
		Cricketer virat = new Cricketer();
		virat.jerseyNo = 18;
		virat.cricketerName = "Virat Kohli";
		System.out.println("Coutry ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + virat.jerseyNo);
		System.out.println("Name of the Cricketer : " + virat.cricketerName);

		System.out.println("Object3 info *********************");
		Cricketer rohit = new Cricketer();

		rohit.jerseyNo = 45;
		rohit.cricketerName = "Rohit Sharma";

		System.out.println("Coutry ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + rohit.jerseyNo);
		System.out.println("Name of the Cricketer : " + rohit.cricketerName);

		System.out.println("Object4 info *********************");
		Cricketer sri = new Cricketer();
		sri.jerseyNo = 9;
		sri.cricketerName = "Venkata Naga Srikanth";

		System.out.println("Coutry ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + sri.jerseyNo);
		System.out.println("Name of the Cricketer : " + sri.cricketerName);

		System.out.println("Object5 info *********************");
		Cricketer jaddu = new Cricketer();

		countryId = 92;
		countryName = "Bharath";

		jaddu.jerseyNo = 8;
		jaddu.cricketerName = "Ravindra Jadeja";
		System.out.println("Coutry ID : " + countryId);// 92
		System.out.println("Country Name : " + countryName);// Bharath
		System.out.println("Jersey Number : " + jaddu.jerseyNo);// 8
		System.out.println("Name of the Cricketer : " + jaddu.cricketerName);// RJ

		System.out.println("Object5 info *********************");
		Cricketer kl = new Cricketer();

		kl.jerseyNo = 1;
		kl.cricketerName = "Lokesh Rahul";
		System.out.println("Coutry ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + kl.jerseyNo);
		System.out.println("Name of the Cricketer : " + kl.cricketerName);

	}

}
