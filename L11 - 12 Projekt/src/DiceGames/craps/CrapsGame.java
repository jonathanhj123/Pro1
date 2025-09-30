package DiceGames.craps;

public class CrapsGame {
    public static void main(String[] args) {
        Player.printRules();
        System.out.println();

        Player player = new Player();
        System.out.println("Playing Craps.");
        player.play();

        Player.printResults(player);
        System.out.println();

        System.out.println("Thank you for playing Craps.");
    }
}