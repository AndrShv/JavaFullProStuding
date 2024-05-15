import java.util.Map;

class InfoAboutBook {
    public static void printStatistic(Map<String, Integer> wordFrequency, int totalWords) {
        System.out.println("Statistics:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("Total words: " + totalWords);
    }
}