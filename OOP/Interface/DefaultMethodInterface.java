package Interface;

interface TestInterface {

    final int a = 10;

    default void test() {
        System.out.println("hello");
    }
}

class DefaultMethodInterface implements TestInterface {

    public static void main(String[] args) {
        DefaultMethodInterface obj = new DefaultMethodInterface();
        obj.test();
    }
}
