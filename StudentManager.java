package Student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<student> students = new ArrayList<>();

    public void addStudent(String name, int rollNumber, double marks) {
        student newStudent = new student(name, rollNumber, marks);
        students.add(newStudent);
        System.out.println("✅ Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("❌ No students to display.");
            return;
        }
        System.out.println("\n📋 List of Students:");
        for (student s : students) {
            s.displayStudent();
        }
    }

    public void searchStudent(int rollNumber) {
        for (student s : students) {
            if (s.getRollNumber() == rollNumber) {
                System.out.println("🔍 Student Found:");
                s.displayStudent();
                return;
            }
        }
        System.out.println("❌ Student with roll number " + rollNumber + " not found.");
    }

    public void deleteStudent(int rollNumber) {
        for (student s : students) {
            if (s.getRollNumber() == rollNumber) {
                students.remove(s);
                System.out.println("🗑️ Student removed successfully.");
                return;
            }
        }
        System.out.println("❌ Student not found.");
    }

    public void calculateAverageMarks() {
        if (students.isEmpty()) {
            System.out.println("❌ No students to calculate average.");
            return;
        }
        double total = 0;
        for (student s : students) {
            total += s.getMarks();
        }
        double average = total / students.size();
        System.out.printf("📊 Average Marks: %.2f\n", average);
    }
}
