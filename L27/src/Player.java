public class Player {

    String name = "";
    int height = 0;
    int weight = 0;

    int scoredGoals = 0;

    public Player(String name, int height, int weight, int scoredGoals) {
        this.height = height;
        this.name = name;
        this.scoredGoals = scoredGoals;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", scoredGoals=" + scoredGoals +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }
}
