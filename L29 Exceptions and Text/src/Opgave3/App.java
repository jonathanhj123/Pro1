package Opgave3;

import com.sun.source.tree.IfTree;

import javax.swing.text.DefaultStyledDocument;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
            int antal = 0;
            String filename = "C:\\Users\\jona2\\OneDrive\\Skrivebord\\Skole\\Programmering\\Exceptions and Text\\Output.txt";
            try (Scanner scanner = new Scanner(System.in)) {
                while (antal <= 0) {
                    try {
                        System.out.println("Filename:");
                        filename += scanner.next();
                        System.out.print("Talet der skal skrive op til i filen: ");
                        antal = scanner.nextInt();
                    }
                    catch (InputMismatchException ex) {
                        System.out.println("Antal skal være et positivt heltal.");

                    }
                }
            }

            try (PrintWriter printWriter = new PrintWriter(filename)) {
                int number = 0;
                for (int i = 1; i <= antal; i++) {
                    if (number %2 != 0) {
                        printWriter.println(number);
                        number++;
                    }
                    else {
                        number++;
                    }

                }
                System.out.println("Fil med alle ulige tal op til : " + antal);
            }
            catch (FileNotFoundException ex) {
                System.out.println("Error finding or creating file: " + filename);
            }
        }

}
