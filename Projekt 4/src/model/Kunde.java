package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String mobil;

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Kunde(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
    }
    public ArrayList<Bestilling> hentBestillinger() {
        return bestillinger;
    }

    public void tilføjBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
    }

    public void fjernBestilling(Bestilling bestilling) {
        bestillinger.remove(bestilling);
    }

    @Override
    public String toString() {
        return navn + " (" + mobil + ") ";
    }

    public ArrayList<Bestilling> bestiltePladserTilForestillingPåDag(Forestilling forestilling, LocalDate date) {
        ArrayList<Bestilling> besiltePladser = new ArrayList<>();
        hentBestillinger();

        for (Bestilling b : bestillinger) {
            if (b.getForestilling().equals(forestilling) && b.getDato().equals(date)) {
                besiltePladser.add(b);
            }
        }
        return besiltePladser;

    }

}