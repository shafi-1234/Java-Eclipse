package com.SqlDatabaseConnectionJDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReadTheTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc =new Scanner(System.in);
		
//		Step-1 Load The Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
//		Step5-Enter The DataBase Name
		System.out.println("Enter DataBase Name : ");
		String database=sc.nextLine();
		
//		Step-2 Establish The Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","root");
		System.out.println("Mysql Connection Established");
		
//		Step3-Ready For Statement
		Statement stmt=con.createStatement();
		
//		Step-Enter Table Name
		System.out.println("Enter Table Name : ");
		String tableName=sc.nextLine();
		
//		Step4-Write Sql Statement
		String sql="select * from "+tableName;
		
//		Step5-Ready For Result
		ResultSet rs=stmt.executeQuery(sql);
		
		
//		Step6-Result
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" | ");
			System.out.print(rs.getString(2)+" | ");
			System.out.println(rs.getString(3));

		}
		
		
		
	}

}
