package exarch.gui;

import exarch.controller.Controller;
import exarch.model.Company;
import exarch.model.Employee;
import javafx.application.Application;

import javax.sound.midi.Soundbank;

public class ArchitectureApp {

    public static void main(String[] args) {
        initStorage();
        Application.launch(ArchitectureGui.class);
    }

    public static void initStorage() {
        Company ibm = Controller.createCompany("IBM", 37);
        Company amd = Controller.createCompany("AMD", 40);
        Company sled = Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);
        Employee employee1 = Controller.createEmployee("Jens", 40000);
        Employee employee2 = Controller.createEmployee("Ib", 50000);
        Employee employee3 = Controller.createEmployee("Børge", 60000);
        Employee employee4 = Controller.createEmployee("Jonathan", 70000);

        Controller.addEmployeeToCompany(amd, employee1);
        Controller.addEmployeeToCompany(ibm, employee2);
        Controller.addEmployeeToCompany(sled, employee3);


        System.out.println(employee1.getCompany());
        System.out.println(employee2.getCompany());
        System.out.println(employee3.getCompany());
        System.out.println(employee4.getCompany());

        System.out.println(amd.getEmployees());
        System.out.println(ibm.getEmployees());
        System.out.println(sled.getEmployees());
    }
}
