import java.util.ArrayList;

public class Person {

    private String cpr;
    private String phone;
    private String name;

    ArrayList<Dog> Dog = new ArrayList<>();

    private Dog dog = new Dog(2, "Hund");

    public Person(String name, String phone, String cpr) {
        this.name = name;
        this.phone = phone;
        this.cpr = cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpr() {
        return cpr;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Dog> getDog() {
        return Dog;
    }

    public void addDog(Dog dog) {
        Dog.add(dog);
    }

    public void removeDog (Dog dog) {
        Dog.remove(dog);
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cpr='" + cpr + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}


