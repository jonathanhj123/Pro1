import java.awt.image.DirectColorModel;
import java.util.Arrays;
import java.util.Random;

public class EX1 {
    public static void main(String[] args) {


        /* inRun = false
    For each index i in the array
    If inRun
    If values[i] is different from the preceding value
    Print )
    inRun = false
    If not inRun
    If i is not the last index and
    values[i] is the same as the following value
    Print (
    inRun = true
    Print values[i]
    If inRun, print )

         */

        boolean inRun = false;
        int[] Dice = new int[20];


        for (int i = 0; i < Dice.length; i++) {
            Dice[i] = (int) (Math.random() * 6 + 1);
        }

        for (int i = 0; i < Dice.length; i++) {
            if (inRun == true) {
                if (Dice[i] != Dice[i - 1]) {
                    System.out.print(") ");
                    inRun = false;
                }
            }
            if (inRun == false) {
                if (i < Dice.length - 1 && Dice[i] == Dice[i + 1]) {
                        System.out.print(" ( ");
                        inRun = true;
                }
                }
            System.out.print(Dice[i] + " ");
            }
        }
    }