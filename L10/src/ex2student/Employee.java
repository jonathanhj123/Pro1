package ex2student;

public class Employee {
    // The name of the employee.
    String name;
    // Whether the employee is a trainee or not.
    boolean trainee;
    int age;

    /** Create an employee. */
    public Employee(String name, boolean trainee) {
        this.name = name;
        this.trainee = true;
        this.age = age;
    }
    public Employee(String name, boolean trainee, int age) {
        this.name = name;
        this.trainee = true;
        this.age = age;
    }

    public void Birthday(){
        this.age++;
    }

    @Override
    public String toString() {
        return String.format("Employee(%s, %s)", name, trainee, age);
    }

    /** Print a description of the employee. */
    public void printEmployee() {
        int index = name.lastIndexOf(" ");

        System.out.println("*******************");
        System.out.println("First Name: " + name.substring(0,index));
        System.out.println("Last Name: " + name.substring(index));
        System.out.println("Trainee: " + trainee);
        System.out.println("Age: " + age);
        System.out.println("*******************");
    }
}
