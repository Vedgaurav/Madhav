package com.madhav.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.madhav.bean.UserBean;
import com.madhav.dao.PackageDao;
import com.madhav.dao.PackageDaoImpl;
import com.madhav.dao.RecordDao;
import com.madhav.dao.RecordDaoImpl;
import com.madhav.dao.UserDao;
import com.madhav.dao.UserDaoImpl;



/**
 * Servlet implementation class BookSrv
 */
@WebServlet("/BookSrv")
public class BookSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		int uid=0;
		int pid=Integer.parseInt(request.getParameter("pid"));
		
		int qn=Integer.parseInt(request.getParameter("qn"));
		
		String page="fails.jsp";
		
		PackageDao pdao=new PackageDaoImpl();
		UserDao udao= new UserDaoImpl();
		RecordDao rdao = new RecordDaoImpl();
		UserBean userbean  = new UserBean();
		HttpSession ses = request.getSession();
		
		
		
		ses.setAttribute("count", qn);
		ses.setAttribute("pid", pid);
		
		Object o =ses.getAttribute("useremail");
		String useremail = (String)o;
		userbean=udao.userDetails(useremail);
		 
		uid= userbean.getU_id();
		
		
		
		int no=pdao.avail(pid);
		
		System.out.println(no);
		
		if(no >=qn){
			
			boolean f2=pdao.packageCountUpdate(pid,qn);
			
			
			System.out.println(f2);
			
			if(f2)
			{
				int bookid= rdao.book(uid,pid);
				ses.setAttribute("bookid",bookid);
				page="sucess.jsp";
			}
		}
		else{
			page="notavailable.jsp";
		}
		
		request.getRequestDispatcher(page).forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
