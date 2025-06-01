package StaticandFinal;

class MyExample {

    final int id;               // unique per object, cannot change
    static final int CODE = 100; // shared by all, cannot change

    MyExample(int value) {
        id = value;             // You can assign final ONCE
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("CODE: " + CODE);
    }
}

public class TestFinal {
    public static void main(String[] args) {
        MyExample a = new MyExample(1);
        MyExample b = new MyExample(2);

        a.show();
        b.show();
    }
}

