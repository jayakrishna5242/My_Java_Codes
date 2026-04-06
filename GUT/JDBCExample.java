package com.GUT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JDBCExample {

	void main()  throws ClassNotFoundException, SQLException{
		System.out.println("Welocme to console based JDBC Employee Management Sytsem ");
		Scanner sc=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube_sql","root","1234");
		
		Statement s= c.createStatement();
		
		int n= s.executeUpdate("insert into dept values(50,'IT','Hyderabad')");
		
		if(n>0) System.out.println("Success");
		else System.out.println("Check Once again");
		
	}
}
