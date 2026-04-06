package com.JDBC;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Hack {

	// SQL Injection

	void main() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement s = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube_sql", "root", "1234")
				.createStatement();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp ID or name to search");
		String s1 = sc.next();

		
		ResultSet rs = s.executeQuery("select * from emp where empno = " + s1+ " or ename= "+s1);

		while (rs.next()) {

			System.out.println(rs.getString("empno"));
			System.out.println(rs.getString("ename"));
		}
	}
	
	// Avoiding SQL Injection Using Prepared Statement
	
	void main(String... args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		PreparedStatement s = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube_sql", "root", "1234")
				.prepareStatement("select * from emp where empno = ? or ename= ?");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp ID or name to search");
		String s1 = sc.next();

		s.setString(1, s1);
		s.setString(2, s1);
		ResultSet rs = s.executeQuery();

		while (rs.next()) {

			System.out.println(rs.getString("empno"));
			System.out.println(rs.getString("ename"));
		}
	}
	
	

}
