package controller;

import util.DBConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class DeleteUserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM users WHERE user_id=?"
            );
            ps.setInt(1, id);
            ps.executeUpdate();

            response.sendRedirect("jsp/viewUsers.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
