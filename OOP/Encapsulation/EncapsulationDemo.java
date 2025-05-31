package Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {

            // protects data and gives control
            Person p1 = new Person();
            p1.setName("ramesh");

            System.out.println("Id - " +p1.getId()+ " Name - " + p1.getName());
    }
}
