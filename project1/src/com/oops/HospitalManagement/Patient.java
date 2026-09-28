package com.oops.HospitalManagement;

//Hospital Management System
//
//1. Add Patient
//2. View Patient
//3. Search Patient by ID
//4. Search Patient by Name
//5. Update Patient
//6. Delete Patient
//7. Display All Patients
//8. Exit

public interface Patient {
	
	String getName();
	
	String getGender();
	
	int getAge();
	
	String getpatientId();
	
	String getDiasease();
	
	String getPhoneNumber();
	
	String getAddress();
	
	

}
