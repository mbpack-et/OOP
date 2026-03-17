import interfaces.*;

public class Student extends Person implements CanHavePizza, Movable, CanHaveParty {

    String name;
    double gpa;

    @Override
    public void eatPizza() {
        System.out.println("Student is eating pizza");
    }

    @Override
    public void move() {
        System.out.println("Student is moving");
    }

    @Override
    public void dance() {
        System.out.println("Student is dancing");
    }
}