package Abstract;

public class AbstractDemo {

    public static void main(String[] args) {

        // employee are of two types - contractual and full time
        // here FullTimeEmployee and Contractor class extend Employee to show the same categories

        Employee contractor = new Contractor("contractor A", 10, 10);
        Employee fullTimeEmployee = new FullTImeEmployee("Employee F", 20);

        // the abstraction concept lies here in the caculatePay where it's called in its own type of class' version
        // here only the required output is shown, not how its calculated
        // and the calculations are objective to the type of employee and not defined in the Employee class
        System.out.println(contractor.calculatePay());
        System.out.println(fullTimeEmployee.calculatePay());
    }
}
