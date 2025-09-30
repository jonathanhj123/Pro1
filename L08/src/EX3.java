import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        int max = 40;
        int[] Asteriks = new int[5];

        for (int i = 0; i < Asteriks.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Write 5 max numbers");
            Asteriks[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(Asteriks));

        for (int i = 0; i <Asteriks.length; i++) {
            max = Asteriks[i];
            int count = Asteriks[i] * 40 / max;
            for (int j = 0; j < max; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
