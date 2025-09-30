import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.TooManyListenersException;

public class EX1 {
    public static void main(String[] args) {


        // a
        int[] a = new int[10];
        System.out.println("a" + Arrays.toString(a));

        //b
        int[] b = {2,44, -23, 99, 8, -5, 7, 10, 20, 30};
        System.out.println("b" + Arrays.toString(b));

        int[] c = new int[10];

        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
        System.out.println("c" + Arrays.toString(c));

        int[] d = new int[10];
        for (int i = 0; i <d.length; i++) {
            d[i] = 2* i + 2;
        }
        System.out.println("d" + Arrays.toString(d));

        int[] e = new int [10];
        for (int i = 0; i <e.length; i++) {
            e[i] = (i + 1) * (i + 1);
        }
        System.out.println("e" + Arrays.toString(e));

        int[] f = new int [10];
        for (int i = 0; i < f.length; i++ ){
            f[i] = i % 2;
        }
        System.out.println("f" + Arrays.toString(f));
        int[] g = new int [10];
        for ( int i = 0; i < g.length; i++){
            g[i] = i % 5;
        }
        System.out.println("g" + Arrays.toString(g));
        int[] h = new int [10];

        for ( int i = 0, sum = -1; i < 10; i++){
            if ( i % 2 == 0){
                 sum = sum +1;
            }
            else{
                sum = sum +3;
            }
            h[i] = sum;
        }
        System.out.println("h" + Arrays.toString(h));

    }

}
