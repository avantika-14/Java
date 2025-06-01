package AccessModifiers.p2;
import AccessModifiers.p1.Protected;

// subclass of Protected
class ProtectedOne extends Protected {

    public static void main(String[] args) {
        ProtectedOne p = new ProtectedOne();
        p.sayHello();
    }
}
