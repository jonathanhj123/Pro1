package model;

import java.security.KeyManagementException;
import java.util.ArrayList;

public class Hold {


    private final ArrayList<Deltager> deltagere = new ArrayList<Deltager>();

    private String navn;

    public Hold(String navn) {
        this.navn = navn;
    }

    public ArrayList<Deltager> getDeltagere() {
        return deltagere;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void tilføjDeltager(Deltager deltager) {
        this.deltagere.add(deltager);
    }

    public void fjernDeltager(Deltager deltager) {
        this.deltagere.remove(deltager);
    }

    public Deltager deltagerMedFlestKm() {
        Deltager flestKM = new Deltager("Test", "test");

        for (Deltager deltager : deltagere) {
            if (deltager.kmIAlt() > flestKM.kmIAlt()) {
                flestKM = deltager;
            }

        }
        return  flestKM;
    }

    public ArrayList<Badge> holdBadges() {
        ArrayList<Badge> holdBadges = new ArrayList<>();

        for (Deltager d : deltagere) {
            for (Badge badge : d.getBadges()) {
                if (!holdBadges.contains(badge)) {
                    holdBadges.add(badge);
                }
            }
        }

        return holdBadges;
    }

    public Deltager[] hurtigeDeltagere (int minutGrænse, int kmGrænse) {
        int count = 0;
        boolean found = false;

        for (Deltager deltager : deltagere) {
            for ( Tur tur : deltager.getTure()) {
                if (tur.getAntalkm() > kmGrænse && tur.getAntalMinutter() < minutGrænse && !found) {
                    found = true;
                    count++;
                }
            }
            found = false;
        }
        Deltager[] hurtigeDeltager = new Deltager[count];
        found = false;

        count = 0;
        for (Deltager deltager : deltagere) {
            for ( Tur tur : deltager.getTure()) {
                if (tur.getAntalkm() > kmGrænse && tur.getAntalMinutter() < minutGrænse && !found) {
                    found = true;
                    hurtigeDeltager[count] = deltager;
                    count++;
                }
            }
            found = false;
        }
        return hurtigeDeltager;
    }


}

