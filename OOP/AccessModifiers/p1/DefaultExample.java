package AccessModifiers.p1;

class DefaultExample {

    public static void main(String[] args) {

        // default access modifiers can be accessed within the same package
        Default d = new Default();
        d.display();
    }
}
