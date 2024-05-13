import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDate dob;

    // Constructor
    public Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    // Function to display student name
    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    // Function to calculate and display student age based on date of birth
    public void displayStudentAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - dob.getYear();
        if (currentDate.getMonthValue() < dob.getMonthValue() ||
                (currentDate.getMonthValue() == dob.getMonthValue()
                        && currentDate.getDayOfMonth() < dob.getDayOfMonth())) {
            age--;
        }
        System.out.println("Student Age: " + age);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example usage
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse("2000-01-01", formatter);
        Student student = new Student("John Doe", dob);
        student.displayStudentName();
        student.displayStudentAge();
    }
}