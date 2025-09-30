//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog(1, "Fiddo");
        Dog dog2 = new Dog(2, "Marcus");
        Dog dog3 = new Dog(3, "Pedro");
        Dog dog4 = new Dog(4, "Bounty");


        Person person1 = new Person("Jens" ,"Iphone", "2611321623");
        Person person2 = new Person("Peter" ,"Android", "2611332623");
        Person person3 = new Person("Mikael" ,"Huawei", "2611621623");
        Person person4 = new Person("Heinrich" ,"Oneplus", "2811321623");


        dog1.setPerson(person2, dog1);
        person2.addDog(dog1);
        System.out.println(dog1.getPerson());
        System.out.println(person2.getDog());

    }
}