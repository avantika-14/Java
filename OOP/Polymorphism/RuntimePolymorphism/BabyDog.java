package Polymorphism.RuntimePolymorphism;

class MyAnimal{
    void eat(){
        System.out.println("animal is eating");
    }
}

class MyDog extends MyAnimal {
    void eat(){
        System.out.println("my dog is eating"); // not overriden
    }
}

public class BabyDog extends MyDog {

    public static void main(String[] args) {

        MyAnimal animal = new BabyDog(); // Since BabyDog doesn't have eat() to override, Java uses the inherited version by going one step above to MyDog
        animal.eat();

    }
}
