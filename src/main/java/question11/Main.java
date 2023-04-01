package question11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int numberOfElements = input.nextInt();

        List<String> list = new ArrayList<>();
        for (int index = 0; index < numberOfElements; index++) {
            System.out.print("Enter element " + (index+1) + ": ");
            String element = input.next();
            list.add(element);
        }

        Collections.sort(list);

        System.out.println("Sorted list: " + list);
    }
}
