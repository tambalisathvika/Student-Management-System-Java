package Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Delete Student");
            System.out.println("5. Calculate Average Marks");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter roll number: ");
                    int roll = scanner.nextInt();

                    System.out.print("Enter marks: ");
                    double marks = scanner.nextDouble();

                    manager.addStudent(name, roll, marks);
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int searchRoll = scanner.nextInt();
                    manager.searchStudent(searchRoll);
                    break;

                case 4:
                    System.out.print("Enter roll number to delete: ");
                    int deleteRoll = scanner.nextInt();
                    manager.deleteStudent(deleteRoll);
                    break;

                case 5:
                    manager.calculateAverageMarks();
                    break;

                case 6:
                    System.out.println("👋 Exiting the program. Goodbye!");
                    return;

                default:
                    System.out.println("❗ Invalid option. Please choose between 1 to 6.");
            }
        }
    }
}
