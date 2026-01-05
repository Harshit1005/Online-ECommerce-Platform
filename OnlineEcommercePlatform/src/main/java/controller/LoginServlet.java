package controller;

import dao.UserDAO;
import util.DBConnection;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    String email = request.getParameter("email");
	    String password = request.getParameter("password");

	    String role = UserDAO.login(email, password);

	    if (role != null) {

	        if (role.equalsIgnoreCase("admin")) {
	            response.sendRedirect(request.getContextPath() + "/jsp/adminDashboard.jsp");
	        }
	        else if (role.equalsIgnoreCase("seller")) {
	            response.sendRedirect(request.getContextPath() + "/jsp/sellerDashboard.jsp");
	        }
	        else {
	            response.sendRedirect(request.getContextPath() + "/jsp/userDashboard.jsp");
	        }


	    } else {
	        response.sendRedirect(request.getContextPath() + "/jsp/login.jsp?error=1");
	    }
	}

}
