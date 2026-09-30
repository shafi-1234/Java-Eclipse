package com.SqlDatabaseConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
//		Step1-Loading the jdbc mysql cj Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("JDBC Cj Connector Loaded Success Fully");
		
//		Step2- Establish Coonection BEtween My Sql And Java
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		System.out.println("Connnection Establised SuccessFully");
		
//		Step-3 PreParing For The Statement
		Statement stmt=con.createStatement();
		System.out.println("Statement Created Successfully");
		
//		CRUD OPERATIONS
		while(true) {
			System.out.println("Select Your Requirement");
			System.out.println("1. Create Database ");
			System.out.println("2. Create Table ");
			System.out.println("3. Insert The Values ");
			System.out.println("4. Select Query");
			System.out.println("5. Update  Query");
			System.out.println("6. Delete Values : ");
			System.out.println("7. Exit");
			
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
		}
		
	}

}
