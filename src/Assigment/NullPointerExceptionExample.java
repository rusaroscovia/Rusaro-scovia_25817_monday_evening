package Assigment;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        
        try {
            // Attempting to call a method on a null reference
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}

