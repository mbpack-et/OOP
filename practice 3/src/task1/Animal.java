package task1;

class Animal {
    String name;
    int age;

   
    Animal() {
        System.out.println("Animal created");
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor with parameters");
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}
