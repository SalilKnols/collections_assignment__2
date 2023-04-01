package question1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of entries to add: ");
        int numEntries = scanner.nextInt();
        scanner.nextLine();


        for (int index = 1; index <= numEntries; index++) {
            System.out.print("Enter name for entry #" + index + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter age for entry #" + index + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();
            map.put(name, age);
        }

        System.out.println("HashMap contents:");
        for (String name : map.keySet()) {
            int age = map.get(name);
            System.out.println(name + " -> " + age);
        }
    }
}

