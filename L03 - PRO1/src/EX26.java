import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EX26 {
    public static void main(String[] args) {
        // Algorithm
        // Prompt user to enter a number between 0 and 1000
        // Calculate the sum of the digits
        // Prinit the sum

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a number between 0 and 1000");
        int Number = scan.nextInt();
        int ExtractedDigits = (Number % 10);
        int RemoveExtractedDigits = (Number / 10);
        int ExtractedDigits2 = (RemoveExtractedDigits % 10);
        int ExtractedDigits3 = (RemoveExtractedDigits / 10);
        int Sum = ExtractedDigits + ExtractedDigits2 + ExtractedDigits3;



        System.out.println(" The sum of the digits is " + Sum);



    }
}
