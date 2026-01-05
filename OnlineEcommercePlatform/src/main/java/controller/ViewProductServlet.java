package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import dao.ProductDAO;
import model.Product;

public class ViewProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Product> products = ProductDAO.getAllProducts();
        request.setAttribute("productList", products);

        RequestDispatcher rd =
                request.getRequestDispatcher("jsp/viewProducts.jsp");
        rd.forward(request, response);
    }
}
