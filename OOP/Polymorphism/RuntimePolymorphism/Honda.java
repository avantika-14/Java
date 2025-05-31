package Polymorphism.RuntimePolymorphism;

class Bike{
    int speedLimit = 90;
}

public class Honda extends Bike{

    int speedLimit = 120; // not overridden instead hidden

    public static void main(String[] args) {

        Bike b = new Honda();
        System.out.println(b.speedLimit); // Look for speedLimit in the Bike class → finds 90
    }
}
