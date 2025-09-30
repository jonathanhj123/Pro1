package EX1;

import java.awt.*;

public class EX4B {
    public static void main(String[] args) {
        int n = 15;
        displayPattern(n);



    }


    public static void displayPattern(int n){
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(col + " ");
                col++;
            }
            System.out.println(" ");
            row++;
        }

    }
}
