/**
 * 
 */
package com.jsp.projects.connections;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author prabhu.selvakumar
 *
 */
public class ConnectionProvider {

	private static Connection aConnection = null;
	static {
		try {
			Class.forName(Provider.DRIVER);
			aConnection = DriverManager.getConnection(Provider.CONNECTION_URL, Provider.USERNAME, Provider.PASSWORD);
		} catch (Exception e) {
			System.out.println(" Exception >>> " + e.getMessage());
		}
	}

	public static Connection getConnection() {
		return aConnection;
	}
}
