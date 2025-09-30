import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EX3B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salesamount = 0;
        int i = 0;
        System.out.println(" Enter amount of thousands for sales amount");
        int amount = scanner.nextInt();

        System.out.println( " Sales amount    comission");
        do {

            System.out.printf("%-17.2f%.2f", salesamount, computeComission(salesamount));
            System.out.println();
            salesamount = salesamount + 1000;
            i++;


        }
        while (i <= amount);

    }

    public static double computeComission (double salesAmount) {

        double comission;
        if ( salesAmount > 0.01 && salesAmount <= 5000){
            return comission = salesAmount * 0.06;
        }
        else if (salesAmount > 5000.01 && salesAmount <=10000.01){
            return comission = salesAmount * 0.08;
        }
        else {
            return comission = salesAmount * 0.10;
        }
    }
}
