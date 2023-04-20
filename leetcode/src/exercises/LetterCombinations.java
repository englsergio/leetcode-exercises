package exercises;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>();
        String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","xwyz"};
        if(digits.isEmpty()) return res;
        res.add("");

        for (int i = 0; i < digits.length(); i++) {
            int currDigit = Character.getNumericValue(digits.charAt(i));
            while(res.peek().length() == i) {
                String permutation = res.remove();
                for (char c : map[currDigit].toCharArray()) {
                    res.add(permutation + c);
                }
            }
        }
        return res;
    }
}
