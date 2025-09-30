package FAN;

public class E1 {
    public static void main(String[] args) {

        FAN fan1 = new FAN();
        FAN fan2 = new FAN();

        fan1.setSpeed(3);
        fan1.setRadius(7);
        fan1.turnOff();
        fan1.setColor("RED");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

}
