package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import model.Product;

public class AddProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Product p = new Product();

        p.setName(request.getParameter("name"));
        p.setDescription(request.getParameter("description"));
        p.setPrice(Double.parseDouble(request.getParameter("price")));
        p.setQuantity(Integer.parseInt(request.getParameter("quantity")));

        // TEMP seller id
        p.setSellerId(2);

        boolean status = ProductDAO.addProduct(p);

        if (status) {
            response.sendRedirect("jsp/sellerDashboard.jsp?msg=Product Added");
        } else {
            response.sendRedirect("jsp/sellerDashboard.jsp?msg=Error");
        }
    }
}
