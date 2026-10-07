package com.oops.HospitalManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowPatientDetails extends PatientImpl {
	ArrayList<PatientImpl> list=new ArrayList<>(); 
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		ShowPatientDetails sd = new ShowPatientDetails();
		String status="Yes";
		System.out.println("WELCOME TO MEDICOVER HISPITALS");

		while(status.equalsIgnoreCase("Yes")) {
			System.out.println("Fill Out The Following");
			System.out.println("1. Add Patient");
			System.out.println("2. Display Patients");
			System.out.println("3. Search Patient By ID");
			System.out.println("4. Search Patient By Name");
			System.out.println("5. Update Patient");
			System.out.println("6. Delete Patient");
			System.out.println("7. Show All Patient");
			System.out.println("8. Exit");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				sd.addPatient();
				break;
			case 2:
				sd.DisplayAll();
				break;
			case 3:
				sd.searchByPatientid() ;
				break;
			case 4:
				sd.searchByName();
				break;
			case 5:
				sd.updadteDisease();
				break;
			case 6:
				sd.DeletePatientRecord();
				break;
			case 7:
				System.out.println("Hope You well Soon !! Byee  👋 ");
				break;
				
			default:
				System.out.println("Invalid Choice ");
				break;
			}
			
			
		}
	}
	
	void addPatient() {
		PatientImpl patient= new PatientImpl();
		patient.name=getName();
		patient.age=getAge();
		patient.pid =getpatientId();
		patient.gender =getGender();
		patient.phnNumber =getPhoneNumber();
		patient.diesease =getDiasease();
		patient.address =getAddress();
		
		list.add(patient);
		
		System.out.println("Patient Added Successfully");
		System.out.println("Patient Id : "+patient.pid);
		System.out.println("Patient Name : "+patient.name);
		System.out.println("Patient Age : "+patient.age);
		System.out.println("Patient Gender : "+patient.gender);
		System.out.println("Patient Phone : "+patient.phnNumber);
		System.out.println("Patient Diesease : "+patient.diesease);

		
	}
	
	void DisplayAll() {
		if(list.isEmpty()) {
			System.out.println("There are No Patient");
			return;
		}
		for(int i=0;i<list.size();i++) {
			PatientImpl patient= list.get(i);
			
			if(patient!=null) {
				System.out.println("----------------------------------------");
				System.out.println("Patient Id : "+patient.pid);
				System.out.println("Patient Name : "+patient.name);
				System.out.println("Patient Age : "+patient.age);
				System.out.println("Patient Gender : "+patient.gender);
				System.out.println("Patient Phone : "+patient.phnNumber);
				System.out.println("Patient Diesease : "+patient.diesease);
				System.out.println("Patient Address : "+patient.address);
				System.out.println("----------------------------------------");
				
			}
		}
		
	}
	
	void searchByPatientid() {
		System.out.println("Enter Patient ID : ");
		String pid =sc.next();
		boolean found=false;
		
		for(int i=0;i<=list.size();i++) {
			PatientImpl patient= list.get(i);
			if(patient!=null && pid.equalsIgnoreCase(patient.pid)) {
				System.out.println("Patient Found");
				System.out.println("Patient Name : "+patient.name);
				System.out.println("Patient Id : "+patient.pid);
				System.out.println("Patient Phone Number : "+patient.phnNumber);
				System.out.println("Patient Diesease : "+patient.diesease);

				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Patient Not Found");
		}
	}
	
	void searchByName() {
		sc.nextLine();
		System.out.println("Enter Patient Name : ");
		String pname=sc.nextLine();
		boolean found=false;
	
		for(int i=0;i<list.size();i++) {
			PatientImpl patient= list.get(i);
			if(patient!=null && pname.equalsIgnoreCase(patient.name)) {
				System.out.println("Patient Found");
				System.out.println("Patient Name : "+patient.name);
				System.out.println("Patient Id : "+patient.pid);
				System.out.println("Patient Phone Number : "+patient.phnNumber);
				System.out.println("Patient Diesease : "+patient.diesease);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Patient Not Found");
		}
	}
	
	void updadteDisease() {
		System.out.println("Enter Patient Name , Patient Id :  ");
		String input=sc.nextLine();

		boolean found=false;
		for(int i=0;i<list.size();i++) {
			PatientImpl patient = list.get(i);
			if(input.equalsIgnoreCase(patient.pid) || input.equalsIgnoreCase(patient.name)) {
				
				System.out.println("Change Disease");
				patient.diesease=sc.nextLine();
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("PerSon Not Found");
		}
	}
	void DeletePatientRecord() {

		System.out.println("Enter Patient Name Or Patient Id : ");
		String pname=sc.nextLine();
		String pid=sc.next();
		boolean found=false;
		for(int i=0;i<list.size();i++) {
			PatientImpl patient=list.get(i);
			if(pid.equalsIgnoreCase(patient.pid) || pname.equalsIgnoreCase(patient.name)) {
				list.remove(i);
				System.out.println("Patient Removed Successfully !!");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Patient Not Found");
		}
	}
	

	

}
