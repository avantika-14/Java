package Interface;

interface A{
    void method1();
    void method2();
}

interface B extends A{
    void method3();
}

class ExtendingInterface implements B{

    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }

    public void method3() {
        System.out.println("method3");
    }

    public static void main(String[] args) {
        ExtendingInterface obj = new ExtendingInterface();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
