package Interface;

// this is like a blueprint
// Any class that implements testInterface must have a display() method
interface testInterface {
    final int a = 10;
    void display();
}

class Test implements testInterface {
    public void display() {
        System.out.println("Test display");
    }
}

public class Example {
    public static void main(String[] args) {

        Test test = new Test();
        test.display();
        System.out.println(test.a);
    }
}
