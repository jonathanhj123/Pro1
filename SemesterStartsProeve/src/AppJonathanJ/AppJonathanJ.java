package AppJonathanJ;
import java.math.*;

import java.util.Scanner;

public class AppJonathanJ {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast Navn: ");
        String navn = scanner.next();

        System.out.println("Indtast vægt: ");
        int vægt = scanner.nextInt();

        System.out.println("Intast Højde: ");
        double højde = scanner.nextDouble();


//        double bmi = Math.pow((vægt)/(højde),2);

        double bmi = (vægt)/ Math.pow((højde),2);

        System.out.println("Beregnet BMI : " + bmi);

        String vægtig = "Vægtig";


        if (bmi < 18.5) {
            vægtig = "Undervægtig";
        }
        else if (bmi < 25) {
            vægtig = "Normal vægt";
        }
        else if (bmi < 30) {
            vægtig = "Overvægtig";
        }
        else if (bmi > 30) {
            vægtig = "Fedme";
        }
        System.out.println(navn + "Siger hans bmi er " + vægtig);



    }




}
