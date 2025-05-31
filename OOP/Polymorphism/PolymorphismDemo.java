package Polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {

        // user must use a payment method which can be changed according to behaviour
        // not runtime because same type hence direct method call
        CashPayment c = new CashPayment();
        c.pay();

        // this is a runtime polymorphism
        // the actual method is decided according the object assigned during runtime
        Payment p = new CashPayment();
        p.pay();

        p = new CreditPayment();
        p.pay();
    }
}

interface Payment {
    public void pay(); // one must pay
}

class CashPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("this is cash payment");

    }
}

class CreditPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("this is credit payment");
    }
}
