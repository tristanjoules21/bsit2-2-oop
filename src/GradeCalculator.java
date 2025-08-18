public class GradeCalculator {

    // 1. calculateAverage using varargs
    public double calculateAverage(double... grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    // 2. getLetterGrade
    public String getLetterGrade(double average) {
        if (average >= 90 && average <= 100) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // 3a. displayResult - version with average only
    public void displayResult(String studentName, double average) {
        System.out.printf("Student: %s , Average: %.2f%n", studentName, average);
    }

    // 3b. displayResult - version with average and letter grade
    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.printf("Student: %s , Average: %.2f , Grade: %s%n", studentName, average, letterGrade);
    }
}