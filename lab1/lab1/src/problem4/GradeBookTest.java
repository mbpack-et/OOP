package problem4;

import java.util.Scanner;

import practice2.Student;

public class GradeBookTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course course = new Course(
                "CS101",
                "Object-Oriented Programming and Design",
                5,
                "None"
        );

        GradeBook gradeBook = new GradeBook(course);

        Student[] students = {
                new Student(1, "Student A"),
                new Student(2, "Student B"),
                new Student(3, "Student C"),
                new Student(4, "Student D"),
                new Student(5, "Student E"),
        };

        System.out.println("Please, input grades for students:");

        for (Student s : students) {
            System.out.print(s.getName() + ": ");
            s.setGrade(scanner.nextInt());
            gradeBook.addStudent(s);
        }

        System.out.println();
        gradeBook.displayMessage();
        gradeBook.displayGradeReport();
    }
}
