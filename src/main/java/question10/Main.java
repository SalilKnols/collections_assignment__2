package question10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Take input from user to create a list of integers
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the ArrayList");
        int elements = scanner.nextInt();
        for (int index = 0; index < elements; index++) {
            System.out.print("Enter the values ");
            int value = scanner.nextInt();
            list.add(value);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(list);

        ArrayList<Integer> sortedList = new ArrayList<>();
        while (!queue.isEmpty()) {
            sortedList.add(queue.poll());
        }
        Collections.reverse(sortedList);

        System.out.println(sortedList);
    }
}
