package DiceGames.pig;

import java.util.Scanner;

public class Player {
    private Die die;
    public int result; // holder styr på udkommet af slagene.
    private int sumDie; // summen af de kulminerede slag.
    boolean running = true; // yderste loop som kører programmet
    boolean skiftTur = false; // skifter spiller tur

    public int getsumDie() {
        return sumDie;
    }

    public void setsumDie(int sumDie) {
        this.sumDie = sumDie;
    }

    //constructor der giver spillerne individuelle terninger
    public Player() {
        this.die = new Die();
    }

    Player player1 = new Player();
    Player player2 = new Player();

    public void play() {

        while (running) {
            System.out.printf("Spiller 1's tur med %d point \n----------------------\n", player1.getsumDie());
            player1.throwDie();//spiller 1 slår
            System.out.printf("Spiller1 har nu %d point \n----------------------\n", player1.getsumDie());

            if (player1.result == 1) { // hvis spilleren vinder -> tillykke
                Player.evaluate(player1,player2);
                running = false;
            }
            //tjekker resultatet af player 1's tur
            if ((player1.result == 0) || (player1.result == 2)) { // hvis spilleren stopper eller taber -> skift tur
                skiftTur = true;
            }

            //tjekker resultatet af player 2's tur
            while (skiftTur) {
                System.out.printf("Spiller 2's tur med %d point\n----------------------\n", player2.getsumDie());
                player2.throwDie();//spiller 2 slår
                System.out.printf("Spiller 2 har nu %d point\n----------------------\n", player2.getsumDie());

                if (player2.result == 1) {// hvis spilleren vinder -> tillykke
                    Player.evaluate(player1,player2);
                    running = false;
                    break;
                }
                if ((player2.result == 0) || (player2.result == 2)) { //hvis spilleren stopper eller taber -> skift tur
                    skiftTur = false;
                }
            }
        }

    }

    //funktion der kaster terning og returnerer en værdi svarende til udfaldet.
    public int throwDie() {
        Scanner scanner = new Scanner(System.in);
        String again;

        boolean running = true;

        int tempsumDie = 0; // holder styr på de kulminerede point pr runde.

        while (running) {
            die.roll();
            System.out.printf("Rolling... %d \n", die.getFaceValue());

            if (die.getFaceValue() == 1) {
                System.out.println("Du slog 1, og får derfor 0 point denne runde.\n");
                return result = 0; // går ud af spillet -> ingen gevinst
            }

            tempsumDie += die.getFaceValue(); //ligger slaget til temp sum.

            if (tempsumDie + sumDie >= 100) { // tjekker om spiller har vundet
                setsumDie(sumDie+tempsumDie);
                return result = 1; // går ud af spillet -> vundet
            }

            System.out.print("Vil du forsætte, eller tage gevinsten? Y/N\n");
            again = scanner.nextLine();

            //  hvis indtastet N/n = spilleren vil ikke prøve igen, turen går videre.
            //  hvis ikke, starter loopet forfra.
            if (again.equalsIgnoreCase("n")) {
                setsumDie(sumDie + tempsumDie);
                return result = 2; // går ud af spillet -> fastholder gevinst
            }
        }
        return 404; // hvis programmet fejler
    }

    //evaluerer hvilken spiller der har vundet.
    public static void evaluate(Player player1, Player player2) {

        if (player1.getsumDie() >= 100) {
            System.out.printf("Tillykke spiller 1 har vundet med %d point", player1.getsumDie());
        }
        if (player2.getsumDie() >= 100) {
            System.out.printf("Tillykke spiller 2 har vundet med %d point", player2.getsumDie());
        }
    }

    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of PigGame:");
        System.out.println(
                "Første spiller kaster en terning, indtil han enten kaster 1 eller beslutter sig for at stoppe. Hvis han\n" +
                        "slår en 1’er, får han ingen point i denne runde. Hvis han beslutter sig for at stoppe, inden har slår\n" +
                        "en 1’er, lægges summen af alle hans kast i denne runde sammen med hans samlede antal point,\n" +
                        "og turen går videre til næste spiller. Derefter skiftes spillerne til at kaste. Den første spiller, der\n" +
                        "samlet når 100 point, har vundet");
        System.out.println("=====================================================");
    }
}
