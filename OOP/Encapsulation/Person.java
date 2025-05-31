package Encapsulation;

public class Person {

    // the data is hidden
    private String name;
    private double id;

    public Person(){
        // only person class can access and assign id
        id = Math.random();
        sayHello();
    }

    private void sayHello(){
        System.out.println("Hello, " + getId());
    }

    public double getId(){
        return id;
    }


    // only using this data can be accessed or updated
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
