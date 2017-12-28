package com.madhav.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.madhav.bean.MerchantBean;
import com.madhav.dao.MerchantDao;
import com.madhav.dao.MerchantDaoImpl;

/**
 * Servlet implementation class MerchantUpdateSrv
 */
@WebServlet("/MerchantUpdateSrv")
public class MerchantUpdateSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MerchantUpdateSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=0;
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		
		System.out.println(name);
		
		
		MerchantDao md = new MerchantDaoImpl();

		HttpSession ses=request.getSession();
	Object o=	ses.getAttribute("merchantloginid");
	
	if(o!=null)
	 id= (Integer)o;
	else
		System.out.println("merchant id nahi mil raha hai..");
		
	System.out.println(id);
		
		MerchantBean mbean = new MerchantBean(id,name,email,pass,contact);
		
		boolean mid = md.merchantUpdate(mbean);
		
		System.out.println(mid);
		
		
		
		
		
		ses.setAttribute("merchupdate",mid);
		
		response.sendRedirect("merchantUpdate.jsp");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
