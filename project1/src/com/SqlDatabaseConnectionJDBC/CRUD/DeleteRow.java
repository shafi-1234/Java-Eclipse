package com.SqlDatabaseConnectionJDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
//		Step1-Load the Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
//		Step2-Establish the connection between mysql and java
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/myjavadatabase","root","root");
		System.out.println("Connection Between Sql and Java Established");
		
//		Step3-Ready for Statement
		Statement stmt=con.createStatement();
		System.out.println("Ready For Sql Query");
		
//		For Delete We Should Trun off AutoCommit
		String commit="set AutoCommit=0";
		stmt.execute(commit);
		
		System.out.println("Auto commit is Off");
		
//		Step4-Enter The Query
		System.out.println("Enter The query: ");
		String sql=sc.nextLine();
		
		
//		Step5-Ready For Result
		int result=stmt.executeUpdate(sql);
		System.out.println("Rows Affected : "+result);
		
//		Roll Back
		System.out.println("Do You Want To RollBack (Yes/NO) : ");
		String YN=sc.next();
		if(YN.equalsIgnoreCase("Yes")) {
			con.rollback();
			System.out.println("RollBacked!!");
			
		}else {
			con.commit();
			System.out.println("Query Deleted Successfully !!");
		}
	}

}
