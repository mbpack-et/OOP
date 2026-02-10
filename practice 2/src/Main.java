// Main.java
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mamedov Niyaz", "S12345");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Year: " + student.getYearOfStudy());
        student.incrementYearOfStudy();
        System.out.println("After increment: " + student.getYearOfStudy());
       
    }
}