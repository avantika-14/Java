package Polymorphism.CompileTimePolymorphism;

class Add{

    static int add(int a, int b){
        return a + b;
    }

    static double add(double a, double b){
        return a + b;
    }
}

public class TestOverLoading1 {

    public static void main(String[] args) {

        // now according to the type of input the compiler assigns the functions
        // if the input is all integer it'll assign the int add
        System.out.println(Add.add(1,2));
        System.out.println(Add.add(2.14,3.16));
    }
}
