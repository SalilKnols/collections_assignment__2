package question7;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings to add to the set (press Ctrl+D to stop):");
        HashSet<String> set = new HashSet<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            set.add(line);
        }

        List<String> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList, Collections.reverseOrder());

        System.out.println("Sorted strings in descending order:");
        for (String string : sortedList) {
            System.out.println(string);
        }
    }
}

