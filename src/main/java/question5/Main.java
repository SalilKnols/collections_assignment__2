package question5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the document:");
        String document = scanner.nextLine();
        scanner.close();

        // Create a HashMap that maps words to their frequency in the document
        HashMap<String, Integer> wordMap = new HashMap<>();
        String[] words = document.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();
            if (!wordMap.containsKey(word)) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, wordMap.get(word) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        List<String> top10Words = new ArrayList<>();
        for (int index = 0; index < 10 && index < list.size(); index++) {
            top10Words.add(list.get(index).getKey());
        }

        // Print the top 10 most frequent words
        System.out.println("Top 10 most frequent words:");
        for (String word : top10Words) {
            System.out.println(word + ": " + wordMap.get(word));
        }
    }
}
