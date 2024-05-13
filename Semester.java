import java.util.HashMap;
import java.util.Map;

public class Semester {
    private int semesterNumber;
    private Map<String, Integer> coursesMarks;

    // Constructor
    public Semester(int semesterNumber) {
        this.semesterNumber = semesterNumber;
        this.coursesMarks = new HashMap<>();
    }

    // Method to add course and marks
    public void addCourse(String courseName, int marksObtained) {
        coursesMarks.put(courseName, marksObtained);
    }

    // Method to display courses and marks
    public void displayCoursesAndMarks() {
        System.out.println("Courses and Marks for Semester " + semesterNumber + ":");
        for (Map.Entry<String, Integer> entry : coursesMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " marks");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example usage
        Semester semester1 = new Semester(1);
        semester1.addCourse("Mathematics", 85);
        semester1.addCourse("Physics", 75);
        semester1.addCourse("Chemistry", 80);
        semester1.displayCoursesAndMarks();

        Semester semester2 = new Semester(2);
        semester2.addCourse("Computer Science", 90);
        semester2.addCourse("Biology", 78);
        semester2.addCourse("English", 88);
        semester2.displayCoursesAndMarks();
    }
}