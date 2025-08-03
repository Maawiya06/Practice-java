package HashMap;

import java.util.HashMap;
import java.util.Map;

public class frequency {

    // Static method so it can be called from main
    static void countCharacter(Map<Character, Integer> mapping, String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Correct way to get character

            // Update frequency
            mapping.put(ch, mapping.getOrDefault(ch, 0) + 1);
        }
    }

    public static void main(String[] args) {
        String str = "AmeerMaawiya";
        Map<Character, Integer> mapping = new HashMap<>();

        countCharacter(mapping, str);

        // Iterate and print
        for (Map.Entry<Character, Integer> entry : mapping.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
