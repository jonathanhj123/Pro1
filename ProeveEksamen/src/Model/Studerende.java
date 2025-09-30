package Model;

import java.util.ArrayList;

public class Studerende {

    private String navn;
    private String email;

    private ArrayList<Deltagelse> deltagelses = new ArrayList<>();

    public Studerende(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int antalFraværsLektioner() {
        int count = 0;
        for (Deltagelse deltagelse : deltagelses) {
            if (deltagelse.getRegistreret() == true && deltagelse.getStatus() != DeltagerStatus.TILSTEDE) {
                count++;
            }
        }
        return count;
    }
}
