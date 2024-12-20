package Assigment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserInputIOExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the full path of the file to read:");
        String filePath = scanner.nextLine(); // Accept file path from user input

        System.out.println("Attempting to read the file...");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Reading and printing the content of the file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handling IOException if the file does not exist or cannot be read
            System.out.println("Error: Could not read the file. " + e.getMessage());
        } finally {
            System.out.println("File operation completed.");
        }

        scanner.close(); // Close the scanner
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

/**
 *
 * @author Chris Technologies
 */
public class IOE {
    
}
