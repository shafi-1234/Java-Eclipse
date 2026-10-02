package com.SqlDatabaseConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		
//		Step1-Loading the mysql cj jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("MYSQL Cj JDBC Driver Loaded");
		
//		Step2-Establish The Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube","root","root");
		System.out.println("Java And SQl Connection Established");
		
//		Step3-Statement Creation
		Statement stmt =con.createStatement();
		System.out.println("Statement Creation is ready !!");
		
//		Step4-Write Sql Statement
		System.out.print("Enter SQL Statement/Query : ");
		String sql=sc.nextLine();
		
//		Step5-Ready For Result
		ResultSet rs=stmt.executeQuery(sql);
		
//		Step6-Print the Result
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" | ");
			System.out.print(rs.getString(2)+" | ");
			System.out.print(rs.getString(3)+" | ");
			System.out.print(rs.getInt(4)+" | ");
			System.out.print(rs.getDate(5)+" | ");
			System.out.print(rs.getInt(6)+" | ");
			System.out.print(rs.getInt(7)+" | ");
			System.out.println(rs.getInt(8)+" | ");


		}
		
	}

}
