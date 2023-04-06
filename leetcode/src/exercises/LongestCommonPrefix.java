package exercises;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int smallestStringLength = strs[0].length();
        int resultSize = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            smallestStringLength = Math.min(strs[i].length(), smallestStringLength);
            int temp = 0;
            for (int j = 0; j < smallestStringLength; j++) {
                if(strs[0].charAt(j) == strs[i].charAt(j)) temp++;
                else break;
            }
            resultSize = Math.min(temp, resultSize);
        }
        return resultSize == 0 ? "" : strs[0].substring(0, resultSize);
    }

    public static String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int index = 0;
        while(index < s1.length() && index < s2.length()) {
            if(s1.charAt(index) == s2.charAt(index)) index++;
            else break;
        }
        return s1.substring(0,index);
    }
}