package Student;

public class student {
    private String name;
    private int rollNumber;
    private double marks;

    public student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void displayStudent() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Marks: " + marks);
    }
}

