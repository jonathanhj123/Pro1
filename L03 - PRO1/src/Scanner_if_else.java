import java.util.Scanner;

public class Scanner_if_else {
    public static void main(String[] args) {


        // Algorithm:
        // Read number of seconds
        // Calculate minutes
        // Calculate remaining seconds
        // Print minutes
        // Print remaining seconds

        System.out.println("Write number of seconds:");
        Scanner scan = new Scanner(System.in);
        int seconds = scan.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("minutes = " + minutes);
        System.out.print("remainingSeconds = " + remainingSeconds);
    }
}
