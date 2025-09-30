package Model;

public class Deltagelse {
    private Boolean registreret = false;
    private DeltagerStatus status = DeltagerStatus.TILSTEDE;

    private Lektion lektion;

    private Studerende studerende;


    public Deltagelse(Lektion lektion, Studerende studerende) {
        this.registreret = false;
        this.status = DeltagerStatus.TILSTEDE;
        this.lektion = lektion;
        this.studerende = studerende;
    }

    public Boolean getRegistreret() {
        return registreret;
    }

    public void setRegistreret(Boolean registreret) {
        this.registreret = registreret;
    }

    public DeltagerStatus getStatus() {
        return status;
    }

    public void setStatus(DeltagerStatus status) {
        this.status = status;
    }

    public Lektion getLektion() {
        return lektion;
    }

    public void setLektion(Lektion lektion) {
        this.lektion = lektion;
    }

    public Studerende getStuderende() {
        return studerende;
    }

    public void setStuderende(Studerende studerende) {
        this.studerende = studerende;
    }

    public boolean erRegistreretFraværende() {
        Boolean tilstede = true;
        if (this.registreret = true && status != DeltagerStatus.TILSTEDE) {
            tilstede = false;
        }
        return tilstede;
    }
}
