package Assigment;


public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // Attempting to access an invalid index (index 10 is out of bounds)
            int value = numbers[10];  // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
