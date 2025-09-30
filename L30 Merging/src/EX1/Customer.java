package EX1;

import com.sun.source.tree.ArrayAccessTree;

import java.io.FileReader;
import java.util.ArrayList;

public class Customer {

    String name;
    int age;
    String lastName;


    public Customer(String name, int age, String lastName) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;

    }

    public int compareTo(Customer other){
        if (this.lastName.compareTo(other.name) == 0) {
            return this.name.compareTo(other.name);
        }
        else return this.lastName.compareTo(other.name);
    }

    public static ArrayList<Customer> mergeCustomer(ArrayList<Customer> l1, ArrayList<Customer> l2) {
        ArrayList<Customer> mergedCustomers = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;

        while(i1< l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) == -1) {
                mergedCustomers.add(l1.get(i1));
                i1++;
            }
            if (l1.get(i1).compareTo(l2.get(i2)) == 1) {
                mergedCustomers.add(l2.get(i2));
                i2++;
            } else {
                mergedCustomers.add(l1.get(i1));
                i1++;
            }
        }
        while (i1<l1.size()) {
            mergedCustomers.add(l1.get(i1));
            i1++;
        }
        while (i2<l2.size()) {
            mergedCustomers.add(l2.get(i2));
            i2++;
        }

        return mergedCustomers;
    }

}
