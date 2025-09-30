import java.util.Scanner;

public class EX3A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Write an amount of integers ending with the integer 0.");

        int number = 0;
        int highestnumber = 0;
        int amountOfHighest = 0;
        do {
            number = scanner.nextInt();

            if (highestnumber < number) {
                highestnumber = number;
                amountOfHighest = 1;

                if (highestnumber == number);
                amountOfHighest++;
            }
        } while (number != 0) ;

        System.out.println("The highest number is : " + highestnumber + " And it occurs " + amountOfHighest + " Times");
    }
}
