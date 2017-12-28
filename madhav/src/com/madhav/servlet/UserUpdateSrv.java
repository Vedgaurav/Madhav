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
 * Servlet implementation class UserUpdateSrv
 */
@WebServlet("/UserUpdateSrv")
public class UserUpdateSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdateSrv() {
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
		UserBean ub= new UserBean();
		System.out.println(name);
		
		
		UserDao md = new UserDaoImpl();
		
		ub=md.userDetails(email);
		id=ub.getU_id();

		HttpSession ses=request.getSession();
	
	
	
		
	System.out.println(id);
		
		UserBean mbean = new UserBean(id,name,email,pass,contact);
		
		boolean mid = md.userUpdate(mbean);
		
		System.out.println(mid);
		
		
		
		
		
		ses.setAttribute("userupdate",mid);
		
		response.sendRedirect("userUpdate.jsp");
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
