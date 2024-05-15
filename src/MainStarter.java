import com.sun.source.tree.IfTree;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class MainStarter {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the book: ");
            String bookName = scanner.nextLine();

            String bookText = LoaderForBook.loadBook(bookName);
            Map<String, Integer> wordFrequency = TextAnalysing.analyzeText(bookText);
            int totalWords = wordFrequency.size();

            StatisticWriter.writeStatistic(bookName, wordFrequency, totalWords);
            InfoAboutBook.printStatistic(wordFrequency, totalWords);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage() +" has not found");
        }
    }
}
