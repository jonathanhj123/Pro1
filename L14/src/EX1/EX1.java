package EX1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class EX1 {
    public static void main(String[] args) {


        ArrayList<String> myStrings = new ArrayList<String>();

        myStrings.add("Hans");
        myStrings.add("Viggo");
        myStrings.add("Jens");
        myStrings.add("Bente");
        myStrings.add("Bent");

        System.out.println(myStrings.size());

        myStrings.add(1, "Jane");

        System.out.println(myStrings);

        myStrings.remove(1);

        myStrings.addFirst("Pia");
        myStrings.addLast("Ib");

        System.out.println(myStrings.size());

        myStrings.set(2, "Hansi");

        System.out.println(myStrings.size());
        System.out.println(myStrings);

        for (String i : myStrings) {
            System.out.print(i.length() + ". ");
        }


        myStrings.forEach(String-> System.out.println(String.length()));






    }
}
