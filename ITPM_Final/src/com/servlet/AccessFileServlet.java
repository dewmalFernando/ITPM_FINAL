package com.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.model.Files;
import com.service.FilesService;
import com.service.SizeComplexity;

import utils.Common;
import utils.IndividualFunction;
import utils.StatementLine;

/**
 * Servlet implementation class AccessFileServlet
 */
@WebServlet("/AccessFileServlet")
public class AccessFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Files files = new Files();
	FilesService filesService = new FilesService();
	Common common = new Common();
	SizeComplexity sizeComplexity = new SizeComplexity();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccessFileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		String code = request.getParameter("demo");
		
		out.println(code);
		
		files.setCode(code);
		
		HttpSession httpSession = request.getSession();
		
		String[] tempArray;
		
		String[] codeArray = code.split("\\r?\\n");
		httpSession.setAttribute("lines", codeArray);
		int arrayLen = codeArray.length;
		int start;
		int end;
		
		for(start=0;start<arrayLen;start++) {
			out.println("Line " + (start+1) +" :" + codeArray[start]);
		}
		
		ArrayList<IndividualFunction> allFunctions = common.divideToFunctions(codeArray);
		for(start=0;start<allFunctions.size();start++) {
			IndividualFunction function = allFunctions.get(start);
			out.println(function.getStart());
			out.println(function.getEnd());
			out.println(function.getMethodName());
		}
		
		 ArrayList<StatementLine> StatementListCtc = sizeComplexity.sizeComplexity(allFunctions, codeArray);
		 
		 
		 out.println("Ctc Value for lines -------------------------------------------------------------------------------");
		 
		 for(start=0;start<StatementListCtc.size();start++) {
			 StatementListCtc.get(start);
			 out.println("Line Number " + StatementListCtc.get(start).getLineNumber() + ": Ctc :  " + StatementListCtc.get(start).getComplexity());
		 }
		 
		 ArrayList<StatementLine> StatementListCnc =  sizeComplexity.calculateComplexityByNestingControlStructure(allFunctions, codeArray);
	 
		 out.println("Cnc Value for lines -------------------------------------------------------------------------------");
		 
		 for(start=0;start<StatementListCnc.size();start++) {
			 StatementListCnc.get(start);
			 out.println("Line Number " + StatementListCnc.get(start).getLineNumber() + ": Cnc :  " + StatementListCnc.get(start).getComplexity());
		 }
		 
		
		httpSession.setAttribute("Ctc", StatementListCtc);
		httpSession.setAttribute("Cnc", StatementListCnc);
		request.getRequestDispatcher("size.jsp").forward(request, response);
		
		
	}
	
	

}
