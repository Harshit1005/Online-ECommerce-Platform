<h3>Add New User</h3>

<form action="../AddUserServlet" method="post">
    Name: <input type="text" name="name" required><br><br>
    Email: <input type="email" name="email" required><br><br>
    Password: <input type="password" name="password" required><br><br>
    
    Role:
    <select name="role" required>
        <option value="ADMIN">Admin</option>
        <option value="SELLER">Seller</option>
        <option value="BUYER">Buyer</option>
    </select><br><br>

    <button type="submit">Add User</button>
</form>
