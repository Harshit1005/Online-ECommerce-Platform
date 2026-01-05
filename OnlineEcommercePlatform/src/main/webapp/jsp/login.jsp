<form action="<%= request.getContextPath() %>/login" method="post">
    <input type="email" name="email" required>
    <input type="password" name="password" required>
    <button type="submit">Login</button>
</form>
