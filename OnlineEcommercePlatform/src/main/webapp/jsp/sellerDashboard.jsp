<h2>Seller Dashboard</h2>

<a href="../viewProducts">View My Products</a>
<a href="addProduct.jsp">Add New Product</a>
<form action="../AddProductServlet" method="post">
    Product Name: <input type="text" name="name"><br>
    Description: <input type="text" name="description"><br>
    Price: <input type="text" name="price"><br>
    Quantity: <input type="text" name="quantity"><br>
    <button type="submit">Add Product</button>
</form>

<%
    String msg = request.getParameter("msg");
    if ("ProductAdded".equals(msg)) {
        out.println("<p style='color:green'>Product added successfully</p>");
    } else if ("Error".equals(msg)) {
        out.println("<p style='color:red'>Something went wrong</p>");
    }
%>
