package EX2;

import java.sql.ShardingKey;
import java.time.chrono.MinguoEra;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] int1 = {2, 4, 6, 8, 10, 12, 14};
        int[] int2 = {1, 2, 4, 5, 6, 9, 12, 17};
        int[] int3 = mergeInts(int1, int2);

        System.out.println(Arrays.toString(int1));
        System.out.println(Arrays.toString(int2));
        System.out.println(Arrays.toString(int3));

    }


    public static int[] mergeInts(int[] l1, int[] l2) {

        int[] sharedInts = new int[Math.min(l1.length, l2.length)];

        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while (i1 < l1.length && i2 < l2.length) {
            if (l1[i1] < l2[i2]) {
                i1++;
            } else if (l1[i1] > l2[i2]) {
                i2++;
            } else {
                sharedInts[j] = l1[i1];
                i1++;
                i2++;
                j++;

            }
        }
        return Arrays.copyOf(sharedInts,j);

    }
}
