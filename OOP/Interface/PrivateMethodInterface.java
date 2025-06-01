package Interface;

interface machine {

    private void startEngine(){
        System.out.println("engine started");
    }

    default void drive(){
        startEngine();
        System.out.println("vehicle driving");
    }
}

class Car implements machine {
    //inherits default method drive
}

public class PrivateMethodInterface {

    public static void main(String[] args) {
        Car car = new Car();
        // calls default method which calls private method
        car.drive();
    }
}
