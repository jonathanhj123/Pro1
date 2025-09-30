package DesignAnalyse;

public class Main {

    public static void main(String[] args) {

        KontoType Opsparing = new KontoType("Opsparing", "Opsparings Konto");
        KontoType LønKonto = new KontoType("LønKonto", "Løn Konto");

        KontoSystem MinKonto = new KontoSystem(1, Opsparing);
        KontoSystem MinKonto2 = new KontoSystem(2, Opsparing);
        KontoSystem MinKonto3 = new KontoSystem(3, LønKonto);
        KontoSystem MinKonto4 = new KontoSystem(4, LønKonto);


        MinKonto.hævBeløb(100);
        System.out.println(MinKonto.toString());

        MinKonto.indsætBeløb(1000);
        System.out.println(MinKonto.toString());

    }
}
