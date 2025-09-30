package DiceGames.craps;


import java.util.Scanner;

public class Player {

    private final Die die1;
    private final Die die2;
    private int rollCount;
    public static int sum1;
    public static int sum2;

    public static boolean finished = false;

    public Player() {
        this.die1 = new Die();
        this.die2 = new Die();
    }

    public int getRollCount() {
        return rollCount;
    }

    public void throwDies() {
        die1.roll();
        die2.roll();
        sum1 = die1.getFaceValue() + die2.getFaceValue();
        rollCount++;
        System.out.printf("Rolling... %d\n", die1.getFaceValue());
        System.out.printf("Rolling... %d\n", die2.getFaceValue());
        System.out.println("sammenlagt point: " + sum1);
    }

    public void throwDiesAgain() {
        die1.roll();
        die2.roll();
        sum2 = die1.getFaceValue() + die2.getFaceValue();
        rollCount++;
        System.out.printf("Rolling... %d\n", die1.getFaceValue());
        System.out.printf("Rolling... %d\n", die2.getFaceValue());
        System.out.println("sammenlagt point: " + sum2);

        if (sum2 == sum1) {
            System.out.println("Tillykke, du har vundet");
            finished = true;
        }
        if (sum2 == 7) {
            System.out.println("Du har tabt");
            finished = true;
        }
    }

    public int winOrLoss() {
        int sandt = 1;
        int falsk = 2;
        int hverkenEller = 3;

        if (sum1 == 2 || sum1 == 3 || sum1 == 12) {
            return falsk;
        }
        if (sum1 == 7 || sum1 == 11) {
            return sandt;
        }
        return hverkenEller;
    }

    public static void printResult(int i) {

        switch (i) {
            case 1 -> {
                System.out.println("Tillykke, du har vundet.");
                finished = true;
            }
            case 2 -> {
                System.out.println("Du har tabt. Taber.");
                finished = true;
            }
            case 3 -> {
                System.out.printf("Spillet går videre, du skal slå indtil du rammer dit originale point (%d), eller 7 så du taber\n", sum1);
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll? (Press Enter).");
        scanner.nextLine();

        while (!finished) {
            throwDies();
            winOrLoss();
            printResult(winOrLoss());

            while (!finished) {
                System.out.print("Roll again (press Enter).");
                scanner.nextLine();
                throwDiesAgain();
            }
        }
    }

    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of Craps:");
        System.out.println("Det første kast kaldes ‘come out roll’. Spilleren vinder med det samme, hvis det første kast er 7\n" + "eller 11, og taber med det samme, hvis det første kast er 2, 3 eller 12. Hvis spillerens første kast er\n" + "4, 5, 6, 8, 9 eller 10, etableres dette tal som spillerens ‘point’. Spilleren bliver derefter ved med at\n" + "kaste, indtil han enten kaster sit ‘point’ igen eller kaster 7. Kaster han 7, har han tabt. Kaster han\n" + "sit ’point’, har han vundet.");
        System.out.println("=====================================================");
    }

    public static void printResults(Player player) {
        System.out.println("-------");
        System.out.println("Roll count: " + player.getRollCount());


    }
}
