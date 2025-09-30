package EX3;

import java.util.ArrayList;

public class EX3 {
    public static void main(String[] args) {
        Player p1 = new Player ("Gangsta", 18, 13);
        Player p2 = new Player ("Gangsta2", 22, 10);
        Player p3 = new Player ("Gangsta3", 24, 16);
        Player p4 = new Player ("Gangsta4", 17, 15);
        Player p5 = new Player ("Gangsta5", 28, 18);
        Player p6 = new Player ("Gangsta6", 26, 20);


        Team t1 = new Team("GangstaTeam");

        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);
        t1.addPlayer(p5);
        t1.addPlayer(p6);

        t1.printPlayers();
        System.out.println(t1.calcAverageAge());
        System.out.println(t1.calcTotalScore());
        System.out.println(t1.CalcOldPlayersScore(19));
        t1.maxScore();
        System.out.println(t1.bestPlayerNames());
        System.out.println(t1.toString());

    }


}
