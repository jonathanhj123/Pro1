package Opgave2;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\jona2\\OneDrive\\Skrivebord\\Skole\\Programmering\\Exceptions and Text\\Opgave1.txt";
        File in = new File(fileName);
        ArrayList<Integer> Numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(in)) {
            double sum = 0;
            while (scanner.hasNextLine()) {
                int d = scanner.nextInt();
                Numbers.add(d);
            }
            for ( int i = 5; i > -1; i--) {
                System.out.println(Numbers.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

    }
}
