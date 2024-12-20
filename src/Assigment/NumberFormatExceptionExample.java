package Assigment;

public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        
        // Block 1: Deliberately triggering the NumberFormatException
        try {
            String invalidNumber = "abc";  // A non-numeric string
            int num = Integer.parseInt(invalidNumber);  // This will throw NumberFormatException
            System.out.println("Parsed number: " + num);
        } 
        // Block 2: Catching and handling the NumberFormatException
        catch (NumberFormatException e) {
            // This block will handle the exception if it occurs
            System.out.println("Error: Invalid number format. Could not convert string to an integer.");
            System.out.println("Exception details: " + e.toString());  // Display the exception details
        }
        
        // Block 3: Further code that continues executing after the exception handling
        System.out.println("Program continues to run after handling the exception.");
    }
}
