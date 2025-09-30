package EX2;

public class Persons {
    private String title;
    private String name;

    private boolean senior;

    public Persons(String title, String name, boolean senior) {
        this.title = title;
        this.name = name;
        this.senior = senior;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return name;
    }

    public void setActor(String actor) {
        this.name = actor;
    }

    @Override
    public String toString() {
        return title + " " + name;
    }
}
