package question14;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of entries in the map: ");
        int numberOfEntries = input.nextInt();
        input.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int index = 0; index < numberOfEntries; index++) {
            System.out.print("Enter key " + (index+1) + ": ");
            String key = input.nextLine();
            System.out.print("Enter value " + (index+1) + ": ");
            int value = input.nextInt();
            input.nextLine();
            map.put(key, value);
        }

        // Create a list of entries from the map
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list in descending order by value
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        // Create a new LinkedHashMap to store the sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println("Sorted Map (Descending Order): ");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
