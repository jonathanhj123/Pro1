package storage;

import model.*;
import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Tur> ture = new ArrayList<>();
    private static final ArrayList<Badge> badges = new ArrayList<>();
    private static final ArrayList<Deltager> deltagere = new ArrayList<>();

    private static final ArrayList<Hold> alleHold = new ArrayList<>();


    public static ArrayList<Hold> getHold() {
        return new ArrayList<>(alleHold);
    }
    public static ArrayList<Tur> getTure() {
        return new ArrayList<>(ture);
    }

    public static ArrayList<Badge> getBadges() {
        return new ArrayList<>(badges);
    }
    public static ArrayList<Deltager> getDeltagere() {
        return new ArrayList<>(deltagere);
    }

    public static void storeHold (Hold hold) {
        alleHold.add(hold);
    }

    public static void storeTure(Tur tur) {
        ture.add(tur);
    }

    public static void storeBadges (Badge badge) {
        badges.add(badge);
    }

    public static void storeDeltagere (Deltager deltager) {
        deltagere.add(deltager);
    }



}
