package controller;

import model.Deltager;
import model.Hold;
import model.*;
import storage.Storage;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.io.PrintWriter;

public class controller {

    public static Hold opretHold (String navn) {
        Hold hold = new Hold(navn);
        return hold;
    }

    public static Deltager opretDeltager (Hold hold, String navn, String mobil) {
        Deltager deltager = new Deltager(navn,mobil);
        hold.tilføjDeltager(deltager);
        return deltager;

    }

    public void tilføjDeltagerTilNyGruppe(Hold hold, Deltager deltager, Hold nytHold) {
        if (hold.getDeltagere().contains(deltager)) {
            hold.fjernDeltager(deltager);
            nytHold.tilføjDeltager(deltager);
        }

    }

    public void tilFøjTurTilDeltager (Tur tur, Deltager deltager) {
        deltager.tilføjTurTilDeltager(tur);
    }


    public static Tur opretTur (LocalDate dato, int antalMinutter, int antalKM, Deltager deltager) {
        Tur tur = new Tur(dato,antalMinutter,antalKM, deltager);
        deltager.tilføjTurTilDeltager(tur);
        return  tur;
    }

    public static Badge opretBadge (String beskrivelse) {
        Badge badge = new Badge(beskrivelse);
        return badge;
    }

    public static void tilføjBadgeTilDeltager (Deltager deltager, Badge badge) {
        deltager.tilføjBadgeTilDeltager(badge);
        badge.tilføjDeltagerTilBadge(deltager);
    }

    public ArrayList<String> deltagerOversigt(Hold hold) {
        ArrayList<String> oversigt = new ArrayList<>();

        for (Deltager deltager : hold.getDeltagere()) {
            String navn = deltager.getNavn();
            String mobil = deltager.getMobil();
            int kmiAlt = deltager.kmIAlt();
            deltager.getBadges();

            if (deltager.getBadges() == null) {
                oversigt.add(navn + " " +mobil + "," +kmiAlt + "Badges : " + deltager.getBadges());
            } else {
                oversigt.add(navn + " " +mobil + "," + kmiAlt + " Badges: ingen badges");
            }

        }
        return oversigt;
    }

    public void bubbleSort(ArrayList<String> arr) {
        for (int i = arr.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    String temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

        public void udskrivDeltagerOversigt () {
            String filename = "C:/Users/jona2/OneDrive/Skrivebord/Jonathan";


            try (PrintWriter printWriter = new PrintWriter(filename)) {
                for (Hold hold : Storage.getHold()) {
                    if (!hold.getDeltagere().isEmpty()) {
                        printWriter.println("Hold: " + hold.getNavn());
                        ArrayList<String> temp = deltagerOversigt(hold);
                        bubbleSort(temp);
                        printWriter.println(temp);
                    } else {
                        printWriter.println("Hold: " + hold.getNavn());
                        printWriter.println("- ingen deltagere -");
                    }
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Fejl ved at finde filen eller oprette den");
            }
        }

    }


