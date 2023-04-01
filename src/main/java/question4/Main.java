package question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> salaryMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        for (int index = 1; index <= numEmployees; index++) {
            System.out.print("Enter the name of employee #" + index + ": ");
            String name = scanner.next();
            System.out.print("Enter the salary of employee #" + index + ": ");
            double salary = scanner.nextDouble();
            salaryMap.put(name, salary);
        }

        // Give a 5% raise to all employees who earn less than $50,000 per year
        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            if (entry.getValue() < 50000.0) {
                double newSalary = entry.getValue() * 1.05;
                entry.setValue(newSalary);
            }
        }
        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
