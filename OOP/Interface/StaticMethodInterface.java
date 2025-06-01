package Interface;

interface NewInterface {

    final int a = 30;

    static void display() {
        System.out.println("Hello World");
    }
}
public class StaticMethodInterface implements TestInterface {

    public static void main(String[] args) {
        NewInterface.display();
    }
}
