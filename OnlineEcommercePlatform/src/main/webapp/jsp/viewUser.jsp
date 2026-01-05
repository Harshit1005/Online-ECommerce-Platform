<%@ page import="java.sql.*, util.DBConnection" %>

<h3>All Users</h3>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Role</th>
    <th>Action</th>
</tr>

<%
Connection con = DBConnection.getConnection();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM users");

while(rs.next()){
%>
<tr>
    <td><%=rs.getInt("user_id")%></td>
    <td><%=rs.getString("name")%></td>
    <td><%=rs.getString("email")%></td>
    <td><%=rs.getString("role")%></td>
    <td>
        <a href="../DeleteUserServlet?id=<%=rs.getInt("user_id")%>">Delete</a>
    </td>
</tr>
<% } %>
</table>
