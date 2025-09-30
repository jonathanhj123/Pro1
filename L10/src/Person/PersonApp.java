package Person;

import java.nio.charset.IllegalCharsetNameException;

public class PersonApp {
    public static void main(String[] args) {

        Person p1 = new Person("Jonathan", "Banegaardsgade 27");

//        p1.setName("Marcus");
//        p1.setAddress("Banegaarden");
//        p1.setMonthlySalary(30);


        p1.printPerson();

        p1.setName("Marcus");
        p1.setAddress("Vejlevej");
        p1.setMonthlySalary(1000);

        p1.printPerson();


    }
}
