package com.weddingplanner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
     public void insertUser(User user) {
    	 String insertQuery="insert into User_Register(user_name,email_id,password) values(?,?,?)";
    	 ConnectionUtil conUtil=new ConnectionUtil();
    	 Connection con=conUtil.getDbConnection();
    	 PreparedStatement prstmt=null;
    	 try {
			prstmt=con.prepareStatement(insertQuery);
			prstmt.setString(1, user.getUser_name());
			prstmt.setString(2, user.getEmail_id());
			prstmt.setString(3, user.getPassword());
			prstmt.executeUpdate();
			System.out.println("Value inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("values not inserted");
		}
    	 
     }
     
}
