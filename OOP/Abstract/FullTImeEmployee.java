package Abstract;

public class FullTImeEmployee extends Employee{


    public FullTImeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculatePay() {
        return getPaymentPerHour() * 8;
    }
}
