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
			Connection aConnection = ConnectionProvider.getConnection();

			PreparedStatement ps = aConnection.prepareStatement("select * from users where name=? and password=?");

			ps.setString(1, bean.getName());
			ps.setString(2, bean.getPassword());

			ResultSet rs = ps.executeQuery();
			status = rs.next();

		} catch (Exception e) {
			System.out.println("Error while executing the query >>> " + e.getMessage());
		}

		return status;
	}
}
