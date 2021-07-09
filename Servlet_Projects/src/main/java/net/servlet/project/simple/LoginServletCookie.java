/**
 * 
 */
package net.servlet.project.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author prabhu.selvakumar
 *
 */
public class LoginServletCookie extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter aPrintWriter = res.getWriter();
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		res.setContentType("text/html");
		
		req.getRequestDispatcher("Link.html").include(req, res);
		
		if(username.equals("Admin")&&password.equals("Password")) {
			aPrintWriter.write("You are successfully logged in");
			aPrintWriter.write("<br> Welcome "+ username);
			Cookie aCookie=new Cookie("name",username);
			res.addCookie(aCookie);
		}else {
			aPrintWriter.print("Username and Password Error!");
			req.getRequestDispatcher("login.html").include(req, res);
		}
		
		aPrintWriter.close();
	}
}
