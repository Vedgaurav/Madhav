package com.madhav.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.madhav.bean.PackageBean;
import com.madhav.bean.UserBean;
import com.madhav.dao.RecordDao;
import com.madhav.dao.RecordDaoImpl;
import com.madhav.dao.UserDao;
import com.madhav.dao.UserDaoImpl;

/**
 * Servlet implementation class UserPackSrv
 */
@WebServlet("/UserPackSrv")
public class UserPackSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserPackSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int uid=0;
		UserDao udao= new UserDaoImpl();
		UserBean ubean= new UserBean();
		RecordDao rdao= new RecordDaoImpl();
		ArrayList<PackageBean> ulist = new ArrayList<PackageBean>();
		
		HttpSession ses = request.getSession();
		
		Object o = ses.getAttribute("useremail");
		
		String useremail = (String) o;
		
		System.out.println(useremail);
		
		ubean=udao.userDetails(useremail);
		
		uid=ubean.getU_id();
		
		System.out.println("user id"+uid);
		
		ulist= rdao.getUpack(uid);
		
		System.out.println(ulist);
		
		ses.setAttribute("userpackages", ulist);
		
		
		
		
		response.sendRedirect("userHome.jsp");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
