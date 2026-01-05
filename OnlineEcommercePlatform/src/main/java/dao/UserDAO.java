package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import dao.UserDAO;
import util.DBConnection;
import java.sql.*;

public class UserDAO {
	public static String login(String email, String password) {
	    String role = null;

	    try {
	        Connection con = DBConnection.getConnection();
	        String sql = "SELECT role FROM users WHERE email=? AND password=?";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, email);
	        ps.setString(2, password);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            role = rs.getString("role");
	        }

	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return role;
	}

	
	public static boolean addUser(String name, String email, String password, String role) {
	    boolean status = false;

	    try {
	        Connection con = DBConnection.getConnection();
	        String sql = "INSERT INTO users(name, email, password, role) VALUES (?, ?, ?, ?)";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, name);
	        ps.setString(2, email);
	        ps.setString(3, password);
	        ps.setString(4, role);

	        int rows = ps.executeUpdate();
	        if (rows > 0) {
	            status = true;
	        }

	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return status;
	}
}
