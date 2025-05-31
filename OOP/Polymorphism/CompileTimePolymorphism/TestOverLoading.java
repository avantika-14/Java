package Polymorphism.CompileTimePolymorphism;

class Adder{

    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }
}

public class TestOverLoading {

    public static void main(String[] args) {

        // compiler decides according to the number of arguments which one to call due to method overloading
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}
