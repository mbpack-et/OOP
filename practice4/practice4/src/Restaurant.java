import interfaces.CanHavePizza;

public class Restaurant {

    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();

        if (eater instanceof Person) {
            ((Person) eater).pay();
        }

        return true;
    }
}