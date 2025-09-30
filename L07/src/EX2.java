import java.lang.reflect.Array;
import java.util.Arrays;

public class EX2 {
    public static void main(String[] args) {


        int[] ArrayTest = {4,6,7,2,3};
        int[] ArrayTest2 = {4,6,8,2,6};
        int[] ab = Sumarrays(ArrayTest, ArrayTest2);
        System.out.println(sum(ArrayTest));
        System.out.println(Arrays.toString(ab));



        }
    public static int sum(int[] t){

        int sum = 0;

        for (int i = 0; i < t.length; i++){
            sum += t[i];

        }
        return sum;
        
    }
    public static int[] Sumarrays(int[]a , int[] b) {
        int[] ab = new int [a.length];
        int sum2 = 0;

        for (int i = 0; i < a.length; i++){
            ab[i] = a[i] + b[i];

        }
        return ab;

    }

    }

