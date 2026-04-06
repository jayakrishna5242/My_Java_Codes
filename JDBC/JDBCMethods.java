package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDBCMethods {

	static Connection con = JDBCConnection.getConnection();

	void selectAll() {

		try {
			PreparedStatement p = con.prepareStatement("select * from emp");

			ResultSet rs = p.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ResultSet selectByID(int id) throws SQLException{
			PreparedStatement p = con.prepareStatement("select * from emp where empno=?");
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();
			return rs;
		} 
	
}
