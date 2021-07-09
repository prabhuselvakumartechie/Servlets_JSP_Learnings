/**
 * 
 */
package net.servlet.project.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author prabhu.selvakumar
 *
 */
public class ServletContextExample extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletContext aServletContext = getServletContext();
		PrintWriter aPrintWriter = res.getWriter();

		res.setContentType("text/HTML");
		aPrintWriter.write("<html><body>");
		
		Enumeration<String> paramNamesList = aServletContext.getInitParameterNames();
		while (paramNamesList.hasMoreElements()) {
			String paramName = (String) paramNamesList.nextElement();
			String paramValue = aServletContext.getInitParameter(paramName);
			aPrintWriter.write("<br>"+paramName + " : " +paramValue);
		}
		
		aPrintWriter.write("<br> Session Timeout: " +aServletContext.getSessionTimeout()+" <br> ");
		SessionCookieConfig aSessionCookieConfig = aServletContext.getSessionCookieConfig();
		Cookie aCookie = new Cookie("MyCookie", "MyFirstCookie");
		res.addCookie(aCookie);
		
		aPrintWriter.write("<br>Is Session Secure? "+String.valueOf(aSessionCookieConfig.isSecure()));
		
		aPrintWriter.write("</body></html>");
		
	}
}
