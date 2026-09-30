package com.SqlDatabaseConnectionJDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
//		Step1-Loading The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
//		Step2-Establish The Connection
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadatabase","root","root");
		System.out.println("Connection Established");
		
//		Step3-Statement 
		Statement stmt=con.createStatement();
		
//		Step4-Sql Query
		System.out.println("Enter Sql Query For tabel : ");
		String sql=sc.nextLine();
		
//		Step5-Ready For Result
		int result =stmt.executeUpdate(sql);
		System.out.println("Rows Affected : "+result);
		
//		Step6-Closing The Statements
		con.close();
		stmt.close();
		sc.close();
		
								
	}

}
