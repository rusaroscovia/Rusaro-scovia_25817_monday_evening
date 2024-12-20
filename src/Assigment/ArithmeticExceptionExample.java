package Assigment;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulating an arithmetic operation that fails (division by zero)
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}
