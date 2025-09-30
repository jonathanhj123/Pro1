import javax.swing.*;
import java.util.Scanner;

public class EX2C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input the amount of numbers between 1-99");
        double amount = scanner.nextDouble();
        int i = 1;
        int biggest = 0;
        int amountOfBiggest = 0;

        for (i = 1; i <= amount; i++) {
            System.out.println(" Write the " + i + " " + "Number ");
            int numb = scanner.nextInt();
            if (biggest == numb) {
                amountOfBiggest++;
            }
            if (biggest < numb) {
                biggest = numb;
                amountOfBiggest = 1;
            }
        }
        System.out.println("The biggest number is : " + " " + biggest + " occurs" + " " + amountOfBiggest);
    }
}
