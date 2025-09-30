import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {


        // Algorithm
        // Prompt input for purchased amount
        // Calculate sales
        // Print sales

        System.out.println("Write purchased amount : ");
        Scanner scan = new Scanner(System.in);
        double PurchasedAmount = scan.nextDouble();
        double sales = PurchasedAmount * 0.06;
        double Paid = PurchasedAmount + sales;

        System.out.println(" Amount Paid = $" + Paid);
        System.out.println(" sales = $" + sales);


    }

}