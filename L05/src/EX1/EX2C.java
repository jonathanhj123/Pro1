package EX1;

import java.util.Scanner;

public class EX2C {
    public static void main(String[] args) {

        // Add a method sumOddDigits returning the sum of all the odd numbers
        // prompt user to enter a number
        // call sumOddDigits to the number entered
        // print the sum of all the odd digits in the number

        System.out.println("Write an integer");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();


        int sum = sumOddints(number);

        System.out.println(sum);
    }

    public static int sumOddints(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; // Få det sidste ciffer i tallet
            if (digit % 2 != 0) {  // Kontroller om cifferet er ulige
                sum += digit; // Tilføj cifferet til summen, hvis det er ulige
            }
            number /= 10; // Fjern tallet hvis det ikke er ullige samt fjern det sidste cifre hvis det er blevet tilføjet til summen
        }
        return sum;




    }
}
