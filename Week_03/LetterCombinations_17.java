import java.util.*;

/**
 * @Author: wucb
 * @Date: 2021/1/17 19:14
 * @Description:
 */
public class LetterCombinations_17 {

    public static void main(String[] args) {
        LetterCombinations_17 demo = new LetterCombinations_17();
        List<String> result = demo.letterCombinations("23");

        result.forEach(item -> {
            System.out.println(item);
        });
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        Map<Character,String> characterMap = new HashMap<>();
        characterMap.put('2',"abc");
        characterMap.put('3',"def");
        characterMap.put('4',"ghi");
        characterMap.put('5',"jkl");
        characterMap.put('6',"mno");
        characterMap.put('7',"pqrs");
        characterMap.put('8',"tuv");
        characterMap.put('9',"wxyz");

        List<String> res = new LinkedList<>();
        search("", digits, 0, res, characterMap);
        return res;

    }

    public void search(String s, String digital, int i, List<String> res, Map<Character,String> map){
        if (i == digital.length()) {
            res.add(s);
            return;
        }
        String letters = map.get(digital.charAt(i));
        for (int j=0; j<letters.length(); j++) {
            search(s+letters.charAt(j),digital, i+1, res, map);
        }
    }

}
