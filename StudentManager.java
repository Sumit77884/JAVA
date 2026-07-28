import java.util.ArrayList;
import java.util.Collections;

// Custom Exception for Empty Student List
class EmptyStudentListException extends Exception {
    public EmptyStudentListException(String message) {
        super(message);
    }
}

public class StudentManager {
    private ArrayList<String> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    // Method to add a student name
    public void addStudent(String name) {
        studentList.add(name);
    }

    // Method to remove a student name
    public void removeStudent(String name) {
        studentList.remove(name);
    }

    // Method to display all student names in alphabetical order
    public void displayStudents() throws EmptyStudentListException {
        if (studentList.isEmpty()) {
            throw new EmptyStudentListException("Student list is empty!");
        }
        Collections.sort(studentList);
        System.out.println("Sorted names: " + studentList);
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        System.out.println("Adding names: Alice, Bob, Charlie");
        manager.addStudent("Alice");
        manager.addStudent("Bob");
        manager.addStudent("Charlie");

        try {
            manager.displayStudents();
        } catch (EmptyStudentListException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nRemoving Bob...");
        manager.removeStudent("Bob");

        try {
            manager.displayStudents();
        } catch (EmptyStudentListException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nRemoving remaining students...");
        manager.removeStudent("Alice");
        manager.removeStudent("Charlie");

        System.out.println("Attempting to display empty list...");
        try {
            manager.displayStudents();
        } catch (EmptyStudentListException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
