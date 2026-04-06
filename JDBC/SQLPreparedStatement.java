package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLPreparedStatement {

	void main() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube_sql","root","1234");
		
		PreparedStatement ps=c.prepareStatement("select * from emp where ename=?");
		
		ps.setString(1, "smith");
		
		ResultSet rs= ps.executeQuery();
		
		
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
	
			System.out.println("No one found with the given name");
	
		
		
	}
}
