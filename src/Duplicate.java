import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static Map<String, Boolean> findDuplicate(String[] words) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue() >= 2);
        }

        return resultMap;
    }
}