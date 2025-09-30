import java.util.ArrayList;
import java.util.List;

public class Opg4 {
    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();
        Player p1 = new Player("Hans", 180, 85, 2);
        Player p2 = new Player("Jens", 190, 100, 4);
        Player p3 = new Player("Marvin", 170, 78, 7);
        Player p4 = new Player("Kasper", 185, 90, 8);
        Player p5 = new Player("Kasper", 185, 90, 61);
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);


        System.out.println(findPlayerLinear(players, 4));
        System.out.println(findPlayerLinear(players, 9));

        System.out.println(findPlayerBinary(players, 7));
        System.out.println(findPlayerBinary(players, 9));

        System.out.println(findPlayerNameFor(players));
        String name = findPlayerName(players);



    }

    public static Player findPlayerLinear(ArrayList<Player> players, int score) {
        Player player = null;
        boolean found = false;
        int i = 0;

        while (i < players.size() && !found) {
            if (players.get(i).scoredGoals == score) {
                found = true;
                player = players.get(i);
            } else {
                i++;
            }
        }
        return player;
    }

    public static Player findPlayerBinary(ArrayList<Player> players, int score) {
        Player player = null;
        int left = 0;
        int right = players.size() - 1;
        while (player == null && left <= right) {
            int middle = (left + right) / 2;
            Player p = players.get(middle);
            if (p.scoredGoals == score) {
                player = p;
            } else if (p.scoredGoals > score) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return player;
    }

    public static String findPlayerName(ArrayList<Player> players) {
        String name = null;
        int i = 0;
        boolean found = false;
        while (i < players.size() && !found) {
            Player p = players.get(i);
            if (p.getHeight() < 170 && p.getScoredGoals() <= 50) {
                name = players.get(i).name;
                found = true;
            } else {
                i++;
            }
        }
        return name;
    }

    public static String findPlayerNameFor(ArrayList<Player> players) {
        for (Player p : players) {
            if (p.getHeight() < 170 && p.getScoredGoals() < 50) {
                return p.getName();
            }
        }
        return "";
    }
}
