package task1;

class Dog extends Animal {

 
    Dog() {
        super();
        System.out.println("Dog created");
    }

  
    Dog(String name, int age) {
        super(name, age);
        System.out.println("Dog constructor with parameters");
    }

  
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }


    void eat(String food) {
        System.out.println("Dog eats " + food);
    }
}
