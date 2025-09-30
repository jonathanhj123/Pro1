package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tur {


    private LocalDate dato;
    private int antalMinutter;
    private int antalkm;

    private Deltager deltager;

    public Tur(LocalDate dato, int antalMinutter, int antalkm, Deltager deltager) {
        this.dato = dato;
        this.antalMinutter = antalMinutter;
        this.antalkm = antalkm;
        this.deltager = deltager;

    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public int getAntalMinutter() {
        return antalMinutter;
    }

    public void setAntalMinutter(int antalMinutter) {
        this.antalMinutter = antalMinutter;
    }

    public int getAntalkm() {
        return antalkm;
    }

    public void setAntalkm(int antalkm) {
        this.antalkm = antalkm;
    }




}
