import java.util.Scanner;

public class EX25 {
    public static void main(String[] args) {

        // Prompt the user to enter a Subtotal and a Gratuity rate
        // Calculate the Gratuity
        // Print the Gratuity
        // Calculate the total including the Gratuity
        // Print the total including the Gratuity

        Scanner scan = new Scanner(System.in);
        System.out.println( " Write the Subtotal ");
        double SubTotal = scan.nextDouble();
        System.out.println( " Write the Gratuity");
        double Gratuity = scan.nextDouble();

        System.out.println(" The Gratuity is " + (Gratuity/100) * SubTotal);
        System.out.println(" The Total is " + (SubTotal * (Gratuity/100+1) ));




    }
}
