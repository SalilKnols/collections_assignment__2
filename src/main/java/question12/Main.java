package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        List<Integer> integerList = new ArrayList<>();


        System.out.println("Enter the integers (one per line), type 'done' to finish:");
        while (input.hasNextInt()) {
            int num = input.nextInt();
            integerList.add(num);
        }

        // Find the maximum value in the list using Collections.max() method
        int maximumValue = Collections.max(integerList);

        // Print the maximum value
        System.out.println("The maximum value is " + maximumValue);
    }
}

