import javax.swing.*;
import java.util.Scanner;

public class EX2D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input the amount of numbers between 1-99");
        int amount = scanner.nextInt();
        int lastnumb = 0;
        int printnumb = 0;
        System.out.println(" Write the numbers in one string : ");

        for (int i = 1; i <= amount; i++) {
            int numb = scanner.nextInt();

            if (numb == lastnumb){
                if(numb != printnumb){
                    System.out.print(numb);
                    printnumb = numb;
                }

            }
            lastnumb = numb;


        }
    }
}