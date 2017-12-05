package com.ashgen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ashgen.bean.RegBean;
import com.ashgen.connection.*;;
public class RegDao {
	public String insert(RegBean rb) {
		String username=rb.getUsername();
		String email=rb.getEmail();
		String password=rb.getPassword();
		int phoneno=rb.getPhoneno();

		
		try {
			Connection conn = DBConnection.getConnection();
			String sql = "insert into reg(username,email,phoneno,password) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2, email);
			ps.setInt(3,phoneno);
			ps.setString(4, password);
			int x=ps.executeUpdate();
			return "Sucessfully Submitted";
		} catch (SQLException sq) {
			sq.printStackTrace();
			System.out.println("Unable to insert." + sq);
		}
		catch(Exception e){
			System.out.println("connection failed." + e);
		}
		return "Submission Failed";
	}

}
