/**
 * 
 */
package net.servlet.project.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author prabhu.selvakumar
 *
 */
public class WelcomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("name");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/HTML");
		pw.write("<html><body>Welcome " + username + "</body><html>");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
