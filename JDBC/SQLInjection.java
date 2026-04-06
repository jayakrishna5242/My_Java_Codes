package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLInjection {

	void main() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/vcube_sql", "root", "1234");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to search : ");
		String str = sc.next();
		int n = sc.nextInt();
		String query = "select * from emp where ename = " + "'" + str + "'";
		String query2 = "select * from emp where empno=" + n;
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(query2);
		while (rs.next())
			System.out.println(rs.getString(2));

	}

}
