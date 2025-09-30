package ex3;

public class E112 {
    public static void main(String[] args) {
        double lengthInKm = 24 * 1.6;
        double time = (1 * 3600 + 40 * 60 + 35 ) / 3600.0;
        double averageSpeed = lengthInKm / time;

        System.out.println(averageSpeed);
    }
}
