package EX2;

import java.nio.file.Watchable;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        StopWatch watch = new StopWatch();

        System.out.println("Press enter to start the clock");
        scanner.nextLine();
        watch.start();
        System.out.println("The stop watch is going, press enter again to stop it");

        scanner.nextLine();
        watch.stop();
        System.out.println("The clock has stopped");

        long elapsedTime = watch.elapsedTime();
        System.out.println("The amount of seconds its been going is " + elapsedTime);


    }





}
