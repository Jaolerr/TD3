package com.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.model.CB;
import com.model.Paiement;
import com.model.Paypal;
import com.util.HibernateUtil;

/**
 * Servlet implementation class ServletMain
 */
@WebServlet("/ServletMain")
public class ServletMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Session s;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		s=HibernateUtil.getSessionFactory().openSession();
		this.getServletContext().getRequestDispatcher("/WEB-INF/page.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			s.beginTransaction();
			Paiement P1= null;
			System.out.println(request.getParameter("paiement"));
			if(request.getParameter("paiement").equals("CB")) {
				System.out.println("hello");
				System.out.println(Integer.parseInt(request.getParameter("montant")));
				CB carte= new CB(Integer.parseInt(request.getParameter("montant")), LocalDate.now(), Integer.parseInt(request.getParameter("numCarte")),LocalDate.parse(request.getParameter("dateCarte")));
				System.out.println(carte);
				System.out.println("carte");
				s.save(carte);
				s.getTransaction().commit();
			}
			else {
				if(request.getParameter("paiement").equals("Paypal")) {
					Paypal payp= new Paypal(Integer.parseInt(request.getParameter("montant")), LocalDate.now(), Integer.parseInt(request.getParameter("numPaypal")));
					s.save(payp);
					s.getTransaction().commit();
				}
			}
			
		}
		catch (Exception e) {
			s.getTransaction().rollback();
			// TODO: handle exception
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/page.jsp").forward(request, response);
	}

}
