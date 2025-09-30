import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Opg3 {
    public static void main(String[] args) {

        int[] Numbers1 = {7,9,13,7,9,13};
        int[] Numbers2 = {7,9,13,13,9,7};

        System.out.println("The Numbers in Numbers1 have an adjacent number : " + AdjecentNumbers(Numbers1));
        System.out.println("The Numbers in Numbers2 have an adjacent number : " + AdjecentNumbers(Numbers2));


    }

    public static boolean AdjecentNumbers (int[] arr) {
        boolean found = false;
        int i = 1;

        while (i < arr.length && !found) {
            if (arr[i] == arr[i-1] ) {
                found = true;
            }
            else {
                i++;
            }
        }
        return found;
    }

    public static boolean AdjacentNumbersInPlaces (int[] arr, int n) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length + 1 - n) {
            boolean sameFound = nSame(arr, i, n);
            if (sameFound) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }



    public static boolean nSame (int[] arr, int i, int n) {
        boolean foundDiff = false;
        int value = arr[i];
        int j = i + 1;
        while (!foundDiff && j < i + n) {
            if (arr[j] != value) {
                foundDiff = true;
            } else {
                j++;

            }
        }
        return !foundDiff;
    }

}
