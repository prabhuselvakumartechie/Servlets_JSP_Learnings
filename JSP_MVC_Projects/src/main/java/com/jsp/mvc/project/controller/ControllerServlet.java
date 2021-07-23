/**
 * 
 */
package com.jsp.mvc.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import com.jsp.mvc.project.model.LoginBean;

/**
 * @author prabhu.selvakumar
 *
 */
public class ControllerServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		LoginBean bean = new LoginBean();
		bean.setName(username);
		bean.setPassword(password);
		req.setAttribute("Bean", bean);

		boolean status = bean.validate();

		if (status) {
			RequestDispatcher reqDispatcher = req.getRequestDispatcher("login-success.jsp");
			reqDispatcher.forward(req, res);
		} else {
			RequestDispatcher reqDispatcher = req.getRequestDispatcher("login-error.jsp");
			reqDispatcher.forward(req, res);
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req, res);
	}
}
