package ex2;

import java.awt.datatransfer.MimeTypeParseException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);

        ArrayList<Integer> ints2 = new ArrayList<>();
//        ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
        int total = sum1(ints);
        int total2 = sum2(ints);
        int total3 = sum2(ints2);
        System.out.println("Sum: " + total);
        System.out.println("Sum: " + total2);
        System.out.println("Sum: " + total3);
        System.out.println("Lowest: " + minimum(ints));
        System.out.println("Max: " + maximum(ints));
        System.out.printf("Average: " + "%.3f",average(ints));
        System.out.println("");
        System.out.println("Zeroes: " + zeroes(ints));
        System.out.println("New array" + evens(ints));
        // Test of sum() method: correct sum is 61.

        // Test of minimum() method: correct minimum is -16.

        // Test of maximum() method: correct maximum is 45.

        // Test of average() method: correct average is 7.625.

        // Test of zeroes() method: correct number of zeroes is 2.

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
    }

    // sum made with for statement
    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }

    public static int sum2(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }

        return sum;
    }

    public static int minimum(ArrayList<Integer> list) {
        int lowest = 10000000;
        for (int i : list) {
            if (i < lowest) {
                lowest = i;
            }
            else {
                lowest = lowest;
            }

        }
        return lowest;
    }
    public static int maximum(ArrayList<Integer> list) {
        int max = 0;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
            else {
                max = max;
            }

        }
        return max;
    }

    public static double average(ArrayList<Integer> list) {
        double average = 0;
        for (int i : list) {
            average += i;
        }
        average = average/list.size();
        return average;
    }

    public static int zeroes(ArrayList<Integer> list) {
        int count = 0;
        for (int i : list) {
            if (i == 0) {
                count++;
            }
            else {
                count = count;
            }
        }
        return count;

    }

    public static ArrayList<Integer> evens(ArrayList<Integer> List) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i : List) {
            if (i % 2 == 0) {
                tempList.add(i);
            }
        }
        return tempList;
    }


}


