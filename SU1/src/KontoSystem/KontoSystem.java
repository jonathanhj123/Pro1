package KontoSystem;

public class KontoSystem {

    private int nr = 0;
    private int saldo = 0;
    private String kontoType = "Konto";
    private String status = "Åben";

    public KontoSystem (String kontoType, int nr) {
    this.kontoType = kontoType;
    this.nr = nr;
    }

    public void indsætBeløb(int beløb) {
        this.saldo += beløb;
    }

    public void hævBeløb(int beløb) {

        if (this.saldo > beløb) {
            this.saldo -= beløb;
        }
        else {
            return;
        }

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



