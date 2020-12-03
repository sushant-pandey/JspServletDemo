package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		if(username.equals("sp") && password.equals("sp")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			response.sendRedirect("Welcome.jsp");
		} else {
			response.sendRedirect("Login.jsp");
		}
	}

}
