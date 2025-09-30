package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fag {
    String navn;

    String klasse;

    ArrayList<Lektion> lektioner = new ArrayList<>();

    public Fag(String navn, String klasse) {
        this.navn = navn;
        this.klasse = klasse;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public void setLektioenr(ArrayList<Lektion> lektioenr) {
        this.lektioner = lektioenr;
    }

    public String getNavn() {
        return navn;
    }

    public void addLektion(Lektion lektion) {
        lektioner.add(lektion);
    }

    public void removeLektion(Lektion lektion) {
        lektioner.remove(lektion);
    }

    public String getKlasse() {
        return klasse;
    }

    public ArrayList<Lektion> getLektioenr() {
        return lektioner;
    }

    public ArrayList<Studerende> sygdomPåDato(LocalDate dato) {
        ArrayList<Studerende> studerendeSyge = new ArrayList<>();
        for ( Lektion lektion : lektioner) {
            if (lektion.getDato().equals(dato)) {
                for (Deltagelse deltagelse : lektion.getDeltagelse()) {
                    if (deltagelse.getRegistreret() && deltagelse.getStatus() == DeltagerStatus.SYG && !studerendeSyge.contains(deltagelse.getStuderende())) {
                        studerendeSyge.add(deltagelse.getStuderende());
                    }
                }
            }
        }
        return studerendeSyge;
    }
}
