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
public class LogoutServletCookie extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter aPrintWriter = res.getWriter();
		res.setContentType("text/HTML");
		req.getRequestDispatcher("Link.html").include(req, res);
		
		Cookie aCookie = new Cookie("name", "");
		aCookie.setMaxAge(0);
		res.addCookie(aCookie);
		
		aPrintWriter.print("You are successfully logged out");
	}
}
