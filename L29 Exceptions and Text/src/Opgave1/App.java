package Opgave1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\jona2\\OneDrive\\Skrivebord\\Skole\\Programmering\\Exceptions and Text\\Opgave1.txt";
        File in = new File(fileName);
        try (Scanner scanner = new Scanner(in)) {
            double sum = 0;
            while (scanner.hasNextLine()) {
                int d = scanner.nextInt();
                d =+ d;
                System.out.println("The number input was : " +d/2 + " Double is: " + d);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
