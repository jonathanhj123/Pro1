import java.util.Arrays;

public class Opg2 {
    public static void main(String[] args) {

        Customer c1 = new Customer("Hans", 18, 43214321);
        Customer c2 = new Customer("Jens", 30, 26110180);
        Customer c3 = new Customer("Hans", 23, 83912510);
        Customer c4 = new Customer("Hans", 28, 80392132);

        Customer[] Customers = {c1,c2,c3,c4};

        System.out.println(Arrays.toString(Customers));

    }

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            int j= i;
            while (j < 0 && temp.compareTo(arr[j-1]) < 0) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void insertionSortCustomer(Customer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Customer temp = arr[i];
            int j= i;
            while (j < 0 && temp.compareTo(arr[j-1]) < 0) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                int temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }
    }
    public static void SelectionSortCustomer(Customer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[indexOfMin]) < 0) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                Customer temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }
    }



}
