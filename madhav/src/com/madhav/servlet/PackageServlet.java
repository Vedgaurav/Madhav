package com.madhav.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.madhav.bean.PackageBean;
import com.madhav.dao.PackageDao;
import com.madhav.dao.PackageDaoImpl;
import com.madhav.dao.RecordDao;
import com.madhav.dao.RecordDaoImpl;


@WebServlet("/PackageServlet")
public class PackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PackageServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id=0;
		
		
		String p_name=request.getParameter("name");
		String p_descr= request.getParameter("details");
		String p_rate = request.getParameter("rate");
		String p_count = request.getParameter("count");
	
		
		
		
		System.out.println(p_name);
		
		Double prate = Double.valueOf(p_rate);
		int pcount = Integer.parseInt(p_count);
		
		PackageDao pd= new PackageDaoImpl();
		PackageBean pbean = new PackageBean(p_name,p_descr,prate,pcount);
		RecordDao rd= new RecordDaoImpl();
		
		System.out.println(pbean);
		
		 id = pd.packageCreate(pbean);
		System.out.println(id);
		
		
		
		HttpSession ses = request.getSession();
		
		ses.setAttribute("id", id);
		
	Object obj=	ses.getAttribute("merchantloginid");
	
	if(obj!=null)
	{
	int merchantid=(Integer)obj;
	
	System.out.println(merchantid);
	
	rd.merPack(id, merchantid);
		
	}else
		System.out.println("merchant id nahi mila");
		
		response.sendRedirect("packagedetails.jsp");
		
		
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
