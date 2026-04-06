package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC {

	void main() throws SQLException {
		JDBCMethods jdm = new JDBCMethods();

//		jdm.selectAll();
		ResultSet rs = jdm.selectByID(7839);

		if (rs.next()) {
			System.out.println(rs.getString(2));
		} else {
			System.out.println("No one with this id !!!!!!!!");
		}

	}
}
