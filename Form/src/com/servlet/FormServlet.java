package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
/*import javax.servlet.annotation.WebServlet;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FormDao;
import com.model.Form;

/**
 * Servlet implementation class FormServlet
 */
//@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
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
		//doGet(request, response);
		System.out.print("I am in servlet");
		String emp_name = request.getParameter("emp_name");
		String emp_no = request.getParameter("emp_no");
		String email = request.getParameter("email");
		String emp_mob_no = request.getParameter("emp_mob_no");
		System.out.println("--------"+emp_name);
		Form form = new Form();
		form.setEmail(email);
		form.setEmp_mob_no(emp_mob_no);
		form.setEmp_name(emp_name);
		form.setEmp_no(emp_no);
		
		FormDao ref = new FormDao();
		ref.insertRecord(form);
		
		
	}

}
