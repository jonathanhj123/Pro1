package EX1;
import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {

        // Prompt the user to write a number
        // Calculate if its <, > or = 0
        // Print if negative if its > 0 - positive if its < 0 and 0 if its == 0



        Scanner scan = new Scanner(System.in);
        System.out.println( " Write a number ");
        int number = scan.nextInt();

        String finalNumb = sign(number);

        System.out.println( number + " ");
        System.out.print( finalNumb);

}
public static String sign (int number) {

    if (number > 0) {
        return (" Number is Positive ");
    }
    else if (number == 0) {
        return (" Number is 0 ");
    }

    else {
        return (" Number is Negative");
    }
}

}
