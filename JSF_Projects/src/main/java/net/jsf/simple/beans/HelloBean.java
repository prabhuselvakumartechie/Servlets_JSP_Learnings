/**
 * 
 */
package net.jsf.simple.beans;

import java.io.Serializable;

/**
 * @author prabhu.selvakumar
 *
 */
public class HelloBean implements Serializable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
