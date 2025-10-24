package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step-2:Establish Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjeeaugust", "root", "admin");
			PreparedStatement pst=con.prepareStatement("update student set course=? where id=?");
			pst.setString(1,"Hibernate");
			pst.setInt(2, 102);
			int rowsEffected=pst.executeUpdate();
			System.out.println("rowsEffected"+rowsEffected);
			pst.close();
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
