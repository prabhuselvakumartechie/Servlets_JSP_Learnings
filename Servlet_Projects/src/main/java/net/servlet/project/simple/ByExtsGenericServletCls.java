/**
 * 
 */
package net.servlet.project.simple;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author prabhu.selvakumar
 *
 */
public class ByExtsGenericServletCls extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.write("<html><body>");
		out.write("This servlet created By Extends Servlet class");
		out.write("</body></html>");
	}

}
