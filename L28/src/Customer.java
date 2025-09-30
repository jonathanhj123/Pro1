public class Customer  implements Comparable<Customer>{

    String name = null;
    int age = 18;

    int phoneNo = 12341234;

    public Customer(String name, int age, int phoneNo) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    @Override
    public int compareTo(Customer other) {
        return Integer.compare(this.age, other.age);
    }

    public int compareToPhone(Customer other) {
        return Integer.compare(this.phoneNo, other.phoneNo);
    }

    public int CompareToName(Customer other) {
        return this.name.compareTo(other.name);
    }

}
