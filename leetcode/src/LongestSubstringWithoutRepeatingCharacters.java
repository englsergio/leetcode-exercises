package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    private LongestSubstringWithoutRepeatingCharacters() {}
    public static int lengthOfLongestSubstring(String s) {
        int initialPointer = 0;
        int lengthOfLongestSubstring = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.substring(initialPointer, i).contains(String.valueOf(s.charAt(i)))) {
                initialPointer = s.indexOf(s.charAt(i), initialPointer) + 1;
            }
            lengthOfLongestSubstring = Math.max(s.substring(initialPointer, i + 1).length(), lengthOfLongestSubstring);
        }
        return lengthOfLongestSubstring;
    }
}
