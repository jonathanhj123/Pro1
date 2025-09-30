package EX1;

import java.util.Scanner;

public class EX4A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Write the amount invested");
        double investmentAmount = scanner.nextDouble();

        System.out.println( " Enter annual interest rate in percantage: ");
        double annualInterestrate = scanner.nextDouble();

        System.out.println("Years     Future Value");

        int year = 1;
        while (year <= 30) {
            double futureValue = futureInvestmentValue(investmentAmount, annualInterestrate / 100 / 12, year);
            System.out.println( year + "\t\t" + futureValue);
            year++;
        }

    }

    public static double futureInvestmentValue (double investmentAmount, double monthlyInterestrate,int years) {
      double futureValue = investmentAmount * Math.pow(1 + monthlyInterestrate, years * 12);
      return futureValue;



    }
}
