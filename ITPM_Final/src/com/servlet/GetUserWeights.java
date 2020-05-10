package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetUserWeights
 */
@WebServlet("/GetUserWeights")
public class GetUserWeights extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetUserWeights() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int userInputSizeWeight = Integer.parseInt(request.getParameter("weightOfSize"));
		int userInputVariableWeight = Integer.parseInt(request.getParameter("weightOfVariables"));
		int userInputMethodWeight = Integer.parseInt(request.getParameter("weightOfMethods"));

		// Weights of
		// Size---------------------------------------------------------------------------
		if (userInputSizeWeight == 1) {
			int weight = Integer.parseInt(request.getParameter("weightSize"));
			
		}

		if (userInputSizeWeight == 2) {
			int weight = Integer.parseInt(request.getParameter("weightSize"));
		}

		if (userInputSizeWeight == 3) {
			int weight = Integer.parseInt(request.getParameter("weightSize"));
		}

		if (userInputSizeWeight == 4) {
			int weight = Integer.parseInt(request.getParameter("weightSize"));
		}

		if (userInputSizeWeight == 5) {
			int weight = Integer.parseInt(request.getParameter("weightSize"));
		}

		// Weights of
		// Variables---------------------------------------------------------------------------
		if (userInputVariableWeight == 1) {
			int weight = Integer.parseInt(request.getParameter("weightVariables"));
		}

		if (userInputVariableWeight == 2) {
			int weight = Integer.parseInt(request.getParameter("weightVariables"));
		}

		if (userInputVariableWeight == 3) {
			int weight = Integer.parseInt(request.getParameter("weightVariables"));
		}

		// Weights of
		// Methods---------------------------------------------------------------------------
		if (userInputMethodWeight == 1) {
			int weight = Integer.parseInt(request.getParameter("weightMethod"));
			
		}

		if (userInputMethodWeight == 2) {
			int weight = Integer.parseInt(request.getParameter("weightMethod"));
		}

		if (userInputMethodWeight == 3) {
			int weight = Integer.parseInt(request.getParameter("weightMethod"));
		}
	}
}
