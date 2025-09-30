package EX3;

import java.util.ArrayList;
import java.util.function.ObjLongConsumer;

public class Team {

    private String name = "Gansta";

    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String toString() {
        return "Team " + getName();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void printPlayers() {
        for ( Player i : players) {
            System.out.println(i.toString());
        }
    }

    public double calcAverageAge() {
        double average = 0;
        for ( Player i : players) {
            average += i.getAge();
        }
        average = average / players.size();
        return average;
    }

    public int calcTotalScore() {
        int total = 0;
        for ( Player i : players) {
            total += i.getScore();
        }
        return total;
    }

    public int CalcOldPlayersScore (int ageLimit) {
        int oldScore = 0;
        for ( Player i : players) {
            if (i.getAge() > ageLimit) {
                oldScore += i.getScore();
            }
        }
        return oldScore;
    }

    public int maxScore() {
        int highest = 0;
        for ( Player i : players) {
            if (i.getScore() > highest) {
                highest = i.getScore();
            }
        }
        return highest;
    }

    public ArrayList<String> bestPlayerNames() {
        ArrayList<String> names = new ArrayList<>();
        int maxScore = this.maxScore();
        for ( Player i : players) {
            if (i.getScore() == maxScore) {
                names.add(i.getName());
            }
        }
        return names;
    }


}
