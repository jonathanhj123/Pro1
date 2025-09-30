import java.util.Scanner;

public class EX22 {
    public static void main(String[] args) {

        // Prompt user to enter a lenth of the equilateral
        // Calculate Area
        // Prompt Are
        // Use area to calculate volume
        // Prompt Volume


        Scanner scan = new Scanner(System.in);
        System.out.println(" Write the Length of the equilateral ");
        double Length = scan.nextDouble();
        double Area = (Math.sqrt(3)/4) * Math.pow(Length,2);
        double Volume = Area * Length;

        System.out.println("The area Is = " + Area);
        System.out.println("The volume of the Triangular prism is = " + Volume);


    }
}
