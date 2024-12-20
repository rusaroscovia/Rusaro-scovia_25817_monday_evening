package Assigment;

public class ClassCastExceptionExample {

    public static void main(String[] args) {
        
        // Block 1: Creating objects of different types
        Object obj = "Hello, World!";  // A String object
        
        // Block 2: Deliberately triggering ClassCastException
        try {
            // Trying to cast a String object to an Integer (invalid cast)
            Integer num = (Integer) obj;  // This will throw ClassCastException
            System.out.println("Casted number: " + num);
        } 
        // Block 3: Catching and handling ClassCastException
        catch (ClassCastException e) {
            // This block will handle the exception if it occurs
            System.out.println("Error: Invalid type cast. Cannot cast a String to an Integer.");
            System.out.println("Exception details: " + e.toString());  // Display the exception details
        }
        
        // Block 4: Continuing with the program after the exception
        System.out.println("Program continues to run after handling the exception.");
    }
}
