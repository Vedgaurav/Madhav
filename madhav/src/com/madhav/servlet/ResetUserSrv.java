package com.madhav.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.madhav.dao.UserDao;
import com.madhav.dao.UserDaoImpl;

/**
 * Servlet implementation class ResetUserSrv
 */
@WebServlet("/ResetUserSrv")
public class ResetUserSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetUserSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		System.out.println("coming in reset user srv");
		String email = request.getParameter("email");
		String pass  = request.getParameter("pass");
		
		UserDao udao = new UserDaoImpl();
		HttpSession ses = request.getSession();
		
		System.out.println("getting email"+email);
		String uname = udao.userValidate(email, pass);
		
		if(uname!=null)
		{
			boolean b=true;
				ses.setAttribute("uservalidated", b);
				
		
		
		
		
		
				email=request.getParameter("newemail");
				pass=request.getParameter("newpass");
				
				
				b= udao.userUpdate(email,pass);
				if(b)
					ses.setAttribute("userupdated", b);
				
			}
		
		
		response.sendRedirect("reset.jsp");
		}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
