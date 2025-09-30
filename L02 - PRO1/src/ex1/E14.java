package ex1;

import java.sql.SQLOutput;

public class E14 {
    public static void main(String[] args) {
        double factor = 1.05;
        System.out.println(" Year      Balance");
        System.out.println("  0        $ 1000");
        System.out.println("  1        $ " + 1000 * factor);
        System.out.println("  2        $ " + 1000 * factor * factor);
        System.out.println("  3        $ " + 1000 * factor * factor * factor);
    }
}
