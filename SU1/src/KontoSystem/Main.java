package KontoSystem;

public class Main {

    public static void main(String[] args) {

        KontoSystem MinKonto = new KontoSystem("LønKonto", 1);
        KontoSystem MinKonto2 = new KontoSystem("Opsparing", 2);
        KontoSystem MinKonto3 = new KontoSystem("LønKonto", 3);
        KontoSystem MinKonto4 = new KontoSystem("LønKonto", 4);


        MinKonto.hævBeløb(100);
        System.out.println(MinKonto.toString());

        MinKonto.indsætBeløb(1000);
        System.out.println(MinKonto.toString());

    }
}
