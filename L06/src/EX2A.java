import java.util.Scanner;

public class EX2A {
    public static void main(String[] args) {

        // Prompt user to input the amount of numbers between 1-99
        // Calculate the biggest, smallest and the amounts of odd and even numbers
        // Print said calculation.

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Input the amount of numbers between 1-99");
        double amount = scanner.nextDouble();

        int biggestnumber = 0;
        int smallestnumber = 999999999;
        int evenNumbers = 0;
        int oddNumbers = 0;


        for (int i = 1; i <= amount; i++) {
            System.out.println(" Write the " + i + " "+ "Number ");
            int numb = scanner.nextInt();
            if (numb > biggestnumber){
                biggestnumber = numb;
            }
            if (numb < smallestnumber) {
                smallestnumber = numb;
            }
            if (numb % 2 == 0){
                evenNumbers++;
            }
            if (numb % 2 != 0){
                oddNumbers++;
            }
        }

        System.out.println( " The biggest number is " + biggestnumber);
        System.out.println( " The smallest number is " + smallestnumber);
        System.out.println( " The amount of even numbers are " + evenNumbers);
        System.out.println( " The amount of odd numbers are " + oddNumbers);







    }
}

