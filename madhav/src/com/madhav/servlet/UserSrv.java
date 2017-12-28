package com.madhav.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.madhav.bean.UserBean;
import com.madhav.dao.UserDao;
import com.madhav.dao.UserDaoImpl;

/**
 * Servlet implementation class UserSrv
 */
@WebServlet("/UserSrv")
public class UserSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		
		System.out.println(name);
		
		
		UserDao ud = new UserDaoImpl();
		UserBean ubean = new UserBean(name,email,pass,contact);
		
		int uid = ud.userRegistration(ubean);
		
		HttpSession ses=request.getSession();
		
		
		
		ses.setAttribute("uid",uid);
		
		response.sendRedirect("userreg.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
