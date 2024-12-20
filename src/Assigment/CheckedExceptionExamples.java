package Assigment;




import java.io.*;
import java.sql.*;

public class CheckedExceptionExamples {

    public static void main(String[] args) {
        // Simulate each exception in the given order
        simulateIOException();
        simulateFileNotFoundException();
        simulateEOFException();
        simulateSQLException();
        simulateClassNotFoundException();
    }

    /**
     * Simulates and handles an IOException.
     * Scenario: Attempting to read a non-existent file.
     */
    private static void simulateIOException() {
        System.out.println("Simulating IOException...");
        try {
            FileReader reader = new FileReader("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: Unable to read file. " + e.getMessage());
        }
    }

    /**
     * Simulates and handles a FileNotFoundException.
     * Scenario: Trying to open a file that does not exist.
     */
    private static void simulateFileNotFoundException() {
        System.out.println("Simulating FileNotFoundException...");
        try {
            FileInputStream fileInputStream = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: File not found. " + e.getMessage());
        }
    }

    /**
     * Simulates and handles an EOFException.
     * Scenario: Attempting to read beyond the end of a file.
     */
    private static void simulateEOFException() {
        System.out.println("Simulating EOFException...");
        try (ByteArrayInputStream byteStream = new ByteArrayInputStream(new byte[]{}); // Empty stream
             DataInputStream dataStream = new DataInputStream(byteStream)) {
            dataStream.readInt(); // Attempting to read an integer where none exists
        } catch (EOFException e) {
            System.out.println("EOFException caught: Reached end of stream unexpectedly.");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    /**
     * Simulates and handles a SQLException.
     * Scenario: Attempting to connect to a non-existent database.
     */
    private static void simulateSQLException() {
        System.out.println("Simulating SQLException...");
        try {
            Connection connection = DriverManager.getConnection("jdbc:invalid:url", "user", "pass");
        } catch (SQLException e) {
            System.out.println("SQLException caught: Database connection error. " + e.getMessage());
        }
    }

    /**
     * Simulates and handles a ClassNotFoundException.
     * Scenario: Trying to load a non-existent class.
     */
    private static void simulateClassNotFoundException() {
        System.out.println("Simulating ClassNotFoundException...");
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: Class not found. " + e.getMessage());
        }
    }
}
