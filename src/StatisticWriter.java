import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class StatisticWriter {
    public static void writeStatistic(String bookName, Map<String, Integer> wordFrequency, int totalWords) throws IOException {
        File statisticFile = new File(bookName + "_statistic.txt");
        try (PrintWriter writer = new PrintWriter(statisticFile)) {
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                writer.println(entry.getKey() + " -> " + entry.getValue());
            }
            writer.println("Total words: " + totalWords);
        }
    }
}
