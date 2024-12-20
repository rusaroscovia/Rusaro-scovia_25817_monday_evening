package Assigment;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to load a class that does not exist
            Class<?> clazz = Class.forName("com.example.NonExistentClass");
            System.out.println("Class " + clazz.getName() + " found.");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }
    }
}
