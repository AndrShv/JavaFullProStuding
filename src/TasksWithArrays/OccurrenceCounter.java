package TasksWithArrays;

import java.util.Arrays;
import java.util.List;

public class OccurrenceCounter {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("apple", "banana", "apple", "orange", "apple", "grape", "banana", "apple", "mango", "apple");
        String targetWord = "apple";
        int counter = 0;

        for (String word : wordList) {
            if (word.equals(targetWord)) {
                counter++;
            }
        }




        System.out.println("The word " + targetWord + " occurs " + counter + " times.");
    }
}

