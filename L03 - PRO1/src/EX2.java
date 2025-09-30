import java.sql.SQLOutput;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        // Algorithm
        // Prompt user to input 3 numbers, Laon amount, annual interest rate, and number of years
        // Calculate monthly payment
        // Print monthly payment
        // Calculate total payment
        // Print total payment

        Scanner scan = new Scanner(System.in);

        System.out.println(" Write Loan Amount : ");
        double LoanAmount = scan.nextDouble();
        System.out.println(" Write Anual Interest Rate :");
        double AnualInterestRate = scan.nextDouble();
        System.out.println(" Write Remaining Years : ");
        int Years = scan.nextInt();

        double MonthlyPayment = calcMonthlyPayment(LoanAmount , AnualInterestRate , Years);
        double totalPayment = MonthlyPayment * 12;
        System.out.printf("MonthlyPayment = %.2f\n" , MonthlyPayment);
        System.out.printf("totalPayment = %.2f\n" , totalPayment);

    }
    public static double calcMonthlyPayment(double LoanAmount, double AnualInterestRate , int Years){

        double MonthlyInterest = AnualInterestRate / 1200;
        double MonthlyPayment = LoanAmount * MonthlyInterest / (1-1 / Math.pow(1 + MonthlyInterest, Years * 12));
        return MonthlyPayment;

    }
}
