package task2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static HashSet<Person> people = new HashSet<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1 - Add Person");
            System.out.println("2 - Add Student");
            System.out.println("3 - Add Staff");
            System.out.println("4 - Show all");
            System.out.println("0 - Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addPerson();
                case 2 -> addStudent();
                case 3 -> addStaff();
                case 4 -> showAll();
                case 0 -> System.exit(0);
            }
        }
    }

    static void addPerson() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();

        people.add(new Person(name, address));
    }

    static void addStudent() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Program: ");
        String program = sc.nextLine();
        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.print("Fee: ");
        double fee = sc.nextDouble();
        sc.nextLine();

        people.add(new Student(name, address, program, year, fee));
    }

    static void addStaff() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("School: ");
        String school = sc.nextLine();
        System.out.print("Pay: ");
        double pay = sc.nextDouble();
        sc.nextLine();

        people.add(new Staff(name, address, school, pay));
    }

    static void showAll() {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
