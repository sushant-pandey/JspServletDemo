package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Videos
 */
public class Videos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Videos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("video " + username);
		if(username == null || password == null) {
			response.sendRedirect("Login.jsp");
		}
		else if(username.equals("sp") && password.equals("sp")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			response.sendRedirect("Videos.jsp");
		} else {
			response.sendRedirect("Login.jsp");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
