package question2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> gradeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the name of student #" + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the grade of student #" + i + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine();
            gradeMap.put(name, grade);
        }

        // Calculate the average grade for all students in the HashMap
        int totalGrade = 0;
        for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            totalGrade += entry.getValue();
        }
        double averageGrade = totalGrade / (double) gradeMap.size();
        System.out.println("The average grade is " + averageGrade);
    }
}

