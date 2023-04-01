package question6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (one per line, or 'done' to finish):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Sort the ArrayList in ascending order using Collections.sort
        Collections.sort(numbers);

        System.out.println("Sorted integers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
