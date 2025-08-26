package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ans6 {
    public static void main(String[] args) {
        String str = "aabbcdeff";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("First non-repeating: " + e.getKey());
                break;
            }
        }
        
    }
}
