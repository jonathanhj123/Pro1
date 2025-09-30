package enumeration.daydemo;

public class EnumDemo {
    public enum Day {
        MANDAG, TIRSDAG, ONSDAG, TORSDAG, FREDAG, LOERDAG, SOENDAG
    }

    public static void main(String[] args) {
        Day workday = Day.MANDAG;
        Day weekday = Day.LOERDAG;

        System.out.println("Ordinal værdien for " + workday + " er " + workday.ordinal());
        System.out.println("Ordinal værdien for " + weekday + " er " + weekday.ordinal());
        System.out.println();
        
        if (weekday.ordinal() > workday.ordinal()) {
            System.out.println("Loerdag kommer senere end mandag");
        }
        System.out.println();

        System.out.println("Løb igennem alle dage:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
