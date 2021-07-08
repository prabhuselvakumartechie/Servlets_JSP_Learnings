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
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		PrintWriter pw = res.getWriter();
		
		if (username.equals("Admin") && password.equals("Password")) {
			RequestDispatcher rD = req.getRequestDispatcher("WelcomeServlet");
			rD.forward(req, res);
		} else {
			pw.print("Sorry Username or Password Error!");
			RequestDispatcher rD = req.getRequestDispatcher("/index.html");
			rD.include(req, res);
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
