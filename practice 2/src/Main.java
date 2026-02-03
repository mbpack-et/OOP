// Main.java
public class Main {
    public static void main(String[] args) {
        // Test Student class
        Student student = new Student("John Doe", "S12345");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Year: " + student.getYearOfStudy());
        student.incrementYearOfStudy();
        System.out.println("After increment: " + student.getYearOfStudy());
        
        // Test StarTriangle class
        StarTriangle small = new StarTriangle(6);
        System.out.println("\nStar Triangle:");
        System.out.println(small.toString());

         System.out.println("\nTime Tests:");
        Time t = new Time(23, 5, 6);
        System.out.println("Universal: " + t.toUniversal());
        System.out.println("Standard: " + t.toStandard());
        
       
    }
}