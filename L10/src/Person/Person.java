package Person;

import javax.naming.Name;
import javax.naming.NamingEnumeration;
import java.time.Year;

public class Person {
    private String name;
    private String address;
    private int monthlySalary;

    public String getName() {
        return name;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public String getAddress() {
        this.address = address;
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String address) {
        setAddress(address);
        setName(name);
    }
    public double YearlyIncome() {
        return (this.monthlySalary * 12) * 1.025;
    }

    public void printPerson () {
        System.out.println("Name: " + name);
        System.out.println("Name and Address: " + name + " " + address);
        System.out.println("MonthlyIncome " + monthlySalary);
        System.out.println("YearlyIncome " + YearlyIncome());
    }



    }

