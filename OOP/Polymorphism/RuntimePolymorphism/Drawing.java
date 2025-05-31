package Polymorphism.RuntimePolymorphism;

class Shape{
    void draw(){
        System.out.println("you are drawing");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("you are drawing a rectangle");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("you are drawing a circle");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("you are drawing a triangle");
    }
}

public class Drawing {

    public static void main(String[] args) {

        Shape s;

        s = new Rectangle();
        s.draw();

        s = new Circle();
        s.draw();

        s = new Triangle();
        s.draw();

    }
}
