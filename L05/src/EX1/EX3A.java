package EX1;

import javax.swing.*;
import java.util.Scanner;

public class EX3A {
    public static void main(String[] args) {

        // Prompt user to enter an integer
        // Write a method that reverses the numbers
        // Call that method to the number
        // Write a boolean method that is true if the number is Palindrome
        // Call the method

        Scanner scan = new Scanner(System.in);
        System.out.println(" Write an Integer");
        int number = scan.nextInt();

        int reversedNo = reverse(number);
        boolean Palindrome = isPalindrome(number);
        System.out.println("Is" +number + " a palindrome? = " + Palindrome);

    }


    public static int reverse( int number) {

        int reversedNo = 0;
        while (number != 0) {
            int digit = number % 10; // Få det sidste ciffer i tallet
            reversedNo = reversedNo * 10 + digit;
            number /= 10;
        }
        return reversedNo;
    }
    public static boolean isPalindrome(int number){
        return number == reverse(number);
        }

}

