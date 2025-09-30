package EX1;

import java.util.Scanner;

public class EX2B {
    public static void main(String[] args) {

        // Prompt user to write lower and upper
        // Calculate the sum of all the even numbers.
        // Print sum of even numbers

        System.out.println("Write Lower");
        Scanner scan = new Scanner(System.in);
        int lower = scan.nextInt();
        System.out.println( "Write upper");
        int upper = scan.nextInt();

        int sum = sumEvenints(lower, upper);

        System.out.println(" The Sum of the even numbers between the parameters are " + sum);

        }
    public static int sumEvenints(int lower, int upper) {
        /*int i = lower;
        int sum = 0;
        while ( i <= upper)  {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        */

        int sum = 0;
        for (int i = lower; i<= upper; i++) {
            if (i % 2 == 0) {
                sum = sum + 1;
            }

        }
        return sum;

    }
    }
