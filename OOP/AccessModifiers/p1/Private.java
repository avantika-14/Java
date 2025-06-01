package AccessModifiers.p1;

class A {

    private void greet() {
        System.out.println("A");
    }
}

class Private {

    public static void main(String[] args) {

//        A obj = new A();
//        obj.greet(); // trying to access private method of another class
        // this will show error because private method of another class cannot be accessed
    }
}
