package model;

import controller.Controller;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;
    // association 1 forestilling --> 0..* bestilling
    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();
    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public ArrayList<Bestilling> hentBestillinger() {
        return new ArrayList<>(bestillinger);
    }

    public void tilføjBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
    }

    public void fjernBestilling(Bestilling bestilling) {
        bestillinger.remove(bestilling);
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    // TODO

    public boolean erPladsLedig(int række, int nr, LocalDate dato) {
        for (Bestilling bestilling : bestillinger) {
            if (bestilling.getDato().equals(dato)) {
                for (Plads plads : bestilling.getPladser()) {
                    if (plads.getRække() == række && plads.getNr() == nr) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    @Override
    public String toString() {
        return navn + " som spiller fra " +
                startDato + " - " +
                slutDato + ".";
    }

    public int antalBestiltePladserPåDag(LocalDate dato) {
        hentBestillinger();
        int antalBestilte = 0;
        for (Bestilling b : bestillinger) {
            if (dato == b.getDato()) {
                antalBestilte++;
            }
        }
        return antalBestilte;
    }

    public LocalDate SuccessDato() {
        LocalDate bestDate = null;
        int maxSeat = 0;

        for (Bestilling bestilling : bestillinger) {
            LocalDate current = bestilling.getDato();
            int seatsForCurrent = antalBestiltePladserPåDag(current);
            if (seatsForCurrent > maxSeat) {
                maxSeat = seatsForCurrent;
                bestDate = current;
            }
        }
        return bestDate;
    }

}