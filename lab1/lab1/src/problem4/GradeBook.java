package problem4;

import java.util.ArrayList;

import practice2.Student;

public class GradeBook {

    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }


    public double determineClassAverage() {
        int sum = 0;
        for (Student s : students) {
            sum += s.getGrade();
        }
        return (double) sum / students.size();
    }

    public Student getLowestGradeStudent() {
        Student min = students.get(0);
        for (Student s : students) {
            if (s.getGrade() < min.getGrade()) {
                min = s;
            }
        }
        return min;
    }


    public Student getHighestGradeStudent() {
        Student max = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > max.getGrade()) {
                max = s;
            }
        }
        return max;
    }


    public void outputBarChart() {
        int[] frequency = new int[11];

        for (practice2.Student s : students) {
            frequency[s.getGrade() / 10]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < frequency.length; i++) {
            if (i == 10)
                System.out.print("100: ");
            else
                System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");

            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

  
    public void displayGradeReport() {
        System.out.printf("Class average is %.2f%n", determineClassAverage());

        Student low = getLowestGradeStudent();
        Student high = getHighestGradeStudent();

        System.out.println("Lowest grade is " + low.getGrade() +
                " (" + low.getName() + ", id: " + low.getId() + ")");
        System.out.println("Highest grade is " + high.getGrade() +
                " (" + high.getName() + ", id: " + high.getId() + ")");

        outputBarChart();
    }

    @Override
    public String toString() {
        return "GradeBook for course: " + course;
    }
}
