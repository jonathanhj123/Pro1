package Gui;

import Controller.Controller;
import Controller.*;
import Model.Fag;
import Model.Studerende;

public class App {
    public static void main(String[] args) {

    }

    public static void initStorage() {
        Studerende peter = Controller.opretStuderende("Peter Hansen", "ph@stud.dk");
        Studerende tina = Controller.opretStuderende("Tina Jensen", "tj@stud.dk");
        Studerende sascha = Controller.opretStuderende("Sascha Petersen", "sp@stud.dk");


        Fag PRO1 = Controller.opretFag("PRO1", "20S");
        Fag PRO2 = Controller.opretFag("PRO2", "20T");
        Fag SU1 = Controller.opretFag("SU1","20s");

    }

}
