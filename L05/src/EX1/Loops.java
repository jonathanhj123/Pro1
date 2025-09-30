package EX1;

public class Loops {
    public static void main(String[] args) {


        int i = 0;
        int sum = 0;
        while (i <=100){
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(" Sum is " + sum);
            }
            i++;
        }
    }
}
