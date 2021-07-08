/**
 * 
 */
package net.servlet.project.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author prabhu.selvakumar
 *
 */
public class ByImplServletInfc implements Servlet {
	private ServletConfig servletConfig;

	@Override
	public void destroy() {
		System.out.println("Servlet has been destroyed");
	}

	@Override
	public ServletConfig getServletConfig() {
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		return "Copyright -2021";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.servletConfig = config;
		System.out.println("Servlet has been initiated by using servletConfig");

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.write("<html><body>");
		out.write("This servlet created By Implementing Servlet Interface");
		out.write("</body></html>");
	}

}
