package EX1;

import java.util.Scanner;

public class ChildApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Write your age");
        int age = scan.nextInt();
        System.out.println(" Are you a Boy or Girl");
        String Gender = scan.next();
        String Instutution = instuitution(age);
        System.out.println(Instutution);
        boolean isBoy = false;

        if (Gender.equals("Boy") || Gender.equals("boy")){
            isBoy = true;
        }
        else if (Gender.equals("Girl")|| Gender.equals("girl")){
            isBoy = false;
        }
        else {
            System.out.println(" Not a boy nor a girl");
            return;
        }

        System.out.println(team(isBoy, age));

    }

    public static String instuitution(int age) {

        if (age == 0) {
            return ("Home");
        }
        if (age <= 2) {
            return ("Nursery");
        }
        if (age <= 5) {
            return ("Kindergarten");
        }
        if (age <= 16) {
            return ("School");
        }
        else {
            return ("Out of school");
        }

    }
    public static String team(boolean isBoy, int age) {

        if (isBoy){
            if (age <8) {
                return ("Young Cubs");
            }
            else {
                return ("Cool boys");
            }
        }
        else {
            if(age < 8 ) {
                return ("Tumbling girls");
            }
            else {
                return ("Springy Girls");
            }
        }




    }
}
