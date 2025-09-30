public class Opg2 {
    public static void main(String[] args) {

        int[] numbers = {7,56,34,3,7,14,13,4};

        System.out.println("The first number between the interval [10:15] in the array number is " + numberInInterval(numbers));

    }

    public static int numberInInterval (int[] arr) {
        int i = 0;
        int number = -1;
        boolean found = false;

        while (i < arr.length && !found ) {
            if (arr[i] > 10 && arr[i] < 15) {
                found = true;
                number = arr[i];
            } else {
                i++;
            }
        }
        return number;
    }
}
