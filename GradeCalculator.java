import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects;
        int[] marks;
        int totalMarks = 0;
        double averagePercentage;
        String grade;

        // Input: Ask user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        numberOfSubjects = scanner.nextInt();

        // Initialize the array to store the marks
        marks = new int[numberOfSubjects];

        // Input: Take marks obtained in each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();

            // Validate that the entered marks are between 0 and 100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks. Please enter marks between 0 and 100: ");
                marks[i] = scanner.nextInt();
            }

            totalMarks += marks[i];
        }

        // Calculate Average Percentage
        averagePercentage = (double) totalMarks / numberOfSubjects;

        // Grade Calculation based on average percentage
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else if (averagePercentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display Results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks Obtained: " + totalMarks + " out of " + (numberOfSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
