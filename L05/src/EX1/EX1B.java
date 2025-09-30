package EX1;

import java.util.Scanner;

public class EX1B {
    public static void main(String[] args) {
        // Prompt user til at give limit en værdi mellem 1-100
        // Programmer en while-løkke som summere alle kvadrattal mellem 1 og limit

        Scanner scan = new Scanner(System.in);
        System.out.println(" Write a limit thats above 1");
        int limit = scan.nextInt();
        int i = 0;
        int sum = 0;
        while ( i * i <= limit) {
                sum = sum + i * i;
                i++;
            }
            System.out.println("Sum is " + sum);

        }


    }
