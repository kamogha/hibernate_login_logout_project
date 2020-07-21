package hibernate_login_logout_dynamic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.*;
import java.util.Iterator;
import java.util.List;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nameString=request.getParameter("name");
		String password=request.getParameter("password");
		try {
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			Query query=session.createQuery("from UserFile");
			List  info=query.getResultList();
			Iterator itr=info.iterator();
			while (itr.hasNext()) {
				UserFile userFile=(UserFile)itr.next();
			String username=userFile.getUsername();
			String passwordString=userFile.getPassword();
			
			if (username.equals(nameString) && passwordString.equals(password)) {
				HttpSession session2=request.getSession();
				session2.setAttribute("name", username);
				RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}else {
				PrintWriter w = response.getWriter();
				w.println("<p style='color:red;'>invalid username/password</p>");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
			}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
