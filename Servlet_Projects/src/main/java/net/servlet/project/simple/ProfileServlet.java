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
import javax.servlet.http.HttpSession;

/**
 * @author prabhu.selvakumar
 *
 */
public class ProfileServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter aPrintWriter = res.getWriter();
		Cookie cookies[] = req.getCookies();
		HttpSession session = req.getSession();
		
		if (cookies != null && cookies[0] != null) {
			String name = cookies[0].getValue();
			if (name != null && !name.equals("")) {
				aPrintWriter.print("<br>Welcome to Profile</br>");
				aPrintWriter.print("<br>Welcome, " + name);
			} else {
				aPrintWriter.write("Please login first");
				req.getRequestDispatcher("login.html").include(req, res);
			}
		} else {
			aPrintWriter.write("Please login first");
			req.getRequestDispatcher("login.html").include(req, res);
		}
		aPrintWriter.close();
	}
}
