package Assigment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {

    public static void main(String[] args) {
        // Specify the path to a file that does not exist
        String filePath = "nonexistentfile.txt";

        System.out.println("Attempting to open the file: " + filePath);

        try {
            // Attempt to open the file
            FileInputStream fileInputStream = new FileInputStream(filePath);
            System.out.println("File opened successfully (this won't execute if the file doesn't exist).");
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("FileNotFoundException caught: The specified file does not exist.");
            System.out.println("Details: " + e.getMessage());
        } finally {
            // Execute cleanup or notification tasks, if needed
            System.out.println("File operation completed.");
        }
    }
}
