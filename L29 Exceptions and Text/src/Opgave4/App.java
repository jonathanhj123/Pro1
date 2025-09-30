package Opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        File out = new File("C:\\Users\\jona2\\OneDrive\\Skrivebord\\Skole\\Programmering\\Exceptions and Text\\Output.txt");

        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(out)) {
            System.out.println("Type an integer : (end with -1)");
            boolean finished = false;
            while (!finished) {
                try {
                    int d = scanner.nextInt();
                    if (d == -1) {
                        finished = true;
                    } else if (d < 0) {
                        System.out.println("Has to be positive integer number");
                    } else {
                        System.out.println("Typed in: " + d);
                        System.out.println();
                        writer.println(d);

                    }
                } catch (InputMismatchException ex) {
                    System.out.println("NOT an integer number!");
                    System.out.println();
                    scanner.nextLine();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("End of program ");
    }
}
