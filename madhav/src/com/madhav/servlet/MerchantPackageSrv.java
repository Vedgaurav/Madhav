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
import com.madhav.dao.PackageDao;
import com.madhav.dao.PackageDaoImpl;
import com.madhav.dao.RecordDao;
import com.madhav.dao.RecordDaoImpl;

/**
 * Servlet implementation class MerchantPackageSrv
 */
@WebServlet("/MerchantPackageSrv")
public class MerchantPackageSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MerchantPackageSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pid=0;
		HttpSession ses = request.getSession();
		RecordDao rd = new RecordDaoImpl();
		ArrayList alist = null;
		ArrayList<PackageBean> apbean= new ArrayList<PackageBean>();
		PackageDao pdao = new PackageDaoImpl();
		
		System.out.println("this from MerchantPackageSrv.java entry");
		
		Object o=ses.getAttribute("merchantloginid");
		
		if(o!=null)
		{
			int id=(Integer)o;
			
			System.out.println(id + "This is from MerchantPackageSrv.java" );
			
			apbean = rd.getPack(id);
			
			
			ses.setAttribute("packagesofmerchant", apbean);
			
			
		}
			
		
		
		response.sendRedirect("merchantHome.jsp");
		
	}
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
