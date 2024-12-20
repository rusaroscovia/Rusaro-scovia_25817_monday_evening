package Assigment;

import java.io.*;

public class EOFExceptionExample {

    public static void main(String[] args) {
        File file = new File("example.txt");

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            // Read content from the file
            while (true) {
                System.out.println(dis.readUTF());  // Attempt to read a string from the file
            }
        } catch (EOFException e) {
            System.out.println("End of file reached unexpectedly.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
