package OOPS.ClassesAndObjects;

import java.util.Scanner;

class SchoolStudents {
    // Instance variables
    String name;
    int rollNumber;
    double grade;

}

class StudentInformationCollector {
    public static void main(String[] args) {
        // Create an instance of Student
        SchoolStudents student = new SchoolStudents();

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Read input for the student's details
        student.name = scanner.nextLine();
        student.rollNumber = scanner.nextInt();
        student.grade = scanner.nextDouble();


        // Display the student's details using instance variables
        System.out.println("Student Details:");
        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Grade: " + student.grade);

        // Close scanner
        scanner.close();
    }
}
