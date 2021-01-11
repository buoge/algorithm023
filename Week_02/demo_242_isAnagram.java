import java.util.HashMap;
import java.util.Map;

public class demo_242_isAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("abc","cba1"));
    }


    public static boolean isAnagram(String s, String t) {
        if (s==null || t==null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character,Integer> counterMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            counterMap.put(c, counterMap.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            counterMap.put(c, counterMap.getOrDefault(c,0)-1);
            if (counterMap.get(c) < 0) {
                return false;
            }
        }
        return true;
    }



}
