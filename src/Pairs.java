import java.util.HashMap;
import java.util.Map;

public class Pairs {

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            if (!str.isEmpty()) {
                char firstChar = str.charAt(0);
                char lastChar = str.charAt(str.length() - 1);
                result.put(String.valueOf(firstChar), String.valueOf(lastChar));
            }
        }

        return result;
    }
}