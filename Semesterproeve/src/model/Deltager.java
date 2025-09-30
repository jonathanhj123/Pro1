package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deltager {



    private Hold hold;

    private final ArrayList<Tur> ture = new ArrayList<Tur>();

    private final ArrayList<Badge> badges = new ArrayList<Badge>();

    private String navn;
    private String mobil;


    public Deltager(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
    }

    public Hold getHold() {
        return hold;
    }

    public void setHold(Hold hold) {
        this.hold = hold;
    }

    public ArrayList<Tur> getTure() {
        return ture;
    }

    public ArrayList<Badge> getBadges() {
        return badges;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public void tilføjTurTilDeltager(Tur tur) {
        this.ture.add(tur);
    }

    public void tilføjBadgeTilDeltager(Badge badge) {
        this.badges.add(badge);
    }

    public int kmIAlt() {
        int sum = 0;

        for (Tur tur : ture) {
            sum += tur.getAntalkm();
        }

        return sum;
    }

    @Override
    public String toString() {
        return "Deltager{" +
                "hold=" + hold +
                ", ture=" + ture +
                ", badges=" + badges +
                ", navn='" + navn + '\'' +
                ", mobil='" + mobil + '\'' +
                '}';
    }

    public int CompareTo(Deltager other) {
        if (this.navn.compareTo(other.navn) == 0) {
            return this.mobil.compareTo(other.mobil);
        } else {
            return this.navn.compareTo(other.navn);
        }
    }
}
