package StaticandFinal;

class Account{

    public Account(int id){
        accountId = id;
    }

    final int accountId; // final value cannot be changed after assignment, unique per object
    static double rate = 1.5; // value can be changed but will be same for every instance of a class
    static final int oddLimit = 1000; // this is a constant value used across all the classed(one copy per class)
}

public class ExampleForEach {
    public static void main(String[] args) {

        {
            // each account will have its own unique value, once assigned it can't be changed
            Account first = new Account(123);
            Account second = new Account(456);

            System.out.println(first.accountId);
            System.out.println(second.accountId);

            // compiler error
//            first.accountId = 789;
        }

        {
            Account first = new Account(123);
            Account second = new Account(456);

            // can be changed but will be modified everywhere
            second.rate = 3.5;

            System.out.println(first.rate);
            System.out.println(second.rate);
        }

        {
            Account first = new Account(123);
            Account second = new Account(456);

            System.out.println(first.oddLimit);
            System.out.println(second.oddLimit);

            // compiler error
//            first.oddLimit = 500;
        }
    }
}





