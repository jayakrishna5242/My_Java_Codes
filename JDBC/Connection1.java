package com.JDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Connection1 {

	void main() throws Exception {

		// Step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		ResultSet p = (DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube_sql", "root", "1234")
				.createStatement())
				.executeQuery("select * from emp");

		while (p.next()) {
			System.out.print(p.getInt(1) + " ");
			System.out.print(p.getString(3) + " ");
			System.out.print(p.getString(3) + " ");

			System.out.println();
		}
	}
}
