package ex1student.ex1student;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("VW UP", "White", "AB 12.345", 50000);
        System.out.println("Test: " + myCar.toString());
        System.out.println();

        String brand = myCar.brand;
        System.out.println("Brand " + brand);
        System.out.println("My car: " + myCar.brand + ", " + myCar.color);

        myCar.km = 65000;
        System.out.println("Km nu: " + myCar.km);



        Car myCar2 = new Car("Porsche", "Black", "CS 12.345", 0);
        System.out.println("Test " + myCar2.toString());
        brand = myCar2.brand;
        System.out.println("************");
        System.out.println("*Brand " + brand);
        System.out.println("*My car: " + myCar2.brand + ", " + myCar2.color);

        myCar2.km = 65000;
        System.out.println("*Km nu: " + myCar2.km);
        System.out.println("*************");



    }
}
