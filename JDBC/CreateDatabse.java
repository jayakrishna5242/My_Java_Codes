package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateDatabse {

	void main() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "1234").

				createStatement().execute("create database if not exists users");

		DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "1234").createStatement()
				.execute("use users");

		DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "1234").createStatement().execute(
				"create table if not exists user(uid int  primary key auto_increment,uname varchar(30) , password varchar(30))");

	}

}
