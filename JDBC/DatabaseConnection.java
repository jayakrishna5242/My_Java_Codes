package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	void main() throws  SQLException, InterruptedException {

		System.out.println("Trying to connect DataBase");
       // Loading the driver class 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}

		catch (ClassNotFoundException cfe) {
			System.err.println("Error While loading driver Class Check CLass Path");
			return;
		}

		// 1 Loading Driver Class
		System.out.println("Driver Class Loaded Successflly");

		// Connect to database using url, username ,password
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube_sql", "root", "1234");

		System.out.println("Connected To Database ");

		// Creating a statement 
		Statement s = c.createStatement();

		// Execute Query and store into result set
		ResultSet rs = s.executeQuery("select * from emp");

		
		while (rs.next()/* Acts as a cursor in sql return true if there is a next row or returns false if there is no next row */) {

			System.out.print(rs.getInt(1) + " ");
			System.out.print(rs.getString(2) + " ");
			System.out.print(rs.getString(3) + " ");
			System.out.print(rs.getInt(4) + " ");
			System.out.print(rs.getDate(5) + " ");
			System.out.print(rs.getInt(6)+" ");
			System.out.print(rs.getInt(7)+" ");
			System.out.print(rs.getInt(8)+" ");
			System.out.println();
			Thread.sleep(500);
		}

	}

}
