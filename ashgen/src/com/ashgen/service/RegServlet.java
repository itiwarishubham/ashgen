package com.ashgen.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashgen.bean.RegBean;
import com.ashgen.dao.RegDao;


@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		int phoneno=Integer.parseInt(request.getParameter("phoneno"));
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		if((email.length()==0) || (request.getParameter("phoneno")).length()==0){
			request.setAttribute("msg", "Invalid Data");
			RequestDispatcher reqd=request.getRequestDispatcher("index.jsp");
			reqd.forward(request, response);
		}
		RegBean rb=new RegBean(username, email, phoneno, password);
		RegDao rd=new RegDao();
		String message=rd.insert(rb);
		request.setAttribute("msg", message);
		RequestDispatcher reqd=request.getRequestDispatcher("index.jsp");
		reqd.forward(request, response);
	}

}
