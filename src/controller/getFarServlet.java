package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class getFarServlet
 */
@WebServlet("/getFarServlet")
public class getFarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// code belows processes the post request and writes the method farenToString from TempConverter.java
		String userTemp = request.getParameter("userTemp");
		TempConverter userFaren = new TempConverter(Double.parseDouble(userTemp));
		request.setAttribute("userTemps", userFaren);
		getServletContext().getRequestDispatcher("/farenResult.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(userFaren.farenToString());
		writer.close();
	}

}
