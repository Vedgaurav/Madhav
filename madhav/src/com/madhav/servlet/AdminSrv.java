package com.madhav.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.madhav.dao.MerchantDao;
import com.madhav.dao.MerchantDaoImpl;

/**
 * Servlet implementation class AdminSrv
 */
@WebServlet("/AdminSrv")
public class AdminSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mid=request.getParameter("mid");
		
		int id =Integer.parseInt(mid.trim());
		
		MerchantDao mdao = new MerchantDaoImpl();
		HttpSession ses = request.getSession();
		
	boolean b=	mdao.merchantRemove(id);
	
	if(b)
		ses.setAttribute("m_id",b);
	
	response.sendRedirect("adminHome.jsp");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
