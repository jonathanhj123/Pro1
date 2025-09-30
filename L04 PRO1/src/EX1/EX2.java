package EX1;


import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Write 3 Integers ");
        int Num1 = scan.nextInt();
        int Num2 = scan.nextInt();
        int Num3 = scan.nextInt();


        String result = order(Num1, Num2, Num3);

        System.out.println(result);

    }

    public static String order(int Num1, int Num2, int Num3) {
        if (Num1 < Num2) {
            if (Num2 < Num3) {
                return (+Num1 + " " + Num2 + " " + " " + Num3 + " Numbers are in Ascending order ");
            } else {
                return (+Num1 + " " + Num2 + " " + " " + Num3 + " Numbers are in Random Order");
            }
        } else if (Num1 == Num2) {
            if (Num2 < Num3) {
                return (+Num1 + " " + Num2 + " " + " " + Num3 + " Numbers are in Ascending order ");
            } else {
                return (+Num1 + " " + Num2 + " " + " " + Num3 + " Numbers are in Random Order");
            }
        } else {
            if (Num2 > Num3) {
                return (+Num1 + " " + Num2 + " " + " " + Num3 + " Numbers are in Descending order ");
            } else {
                return (+Num1 + " " + Num2 + " " + " " + Num3 + " Numbers are in Random Order");
            }
        }
    }
}