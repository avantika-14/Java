package Interface;

interface Vehicle {

    // abstract methods defined
    void changedGears(int a);
    void speedUp(int a);
    void applyBreaks(int a);
}

class Bicycle implements Vehicle {

    int speed;
    int gears;

    // changing gears
    @Override
    public void changedGears(int newGears) {
        speed = newGears;

    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        speed -= decrement;
    }

    public void printStates(){
        System.out.println("Speed: " + speed + " Gears: " + gears);
    }
}

class Bike implements Vehicle {

    int speed;
    int gears;

    @Override
    public void changedGears(int newGears) {
        speed = newGears;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        speed -= decrement;
    }

    public void printStates(){
        System.out.println("Speed: " + speed + " Gears: " + gears);
    }
}

public class Main {

    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.changedGears(5);
        bike.speedUp(5);
        bike.applyBreaks(2);

        System.out.println("current state of bike: ");
        bike.printStates();

        Bicycle bicycle = new Bicycle();
        bicycle.changedGears(7);
        bicycle.speedUp(3);
        bicycle.applyBreaks(1);

        System.out.println("current state of bicycle: ");
        bicycle.printStates();

    }
}
