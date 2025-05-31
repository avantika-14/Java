package Abstract;

public abstract class Employee {

    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    // this is abstract because every employee must have calculatePay() method to calculate their pay themselves
    public abstract int calculatePay();

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPaymentPerHour(int paymentPerHour){
        this.paymentPerHour = paymentPerHour;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }
}
