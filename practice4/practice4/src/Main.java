import interfaces.*;

public class Main {
    public static void main(String[] args) {

        Restaurant delpapa = new Restaurant();

        Cat cat = new Cat();
        Student student = new Student();

        delpapa.servePizza(cat);
        delpapa.servePizza(student);
    }
}
