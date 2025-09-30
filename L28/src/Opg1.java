import javax.lang.model.element.NestingKind;
import java.util.Arrays;

public class Opg1 {
    public static void main(String[] args) {

        String[] StringArray = {"Ji","Jb","Ja","jo",};
        System.out.println(Arrays.toString(StringArray));

        bubbleSort(StringArray);
        System.out.println(Arrays.toString(StringArray));
    }
    public static void bubbleSort(String[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0 ) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


}
