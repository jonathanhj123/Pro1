package EX1;

public class EX2A {
    public static void main(String[] args) {

        int i = 1;

        printTowersOfTwo(i);
    }


    public static void printTowersOfTwo(int i){
        /*while ( i <= 1048576){

            System.out.println(i);
            i = i * 2;
        }
        */
        for (i = 1; i <= 1048576; i = i * 2) {
            System.out.println(i);
        }



    }
}
