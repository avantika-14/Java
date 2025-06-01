package Interface;

// level 1 - defining interfaces
interface Bank{
    void deposit();
    void withdraw();
    void loan();
    void account();
}

// level 2 - abstract classes with partial implementation
abstract class Dev1 implements Bank{

    public void deposit(){
        System.out.println("deposit amount: " + 100);
    }
}

abstract class Dev2 extends Dev1{

    public void withdraw(){
        System.out.println("withdraw amount: " + 50);
    }
}

// level 3 - implementation classes with all the implementations
class Dev3 extends Dev2{

    public void loan(){}
    public void account(){}
}

// level 4 - main method
class LevelWiseImplementation {

    public static void main(String[] args) {
        Dev3 obj = new Dev3();
        obj.account();
        obj.deposit();
        obj.withdraw();
        obj.loan();
    }
}

