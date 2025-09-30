package DesignAnalyse;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.Random;

public class KontoSystem {

    private int nr = 0;
    private int saldo = 0;
    private String kontoType = "Konto";
    private String status = "Åben";

    private ArrayList<Transaktion> transaktioner;

    public KontoSystem (int nr, KontoType kontoType) {
        this.saldo = 0;
        this. nr = 0;
    }

    public int beregnSaldo() {
        int saldo = this.saldo;

        for (Transaktion transaktion : transaktioner) {
            saldo += transaktion.getBeløb();
        }

        return saldo;
    }

    public void indsætBeløb(int beløb) {
        transaktioner.add(new Transaktion((beløb)));
    }

    public void hævBeløb(int beløb) {
        transaktioner.add(new Transaktion((beløb)));
    }

    public void lukKonto() {
        this.status = "Lukket";
    }


    public String toString() {
        return "KontoSystem{" +
                "nr=" + nr +
                ", saldo=" + saldo +
                ", kontoType='" + kontoType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}



