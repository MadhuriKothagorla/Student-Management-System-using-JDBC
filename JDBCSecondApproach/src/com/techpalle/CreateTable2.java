package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step-1:Load Driver
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					//step-2:Establish Connection
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjeeaugust", "root", "admin");
					//step-3:prepare statement
					Statement st=con.createStatement();
					//step-4:execute query
					st.executeUpdate("create table Employee(id int,name varchar(50),dept varchar(50))");
					//step-5:close connections
					st.close();
					con.close();
					System.out.println("Table is created successfully!,check in db");
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
