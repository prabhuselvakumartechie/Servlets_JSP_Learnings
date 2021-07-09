package net.servlet.project.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigExample extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletConfig aServletConfig = getServletConfig();
		PrintWriter aPrintWriter = res.getWriter();

		res.setContentType("text/HTML");
		aPrintWriter.write("<html><body>");

		String servletName = aServletConfig.getServletName();
		String servletMessage = "This servlet name is " + servletName;
		aPrintWriter.write(servletMessage);

		Enumeration<String> initParamsList = aServletConfig.getInitParameterNames();
		aPrintWriter.write("<br> Param values listed below <br>");
		while (initParamsList.hasMoreElements()) {
			String paramName = (String) initParamsList.nextElement();
			String paramvalue = aServletConfig.getInitParameter(paramName);
			aPrintWriter.write(paramName + " : "+paramvalue);
		}
		
		ServletContext aServletContext = aServletConfig.getServletContext();
		String serverInfo = aServletContext.getServerInfo();
		aPrintWriter.write("<br> Server Info: " +serverInfo);
		aPrintWriter.write("</body></html>");
		
	}
}
