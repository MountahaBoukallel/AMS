package LoginPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bdDAO {
    // Create the connection to the database
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/test", "root","");
    }
    // Test the connection to the database
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        getConnection();
        System.out.println("Connected");
    }
}
