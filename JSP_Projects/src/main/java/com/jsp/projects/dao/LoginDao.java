/**
 * 
 */
package com.jsp.projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jsp.projects.connections.ConnectionProvider;
import com.jsp.projects.model.LoginBean;

/**
 * @author prabhu.selvakumar
 *
 */
public class LoginDao {

	public static boolean validate(LoginBean bean) {
		boolean status = false;
		try {
			Connection con = ConnectionProvider.getConnection();

			PreparedStatement ps = con.prepareStatement("select * from users where email=? and pass=?");

			ps.setString(1, bean.getEmail());
			ps.setString(2, bean.getPassword());

			ResultSet rs = ps.executeQuery();
			status = rs.next();

		} catch (Exception e) {
			System.out.println("Error while executing the query >>> " + e.getMessage());
		}

		return status;

	}
}
