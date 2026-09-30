package com.SqlDatabaseConnectionJDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class InsertIntoTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=  new Scanner(System.in);
		
//		Step1-Load The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
//		Step2-Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/myjavadatabase","root","root");
		System.out.println("SQL and Java Connection Established Successfully");
		
//		Step3-Ready For Sql Statement
		Statement stmt=con.createStatement();
		System.out.println("Statement Path Cleared");
		
//		step4-Wiring the command
		System.out.println("Enter The Insert Command : ");
		String sql=sc.nextLine();
		
//		Step5-Result Ready
		int result=stmt.executeUpdate(sql);
		System.out.println("Rows Affected : "+result);
	}

}
