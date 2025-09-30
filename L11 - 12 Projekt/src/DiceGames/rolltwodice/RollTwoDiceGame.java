package DiceGames.rolltwodice;


import DiceGames.rolltwodice.Player;

public class RollTwoDiceGame {
        public static void main(String[] args) {
            printRules();
            System.out.println();

            DiceGames.rolltwodice.Player player = new DiceGames.rolltwodice.Player();
            System.out.println("Playing RollTwoDice.");
            player.play();

            printResults(player);
            System.out.println();

            System.out.println("Thank you for playing RollTwoDie.");
        }

        public static void printRules() {
            System.out.println("=====================================================");
            System.out.println("Rules of RollTwoDie:");
            System.out.println("The player throws one die as long as he/she wants.");
            System.out.println("=====================================================");
        }

        public static void printResults(Player player) {
            System.out.println("Results");
            System.out.println("-------");
            System.out.println("Roll count: " + player.getRollCount());
            Player.printSum();
            Player.printSame();
            Player.printBiggestSum();
            Player.getArrayValue();
            Player.printAvgSum();
        }

    }
