package ex3;

import java.time.Year;

public class E111 {
    public static void main(String[] args) {
        double population1 = 312_032_486;
        double secondsInAYear = 31_536_000;
        double birthPerYear = secondsInAYear/7.0;
        double deathPerYear = secondsInAYear/13.0;
        double ImigrantsPerYear = secondsInAYear/45.0;
        double YearlyIncrease = birthPerYear-deathPerYear+ImigrantsPerYear;


        System.out.println("Year     Population");
        System.out.println(" 0       " + population1);
        population1 = population1 + YearlyIncrease;
        System.out.println(" 1       " + population1);
        population1 = population1+YearlyIncrease;
        System.out.println(" 2       " + population1);
        population1 = population1 + YearlyIncrease;
        System.out.println(" 3       " + population1);
        population1 = population1 + YearlyIncrease;
        System.out.println(" 4       " + population1);
        population1 = population1 + YearlyIncrease;
        System.out.println(" 5       " + population1);
    }
}
