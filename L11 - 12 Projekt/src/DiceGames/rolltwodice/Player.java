package DiceGames.rolltwodice;

import DiceGames.rollonedie.Die;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Player {
    private static DiceGames.rollonedie.Die die;
    private static DiceGames.rollonedie.Die die2;
    private static int rollCount;

    public static int [] countArray = new int[7];

    public static double sum;
    public static int thisSum;
    public static int biggestSum = 0;
    public static int count;
    public static int value;

    public static double avgSum;

    public Player() {
        this.die = new Die();
        this.die2 = new Die();
    }

    public static void CalcArray() {
        countArray[die.getFaceValue()]++;
        countArray[die2.getFaceValue()]++;
    }

    public static void getArrayValue() {
        for (int i = 1; i < 7; i++) {
            System.out.println("The eyes of " + i + " has been rolled " + countArray[i]);

        }
    }


    public static void biggestSum() {
        if (biggestSum > thisSum) {
            biggestSum = biggestSum;
        }
        else {
            biggestSum = thisSum;
        }
    }
    public static void printBiggestSum() {
        System.out.println("The biggest sum is = " + biggestSum);
    }
    public static void amountOfSame() {
        count++;
    }

    public static void printSame() {
        System.out.println("The amount of same value rolled = " + count);
    }

    public int getRollCount() {
        return rollCount;
    }

    public static void printSum() {
        System.out.println("Sum is = " + sum);
    }

    public static void avgSum() {
        avgSum = sum / rollCount;
    }

    public static void printAvgSum() {
        System.out.printf("The average sum is = %.2f",avgSum);
    }


    public void throwDice() {
        die.roll();
        die2.roll();
        rollCount++;
        sum += die.getFaceValue() + die2.getFaceValue();
    }



    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDice();
            System.out.printf("Rolling... %d\n", die.getFaceValue());
            System.out.printf("Rolling... %d\n", die2.getFaceValue());
            thisSum = die.getFaceValue() + die2.getFaceValue();
            Player.biggestSum();
            Player.CalcArray();
            Player.avgSum();
            System.out.println("Roll again? (Y/n)");
            if (die.getFaceValue() == die2.getFaceValue()) {
                Player.amountOfSame();
            }
            String again = scanner.nextLine();
            if (again.toLowerCase().equals("n")) {
                finished = true;
            }
        }
    }

}
