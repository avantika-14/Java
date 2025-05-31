package Abstract;

public class AbstractDemo {

    public static void main(String[] args) {

        Employee contractor = new Contractor("contractor A", 10, 10);
        System.out.println(contractor.calculatePay());

        Employee fullTimeEmployee = new FullTImeEmployee("Employee F", 20);
        System.out.println(fullTimeEmployee.calculatePay());
    }
}
