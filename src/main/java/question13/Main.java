package question13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers (separated by spaces): ");
        String input = scanner.nextLine();
        String[] integerStrings = input.split(" ");
        List<Integer> integerList = new ArrayList<Integer>();
        for (String integerString : integerStrings) {
            integerList.add(Integer.parseInt(integerString));
        }
        System.out.println("Original list: " + integerList);
        Collections.shuffle(integerList);
        System.out.println("Shuffled list: " + integerList);
    }
}
