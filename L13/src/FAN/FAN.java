package FAN;

public class FAN {

    public FAN () {
        this.speed = speed;
        this.Radius = Radius;
        this.color = color;
        this.onOrOff = onOrOff;
    }
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int  FAST = 3;
    private int speed = 1;
    private boolean onOrOff = false;
    private double Radius = 5;
    String color = "BLUE";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOnOrOff() {
        return onOrOff;
    }

    public void setOnOrOff(boolean onOrOff) {
        this.onOrOff = onOrOff;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void turnOn() {
        onOrOff = true;
    }

    public void turnOff() {
        onOrOff = false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (isOnOrOff()) {
            return "The speed is : " + this.speed +" The color is : "+ this.color +" The radius is : "+ this.Radius;
        }
        else {
            return "The color is: " + this.color +" "+ "The Radius is : " + this.Radius +" "+ "The fan is off";
        }

    }




}
