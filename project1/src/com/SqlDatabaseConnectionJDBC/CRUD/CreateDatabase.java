package com.SqlDatabaseConnectionJDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
//		Step1-Loading The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
//		Step2-Establish The Connection of sql and java
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		System.out.println("Connection Connected Successfully");
		
//		Step3-Statement Loader
		Statement stmt=con.createStatement();
		
//		Step4-Write DataBase Name
		System.out.println("Enter DataBase Name :  ");
		String DbName=sc.nextLine();
		
//		Step6-Database Command
		String sql="Create database "+DbName;
		System.out.println("DataBase Created");
		
//		Step5-Execute The Query
		int result=stmt.executeUpdate(sql);
		System.out.println("Rows Effected : "+result);
		System.out.println("Your Database Name is : "+sql);
		
	}

}
