package Problem6;

/**
 * Problem #6: Improve Person and Animal (Pet) classes
 * Implementing 2 existing interfaces (Comparable, Cloneable)
 * Creating 2 custom interfaces (Trainable, Speaking)
 */

// ============================================
// CUSTOM INTERFACE 1: Trainable
// ============================================
/**
 * Animals that are trainable can learn and perform tricks
 */
interface Trainable {
    void train(String command);
    boolean knowsCommand(String command);
    void performTrick(String trickName);
    int getTrainingLevel(); // 0-100%
}

// ============================================
// CUSTOM INTERFACE 2: Speaking
// ============================================
/**
 * Objects that can speak/communicate
 */
interface Speaking {
    void speak();
    void sayName();
    String getVoice();
}

// ============================================
// EXISTING INTERFACE 1: Comparable
// ============================================
// (built-in Java interface)

// ============================================
// EXISTING INTERFACE 2: Cloneable
// ============================================
// (built-in Java interface)

// ============================================
// Enhanced Animal class
// ============================================
class Animal implements Comparable<Animal>, Cloneable, Trainable {
    protected String name;
    protected int age;
    protected String species;
    protected java.util.Vector<String> tricks;
    protected int trainingLevel; // 0-100
    
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.tricks = new java.util.Vector<>();
        this.trainingLevel = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public void makeSound() {
        System.out.println(species + " makes a sound");
    }
    
    // Trainable interface implementation
    @Override
    public void train(String command) {
        tricks.add(command);
        trainingLevel = Math.min(100, trainingLevel + 10);
        System.out.println(name + " learned command: " + command + 
                         " (Training: " + trainingLevel + "%)");
    }
    
    @Override
    public boolean knowsCommand(String command) {
        return tricks.contains(command);
    }
    
    @Override
    public void performTrick(String trickName) {
        if (knowsCommand(trickName)) {
            System.out.println(name + " performs: " + trickName);
        } else {
            System.out.println(name + " doesn't know how to " + trickName);
        }
    }
    
    @Override
    public int getTrainingLevel() {
        return trainingLevel;
    }
    
    // Comparable interface implementation (compare by age)
    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.age, o.age);
    }
    
    @Override
    public String toString() {
        return species + " - " + name + " (Age: " + age + ", Training: " + trainingLevel + "%)";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                name.equals(animal.name) &&
                species.equals(animal.species);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Animal cloned = (Animal) super.clone();
        cloned.tricks = new java.util.Vector<>(this.tricks);
        return cloned;
    }
}

// ============================================
// Dog class (extends Animal)
// ============================================
class Dog extends Animal implements Speaking {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    
    @Override
    public void speak() {
        System.out.println("Dog speaks: Woof woof!");
    }
    
    @Override
    public void sayName() {
        System.out.println("Dog's name is: " + name);
    }
    
    @Override
    public String getVoice() {
        return "Bark";
    }
    
    @Override
    public String toString() {
        return "Dog - " + name + " (" + breed + ", Age: " + age + 
               ", Training: " + trainingLevel + "%)";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// ============================================
// Cat class (extends Animal)
// ============================================
class Cat extends Animal implements Speaking {
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age, "Cat");
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
    
    @Override
    public void speak() {
        System.out.println("Cat speaks: Meow meow!");
    }
    
    @Override
    public void sayName() {
        System.out.println("Cat's name is: " + name);
    }
    
    @Override
    public String getVoice() {
        return "Meow";
    }
    
    @Override
    public String toString() {
        return "Cat - " + name + " (" + color + ", Age: " + age + 
               ", Training: " + trainingLevel + "%)";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// ============================================
// Enhanced Person class
// ============================================
class Person implements Comparable<Person>, Cloneable, Speaking {
    protected String name;
    protected int age;
    protected String address;
    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // Speaking interface implementation
    @Override
    public void speak() {
        System.out.println(name + " speaks: Hello!");
    }
    
    @Override
    public void sayName() {
        System.out.println("My name is: " + name);
    }
    
    @Override
    public String getVoice() {
        return "Voice";
    }
    
    // Comparable interface implementation (compare by age)
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
    
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + ", address=" + address + "]";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// ============================================
// Student class (extends Person)
// ============================================
class Student extends Person {
    private String studentId;
    private int year;
    
    public Student(String name, int age, String address, String studentId, int year) {
        super(name, age, address);
        this.studentId = studentId;
        this.year = year;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public int getYear() {
        return year;
    }
    
    @Override
    public void speak() {
        System.out.println(name + " speaks: I'm studying hard!");
    }
    
    @Override
    public String toString() {
        return "Student[name=" + name + ", age=" + age + ", studentId=" + studentId + 
               ", year=" + year + "]";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// ============================================
// Worker class (extends Person, also implements Trainable)
// ============================================
class Worker extends Person implements Trainable {
    private String jobTitle;
    private java.util.Vector<String> skills;
    private int trainingLevel;
    
    public Worker(String name, int age, String address, String jobTitle) {
        super(name, age, address);
        this.jobTitle = jobTitle;
        this.skills = new java.util.Vector<>();
        this.trainingLevel = 0;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
    
    @Override
    public void train(String command) {
        skills.add(command);
        trainingLevel = Math.min(100, trainingLevel + 15);
        System.out.println(name + " learned skill: " + command + 
                         " (Skill level: " + trainingLevel + "%)");
    }
    
    @Override
    public boolean knowsCommand(String command) {
        return skills.contains(command);
    }
    
    @Override
    public void performTrick(String trickName) {
        if (knowsCommand(trickName)) {
            System.out.println(name + " uses skill: " + trickName);
        } else {
            System.out.println(name + " doesn't have skill " + trickName);
        }
    }
    
    @Override
    public int getTrainingLevel() {
        return trainingLevel;
    }
    
    @Override
    public void speak() {
        System.out.println(name + " speaks: I work as a " + jobTitle);
    }
    
    @Override
    public String toString() {
        return "Worker[name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + 
               ", skills=" + trainingLevel + "%]";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Worker cloned = (Worker) super.clone();
        cloned.skills = new java.util.Vector<>(this.skills);
        return cloned;
    }
}

// ============================================
// Test Class
// ============================================
public class EnhancedClasses {
    public static void main(String[] args) {
        try {
            System.out.println("=== ANIMALS WITH TRAINABLE AND SPEAKING ===");
            Dog dog = new Dog("Max", 3, "Golden Retriever");
            Cat cat = new Cat("Whiskers", 2, "Orange");
            
            System.out.println(dog);
            dog.speak();
            dog.sayName();
            dog.train("sit");
            dog.train("fetch");
            dog.performTrick("sit");
            dog.performTrick("roll");
            System.out.println();
            
            System.out.println(cat);
            cat.speak();
            cat.sayName();
            cat.train("scratch");
            cat.performTrick("scratch");
            System.out.println();
            
            System.out.println("=== PEOPLE WITH SPEAKING ===");
            Person person = new Person("John", 30, "123 Main St");
            person.speak();
            person.sayName();
            System.out.println(person);
            System.out.println();
            
            Student student = new Student("Alice", 20, "456 College Ave", "STU001", 2);
            student.speak();
            System.out.println(student);
            System.out.println();
            
            System.out.println("=== WORKER WITH TRAINABLE ===");
            Worker worker = new Worker("Bob", 35, "789 Work St", "Software Engineer");
            worker.speak();
            worker.train("Java");
            worker.train("Python");
            worker.train("SQL");
            worker.performTrick("Java");
            worker.performTrick("C++");
            System.out.println();
            
            System.out.println("=== COMPARABLE: SORTING ANIMALS BY AGE ===");
            Animal[] animals = {
                new Dog("Max", 3, "Golden Retriever"),
                new Cat("Whiskers", 2, "Orange"),
                new Dog("Rex", 5, "German Shepherd"),
                new Cat("Fluffy", 1, "White")
            };
            
            System.out.println("Before sorting:");
            for (Animal a : animals) {
                System.out.println("  " + a);
            }
            
            java.util.Arrays.sort(animals);
            System.out.println("After sorting by age:");
            for (Animal a : animals) {
                System.out.println("  " + a);
            }
            System.out.println();
            
            System.out.println("=== COMPARABLE: SORTING PEOPLE BY AGE ===");
            Person[] people = {
                new Person("John", 30, "123 Main St"),
                new Student("Alice", 20, "456 College Ave", "STU001", 2),
                new Worker("Bob", 35, "789 Work St", "Engineer")
            };
            
            System.out.println("Before sorting:");
            for (Person p : people) {
                System.out.println("  " + p);
            }
            
            java.util.Arrays.sort(people);
            System.out.println("After sorting by age:");
            for (Person p : people) {
                System.out.println("  " + p);
            }
            System.out.println();
            
            System.out.println("=== CLONEABLE: CLONING ===");
            Dog originalDog = new Dog("Max", 3, "Golden Retriever");
            originalDog.train("sit");
            Dog clonedDog = (Dog) originalDog.clone();
            
            System.out.println("Original: " + originalDog);
            System.out.println("Cloned: " + clonedDog);
            System.out.println("Same object? " + (originalDog == clonedDog));
            System.out.println("Equal? " + originalDog.equals(clonedDog));
            System.out.println();
            
            Student originalStudent = new Student("Alice", 20, "456 College Ave", "STU001", 2);
            Student clonedStudent = (Student) originalStudent.clone();
            System.out.println("Original Student: " + originalStudent);
            System.out.println("Cloned Student: " + clonedStudent);
            System.out.println("Same object? " + (originalStudent == clonedStudent));
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
