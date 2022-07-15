package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Driver;

public class SelectEx {

	// SQL queries - SQL Statements

	public static void main(String[] args) throws Exception {

		// registerDriver(java.sql.Driver driver)

		DriverManager.registerDriver(new Driver());

		Connection connnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt", "root", "root");

		// connnection====>[ createStatemenet() ] Connection object

		Statement statement = connnection.createStatement();

		// statement====>[ executeUpdate() , executeQuery() ] Statement object

		ResultSet resultset = statement.executeQuery("select * from ojt.student"); 
		
		int rollno;
		String name, phone;

		Statement statement2 = connnection.createStatement();

		while (resultset.next()) {
			rollno = resultset.getInt("rollno");
			name = resultset.getString("name");
			phone = resultset.getString("phone");

			if (name.contains("$") || name.contains("@")) 
			{
				System.out.println("inrollnoe if");
				statement2.executeUpdate(
						"insert into student_clone values(" + rollno + ",'" + name + "','" + phone + "')");
				// insert into student_clone values(101,'suraj','1234')
			}
			else
			{
				System.out.println("no");
			}

		}
	}
}
