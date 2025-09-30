package EX1;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Write the date of the month");
        int date = scan.nextInt();
        System.out.println(" Write the number of the month");
        int month = scan.nextInt();

        String season = Season(date , month);

        System.out.println(season);

    }



    public static String Season(int date, int month){

        if (month == 12 || month == 1 || month == 2){
            if (month == 2 && date >= 21){
                return ("Forår");
            }
            else {
                return ("Vinter");

            }
        }
        if (month == 3 || month == 4 || month == 5){
            if (month == 5 && date >=21){
                return ("Sommer");
            }
            else {
                return ("Forår");
            }
        }
        if (month == 6 || month == 7 || month == 8){
            if (month == 8 && date >=21){
                return ("Efterår");
            }
            else {
                return ("Sommer");
            }
        }
        else {
            return ("Efterår");
        }


    }
}
