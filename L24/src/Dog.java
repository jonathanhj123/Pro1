public class Dog {

    private int number = 0;
    private String name;

    private Person Person = null;

    public Dog(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return Person;
    }

    public void setPerson(Person person, Dog dog) {
        var oldOwner = dog.getPerson();
        if (oldOwner !=null) {
            dog.RemovePerson(person);
        }

        Person = person;
    }


    public void RemovePerson(Person person) {
        person = null;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

}
