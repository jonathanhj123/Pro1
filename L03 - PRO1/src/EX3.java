import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {


        // Algorithm :
        // Prompt user to write 2 numbers
        // Find out which is is the lowest
        // Print the numbers with the lowest first

        Scanner scan = new Scanner(System.in);
        System.out.println(" Write 2 numbers");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        if (number1 < number2){
            System.out.println(" Lowest number is " + number1 + " Then " + number2);

        }
        else {
            System.out.println(" Lowest number is " +number2 + " Then " + number1);
        }


    }
}
