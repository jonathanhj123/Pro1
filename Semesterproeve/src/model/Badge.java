package model;

import java.util.ArrayList;
import java.util.List;

public class Badge {

    private final ArrayList<Deltager> deltagere = new ArrayList<Deltager>();
    private String beskrivelse;


    public ArrayList<Deltager> getDeltagere() {
        return deltagere;
    }

    public Badge(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public void tilføjDeltagerTilBadge(Deltager deltager) {
        this.deltagere.add(deltager);
    }

    public Deltager findDeltager( ArrayList<Deltager> list, Badge badge) {
        Deltager deltager = null;
        int i = 0;
        Boolean found = false;

        while (deltager == null && i < list.size() && !found) {
            Deltager d = list.get(i);
            for (Badge badges : d.getBadges()) {
                if (badges.equals(badge)) {
                    found = true;
                }
            }
            if (found = true) {
                deltager = d;
            } else {
                i++;
            }
        }
        return deltager;
    }

}
