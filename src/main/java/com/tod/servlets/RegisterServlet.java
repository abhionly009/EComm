package com.tod.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tod.entities.UserInfo;
import com.tod.helper.FactoryProvider;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {

			String name = request.getParameter("user_name");
			String mobile = request.getParameter("user_mobile");

			String email = request.getParameter("user_email");

			String password = request.getParameter("user_password");

			String address = request.getParameter("user_address");

			Session fa = FactoryProvider.getFactory().openSession();
			Transaction tx = fa.beginTransaction();

			UserInfo userInfo = new UserInfo(name, email, mobile, password, null, address, "normal", true);
			long id = (Long) fa.save(userInfo);

			tx.commit();
			fa.close();
			HttpSession session = request.getSession();
			session.setAttribute("message", userInfo.toString());
			System.out.println("User created successfully ");
			System.out.println("Id" + id);
			
			response.sendRedirect("register.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
