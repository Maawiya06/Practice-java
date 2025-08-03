package HashMap;

import java.util.HashMap;
import java.util.Map;

public class mapImple {

    public static void main(String[] args) {
        // map creation
        Map<String, Integer> mapping = new HashMap<>();

        // insertion
        mapping.put("Love", 25);
        mapping.put("Ameer ", 10);

        // print to verify
        System.out.println(mapping);
    }
}

