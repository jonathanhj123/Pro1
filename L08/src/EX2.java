import java.util.Arrays;
import java.util.Random;

public class EX2 {

    public static void main(String[] args) {

        int[] random = new int[10];
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < random.length; i++) {
            int position = (int) (Math.random()*(10-i));
            random[i] = numbers[position];
          //  System.out.println(position);

            for (int j = position; j < 9; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[9-i] = 0;
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println(Arrays.toString(random));





    }
}