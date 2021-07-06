/**
 * 
 */
package net.simple.login.jdbc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.simple.login.bean.LoginBean;

/**
 * @author prabhu.selvakumar
 *
 */
public class LoginDao {

	public boolean validate(LoginBean loginbean) throws ClassNotFoundException, SQLException {

		boolean status = false;
		// Register a Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			// Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training_db?useSSL=false",
					"traininguser", "admin@123");

			// Execute the query
			PreparedStatement preparedstatement = connection.prepareStatement("select * from login where username = ? and password = ?");
			preparedstatement.setString(1, loginbean.getUsername());
			preparedstatement.setString(2, loginbean.getPassword());

			System.out.println("Query: " + preparedstatement);
			ResultSet resultSet = preparedstatement.executeQuery();
			status = resultSet.next();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
