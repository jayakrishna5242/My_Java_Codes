package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	static Connection con = null;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube_sql", "root", "1234");
			con = conn;
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} catch (ClassNotFoundException e2) {
			System.out.println(e2.getMessage());
		}

		return con;
	}
}
