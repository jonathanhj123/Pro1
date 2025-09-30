package Model;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Lektion {

    private LocalDate dato;

    private LocalDate startTid;

    private String lokale;

    private ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Lektion(LocalDate dato, LocalDate startTid, String lokale) {
        this.dato = dato;
        this.startTid = startTid;
        this.lokale = lokale;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public LocalDate getStartTid() {
        return startTid;
    }

    public void setStartTid(LocalDate startTid) {
        this.startTid = startTid;
    }

    public String getLokale() {
        return lokale;
    }

    public void setLokale(String lokale) {
        this.lokale = lokale;
    }

    public ArrayList<Deltagelse> getDeltagelse() {
        return deltagelser;
    }

    public void addDeltagelse(Deltagelse deltagelse) {
        deltagelser.add(deltagelse);
    }

    public void removeDeltagelse(Deltagelse deltagelse) {
        deltagelser.remove(deltagelse);
    }

    public void setDeltagelse(ArrayList<Deltagelse> deltagelse) {
        this.deltagelser = deltagelse;
    }
}
