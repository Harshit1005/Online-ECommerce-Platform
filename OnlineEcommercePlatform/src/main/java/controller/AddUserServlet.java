package controller;

import dao.UserDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        // Server-side validation
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            response.getWriter().print("All fields are required!");
            return;
        }

        boolean result = UserDAO.addUser(name, email, password, role);

        if (result) {
            response.sendRedirect("jsp/adminDashboard.jsp");
        } else {
            response.getWriter().print("User creation failed!");
        }
    }
}
