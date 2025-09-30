package EX1;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        int max = 99;
        int minimum = 10;

        int lotteryNumber = (int)(Math.random() * (max-minimum) +10);

        Scanner scan = new Scanner(System.in);
        System.out.println( " Guess the lottery number");
        int guess = scan.nextInt();

        if (guess == lotteryNumber){
            System.out.println( " YOU WIN $ 10.000");
        }

        int guessFirstDigit = guess/10;
        int guessLastDigit = guess%10;
        int LotteryFirstDigit =  lotteryNumber/10;
        int LotteryLastDigit = lotteryNumber%10;
        if (( guessFirstDigit) == LotteryLastDigit && guessLastDigit == LotteryFirstDigit ){
            System.out.println(" YOU WIN $3000");
        }
        if (guessFirstDigit == LotteryFirstDigit || guessFirstDigit == LotteryLastDigit){
            System.out.println(" YOU WIN $1000");
        }
        if (guessLastDigit == LotteryLastDigit || guessLastDigit == LotteryLastDigit){
            System.out.println( " YOU WIN $1000");
        }
        else {
            System.out.println( "YOU LOSE, LOSER");
        }
        System.out.println("The lottery Number Was : " + lotteryNumber);

    }
}
