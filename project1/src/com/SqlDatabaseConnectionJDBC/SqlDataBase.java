package com.SqlDatabaseConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlDataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		#Loading Driver Class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Connection Connected Successfully");
		
//		#Establish Connection
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube","root", "root");
		System.out.println("Sql Connection Connected Success Fully");
		//Connection is Interface
		
//		#Statement
		Statement stmt=con.createStatement();
		System.out.println("Statement Created Successfully");
//		
//		#SQl Statement
		 String sql="select * from emp";
		 ResultSet rs=stmt.executeQuery(sql);
		 System.out.println("Result is Ready");
		
//		#Print Result
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
