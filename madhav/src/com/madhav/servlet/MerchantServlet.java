package com.madhav.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.madhav.bean.MerchantBean;
import com.madhav.bean.UserBean;
import com.madhav.dao.MerchantDao;
import com.madhav.dao.MerchantDaoImpl;
import com.madhav.dao.UserDao;
import com.madhav.dao.UserDaoImpl;

/**
 * Servlet implementation class MerchantServlet
 */
@WebServlet("/MerchantServlet")
public class MerchantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MerchantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("mname");
		String pass = request.getParameter("password");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		
		System.out.println(name);
		
		
		MerchantDao md = new MerchantDaoImpl();
		MerchantBean mbean = new MerchantBean(name,email,pass,contact);
		
		int mid = md.merchantRegister(mbean);
		
		HttpSession ses=request.getSession();
		
		
		
		ses.setAttribute("merchantid",mid);
		
		response.sendRedirect("registermerchant.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
