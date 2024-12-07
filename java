import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String course;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();

        // Create a Student object with the entered details
        Student student = new Student(name, rollNumber, course);

        student.displayDetails();
  }
}
