/**
 * 
 */
package com.jsp.mvc.project.model;

import java.io.Serializable;

/**
 * @author prabhu.selvakumar
 *
 */
public class LoginBean implements Serializable {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validate() {
		return ("admin".equalsIgnoreCase(password));
	}

}
