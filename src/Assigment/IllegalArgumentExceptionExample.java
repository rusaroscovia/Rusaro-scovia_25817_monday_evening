package Assigment;

public class IllegalArgumentExceptionExample {

    // Method that expects a positive integer argument
    public static void checkPositiveNumber(int number) {
        // Block 1: Check if the number is positive
        if (number <= 0) {
            // Throw IllegalArgumentException if the argument is not a positive number
            throw new IllegalArgumentException("Number must be positive. Received: " + number);
        }
        System.out.println("The number is valid: " + number);
    }

    public static void main(String[] args) {
        
        // Block 2: Passing an invalid argument (negative number) to the method
        try {
            int invalidNumber = -5;  // Invalid input: negative number
            checkPositiveNumber(invalidNumber);  // This will throw IllegalArgumentException
        }
        // Block 3: Catching and handling IllegalArgumentException
        catch (IllegalArgumentException e) {
            // Handle the exception by printing a message
            System.out.println("Error: " + e.getMessage());
        }
        
        // Block 4: Continue the program after handling the exception
        System.out.println("Program continues to run after handling the exception.");
    }
}
