package question8;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of entries:");
        int entries = scanner.nextInt();
        for (int index = 0; index < entries; index++) {
            System.out.print("Enter the key: ");
            String key = scanner.next();
            System.out.print("Enter the value: ");
            int value = scanner.nextInt();
            treeMap.put(key, value);
        }
        scanner.close();


        Comparator<Map.Entry<String, Integer>> comparator = (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue());
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        treeMap.entrySet().stream()
                .sorted(comparator)
                .forEachOrdered(entry -> linkedHashMap.put(entry.getKey(), entry.getValue()));

        System.out.println("Sorted entries:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

