package Controller;
import Model.*;
import storage.Storage;

import java.time.LocalDate;

public class Controller {



    public static Lektion opretLektion(LocalDate dato, LocalDate startTid, String Lokale, Fag fag) {
        Lektion lektion = new Lektion(dato,startTid,Lokale);
        Storage.gemLektion(lektion);
        fag.addLektion(lektion);
        return lektion;
    }
    public static void moveLektionToNewFag(Fag fag, Lektion lektion, Fag newFag) {
        if (fag.getLektioenr().contains(fag)) {
            fag.removeLektion(lektion);
            newFag.addLektion(lektion);
        }
    }

    public static Deltagelse opretDeltagelse( Lektion lektion, Studerende studerende) {
        var deltagelse = new Deltagelse(lektion, studerende);
        lektion.addDeltagelse(deltagelse);
        return deltagelse;
    }

    public static void addDeltagelseToLektion(Lektion lektion, Deltagelse deltagelse) {
        var oldLektion = deltagelse.getLektion();
        oldLektion.removeDeltagelse(deltagelse);
        deltagelse.setLektion(lektion);
        lektion.addDeltagelse(deltagelse);
    }

    public static Studerende opretStuderende(String navn, String email) {
        Studerende studerende = new Studerende(navn, email);
        Storage.gemStuderende(studerende);
        return studerende;
    }

    public static Fag opretFag(String navn, String klasse) {
        Fag fag = new Fag(navn, klasse);
        Storage.gemFag(fag);
        return fag;
    }






}
