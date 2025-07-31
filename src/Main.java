//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter Student Information");

        System.out.print("Student ID: ");
        String studentId = input.nextLine();

        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Course: ");
        String course = input.nextLine();

        System.out.print("Section: ");
        String section = input.nextLine();


        System.out.println("\n STUDENT INFORMATION ");
        System.out.println("Student ID     : " + studentId);
        System.out.println("Student Name   : " + firstName + " " + lastName);
        System.out.println("Course         : " + course);
        System.out.println("Section        : " + section);


        System.out.println("\n Enter Student Scores ");

        System.out.print("Midterm Exam Score (0-100): ");
        int midtermScore = input.nextInt();

        System.out.print("Final Exam Score (0-100): ");
        int finalScore = input.nextInt();

        System.out.print("Project Score (0-100): ");
        int projectScore = input.nextInt();

        System.out.print("Attendance Percentage (0-100): ");
        int attendanceScore = input.nextInt();


        int totalScore = midtermScore + finalScore + projectScore + attendanceScore;
        double averageScore = (totalScore / 400.0) * 100;

        String remarks = (averageScore >= 75) ? "PASSED" : "FAILED";


        System.out.println("\n STUDENT SCORES ");
        System.out.println("Midterm Exam   : " + midtermScore);
        System.out.println("Final Exam     : " + finalScore);
        System.out.println("Project        : " + projectScore);
        System.out.println("Attendance     : " + attendanceScore);

        System.out.printf("\nAverage Score  : %.2f%%\n", averageScore);
        System.out.println("Remarks        : " + remarks);


        input.close();
    }
}