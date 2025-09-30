package DesignAnalyse;

import java.time.LocalDate;

public class Transaktion {

    private int beløb = 0;

    private LocalDate dato;


    public Transaktion (int beløb) {
        this.beløb = beløb;
        this.dato = LocalDate.now();
    }

    public int getBeløb() {
        return beløb;
    }
}
