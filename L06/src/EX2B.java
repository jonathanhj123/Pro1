import java.util.Scanner;

public class EX2B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Input the amount of numbers between 1-99");
        double amount = scanner.nextDouble();
        int i = 1;
        int sum = 0;

        for (i = 1; i <= amount; i++) {
            int numb = scanner.nextInt();
            sum = sum + numb;
            System.out.println("The sum so far is " + sum);
        }
    }
}
