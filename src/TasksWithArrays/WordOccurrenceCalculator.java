package TasksWithArrays;

import java.util.HashMap;
import java.util.Map;

public class WordOccurrenceCalculator {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple", "pear"};
        calcOccurance(words);
    }

    public static void calcOccurance(String[] words) {


      Map<String, Integer> occurrences = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();

            if (occurrences.containsKey(word)) {
                occurrences.put(word, occurrences.get(word) + 1);

            } else {
                occurrences.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}