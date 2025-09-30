package model;

public class Teacher extends Person {

    private String teacherId;

    private double monthlySalary;

    public Teacher(String name, String address, String qualification, double salary, String id) {
        super(name, address, qualification);
        this.monthlySalary = salary;
        this.teacherId = id;


    }
    public void udskrivPerson() { // løsning på udskriv, hvor vi
        // udnytter, at der er en udskriv i superklassen
        super.udskrivPerson(); // nødvendigt med super for ikke at kalde sig
        // selv.
        System.out.println("Løn: " + this.yearlySalary());
        System.out.println("model.Teacher identifikation: " + teacherId);
    }

    public double yearlySalary() {
        double yearlySalary = 0;
        double monthly = monthlySalary*1.125;

        yearlySalary = monthly*12;

        return yearlySalary;
    }


}
