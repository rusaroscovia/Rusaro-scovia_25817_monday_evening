package Assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";
        
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Creating a statement to execute SQL queries
            Statement stmt = connection.createStatement();
            
            // Executing an invalid SQL query
            String invalidSQL = "SELECT * FORM users";  // Intentional typo ("FORM" instead of "FROM")
            stmt.executeQuery(invalidSQL);
        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e.getMessage());
        }
    }
}
