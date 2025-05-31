package Inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {

        Animal dog = new Dog();

        dog.setId(123); // inherited from animal class
        dog.sound(); // overriden behaviour of sub class
    }
}

class Animal {

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound() {
        System.out.println("Mute by default");
    }
}

class Dog extends Animal {

    private void bark(){
        System.out.println("Dog " +getId()+ " is barking"); // The Dog class inherits getId() from Animal
    }

    @Override // overriding the mute by default sound method
    public void sound(){
        bark();
    }
}

