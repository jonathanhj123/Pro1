import java.util.Scanner;

public class EX31 {
    public static void main(String[] args) {
        // Algorithm
        // Prompt the user to enter 3 values a, b and c
        // Calculate r1 using the formula in Section 3.2
        // Calculate r2 using the formula in Section 3.2
        // Print r1 and r2

        Scanner scan = new Scanner(System.in);
        System.out.println( " Write 3 numbers for the Variabales A, B and C");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        printSolutions (a,b,c); // Her bliver den nye metode brugt. Input indenfor () kan også sagtens vvære konstanter skal ikke være variabler.


    }
    public static void printSolutions(double a, double b, double c) { // Her bliver der lavet en ny metode som beregner rødderne.


        double discri = b * b - 4 * a * c;
        if (discri > 0) {
            double root1 = ( - b + Math.pow( discri , 0.05) / (2 * a));
            double root2 = ( - b + Math.pow( discri , 0.05) / (2 * a));
            System.out.println( " The equation has two roots " + root1 + " " + root2  );
        }
        else if ( discri == 0 ) {
            double OneRoot = ( - b / (2 * a ));
            System.out.println( " The equation has one root " + OneRoot);
        }
        else
            System.out.println( "The equation has no roots");

    }
}
