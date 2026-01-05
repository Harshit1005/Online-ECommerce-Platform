package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ecommerce_db",
                "root",
                "your_password"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
