package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LaptopDAO;
import model.Laptop;

/**
 * Servlet implementation class FetchAllLaptopsController
 */
public class FetchAllLaptopsController extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LaptopDAO dao = new LaptopDAO();
		
		List<Laptop> listOfLaptop = dao.fetchAllLaptops();
		request.setAttribute("laptops", listOfLaptop);
		RequestDispatcher rd = request.getRequestDispatcher("showAllLaptops.jsp");
		rd.forward(request, response);
	}
}
