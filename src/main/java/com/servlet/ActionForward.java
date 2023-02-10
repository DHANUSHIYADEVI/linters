package com.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Populate
 */
public class ActionForward extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		        String minLogLevel="INFO";
				String client_id=request.getParameter("clientid");
				String client_secret=request.getParameter("clientsecret");
				String iamURL=request.getParameter("iamurl");
				String filepath = "/usr/local/tomcat/webapps/zdtdg/conf/";
				String persistence_handler_class="com.source.ZohoOAuthFilePersistence";
				String deskURL=request.getParameter("deskurl");
			    String emailid=request.getParameter("emailId");
				String oauthtoken=request.getParameter("oauthtoken");
				String orgId=request.getParameter("orgId");
				String scope="AAAserver.profile.Read,Desk.tickets.CREATE,Desk.basic.READ,Desk.basic.CREATE,Desk.contacts.CREATE,Desk.contacts.READ,Desk.activities.CREATE,Desk.activities.tasks.CREATE,Desk.tasks.CREATE,Desk.settings.CREATE,Desk.activities.calls.CREATE,Desk.basic.READ,Desk.settings.CREATE";
				int count = Integer.parseInt(request.getParameter("count"));
                
				String module=request.getParameter("module");
				response.sendRedirect("result.jsp");
	}

}
