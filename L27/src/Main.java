import javax.sound.midi.Soundbank;
import javax.swing.plaf.metal.MetalIconFactory;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] Numbers = {2,4,6,1,8};
        int[] Even = {2,4,6,8,10};

        boolean NumbersUneven = isUnevenNo(Numbers);
        boolean EvenUneven = isUnevenNo(Even);

        System.out.println("There are uneven numbers in the numbers array : " + NumbersUneven);
        System.out.println("There are uneven numbers in the even array : " + EvenUneven);


    }

    public static boolean isUnevenNo(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            if (arr[i] % 2 == 1) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }



}