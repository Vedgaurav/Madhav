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
import com.madhav.dao.UserDao;
import com.madhav.dao.UserDaoImpl;

/**
 * Servlet implementation class LoginSrv
 */
@WebServlet("/LoginSrv")
public class LoginSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String role=request.getParameter("role");
		
		String page="login.jsp";
		
		HttpSession ses=request.getSession();
		
		
		
	
		
		
		if(uname.equals("admin") && pass.equals("admin") && role.equals("Admin")){
			
			page="adminHome.jsp";
			
		}
		else
			ses.setAttribute("flag", "invalid");
		
		if(role.equals("Merchant")){
			
			
			int id=0;
			MerchantDao dao=new MerchantDaoImpl();
			MerchantBean mb= new MerchantBean();
			String mname=dao.merchantValidate(uname, pass);
			
			
			if(mname != null){
				
				page="merchantHome.jsp";
				mb=dao.merchantRetrieve(uname);
				
				id=mb.getId();
				
				System.out.println(id+ "this is from LoginSrv.java");
				
				ses.setAttribute("mname",mname);
				ses.setAttribute("merchantloginid", id);
				
				
				
				
			}
			else 
				ses.setAttribute("flag", "invalid");
			
			
			
			
			
			
			
			
		}
		
		if(role.equals("User")){
			
			UserDao dao=new UserDaoImpl();
			
			String name = dao.userValidate(uname, pass);
			
			if(name!=null)
			{
				page="userHome.jsp";
				ses.setAttribute("uname",name );
				ses.setAttribute("useremail", uname);
						
			}
			else
			ses.setAttribute("flag", "invalid");
			
		}
		
		response.sendRedirect(page);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
