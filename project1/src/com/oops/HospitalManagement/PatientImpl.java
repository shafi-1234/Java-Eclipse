package com.oops.HospitalManagement;

import java.util.Random;
import java.util.Scanner;

public class PatientImpl implements Patient {
	Scanner sc = new Scanner(System.in);
	protected String name;
	protected String gender;
	protected int age;
	protected String pid;
	protected String diesease;
	protected String phnNumber;
	protected String address;
	
	@Override
	public String getName() {
		System.out.println("Enter Patient Name : ");
		String name=sc.nextLine();
		return name;
	}
	@Override
	 public String getGender() {
		 System.out.println("Enter Your Gender : ");
		 String gender=sc.nextLine();
		 return gender;
	 }
	
	public int getAge() {
		System.out.println("Enter Your Age : ");
		int age =sc.nextInt();
		sc.nextLine();
		return age;	
	}
	
	public String getpatientId() {
		
		Random rondom=new Random();
		int number=rondom.nextInt(1000);
		String  pid=String.valueOf(number);
		System.out.println("Enter Patient ID : "+pid);
		return pid;
		
	}
	
	public String getDiasease() {
		System.out.println("Enter The Diasease : ");
		String diesease=sc.nextLine();
		return diesease;
	}
	
	public String getPhoneNumber() {
		System.out.println("Enter Phone NUmber : ");
		String phn=sc.next();
		sc.nextLine();
		return phn;
	}
	
	public String getAddress() {
		System.out.println("Enter The Address :  ");
		String address=sc.nextLine();
		return address;
	}

}
