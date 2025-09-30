package storage;
import Model.*;
import Model.Deltagelse;
import Model.DeltagerStatus;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Storage {

    private static final ArrayList<Lektion> lektioner = new ArrayList<>();
    private static final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    private static final ArrayList<Studerende> Allestuderende = new ArrayList<>();

    private static final ArrayList<Fag> alleFag = new ArrayList<>();



    public static void gemFag(Fag fag) {
        alleFag.add(fag);
    }

    public static void gemStuderende(Studerende studerende) {
        Allestuderende.add(studerende);
    }

    public static void gemLektion(Lektion lektion) {
        lektioner.add(lektion);
    }

    public static void gemDeltagelse(Deltagelse deltagelse) {
        deltagelser.add(deltagelse);
    }

    public static ArrayList hentFag() {
        return new ArrayList(alleFag);
    }

    public static ArrayList hentStuderende() {
        return new ArrayList(Allestuderende);
    }

    public static ArrayList hentLektioenr() {
        return new ArrayList(lektioner);
    }

    public static ArrayList hentDeltagelser() {
        return new ArrayList(deltagelser);
    }

}
