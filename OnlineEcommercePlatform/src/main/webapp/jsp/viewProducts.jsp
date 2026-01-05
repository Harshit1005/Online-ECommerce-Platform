<%@ page import="java.util.*, model.Product" %>
<html>
<head>
    <title>Product Inventory</title>
</head>
<body>

<h2>Seller Product Inventory</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>

<%
    List<Product> list =
        (List<Product>) request.getAttribute("productList");

    for(Product p : list) {
%>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getDescription() %></td>
        <td><%= p.getPrice() %></td>
        <td><%= p.getQuantity() %></td>
    </tr>
<%
    }
%>
</table>

</body>
</html>
