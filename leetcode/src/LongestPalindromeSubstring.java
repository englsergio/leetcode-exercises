package src;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeSubstring { //babad

    private LongestPalindromeSubstring(){}
    public static String longestPalindrome(String s) {

        ArrayList<String> list = new ArrayList<>();
        char[] charList = s.toCharArray();
        for (char c : charList) {
            list.add(String.valueOf(c));
        }
        var isOddPalidrome = true;
        var maxSubstringLen = 0;
        var pos = 0;
        ArrayList<String> listLength = list.size();

        for (var i = 0; i < listLenght; i++) {
            var counter = 0;
            if(i+1 < listLenght && list.get(i).equals(list.get(i+1))) {
                while((i-counter >= 0 && i+1+counter < listLenght) && list.get(i-counter).equals(list.get(i+1+counter))) {
                    counter++;
                }
                if(counter * 2 >= maxSubstringLen) {
                    maxSubstringLen = counter * 2;
                    isOddPalidrome = false;
                    pos = i;
                }
            }
            if((i-1 >= 0 && i+1 < listLenght) && list.get(i-1).equals(list.get(i+1))) {
                counter = 0;
                while ((i-counter-1 >= 0 && i+counter+1 < listLenght) && list.get(i-counter-1).equals(list.get(i+counter+1))) {
                    counter++;
                }
                if(counter * 2 + 1 >= maxSubstringLen) {
                    maxSubstringLen = counter * 2 + 1;
                    isOddPalidrome = true;
                    pos = i;
                }
            }
        }
        if(isOddPalidrome){
            if((pos + (maxSubstringLen-1)/2 + 1 >= listLenght+1)) return s.substring(pos - (maxSubstringLen-1)/2);
            else return s.substring(pos - (maxSubstringLen-1)/2, pos + (maxSubstringLen-1)/2 + 1);
        }
        if(pos + (maxSubstringLen-2)/2 + 1 >= listLenght+1) return s.substring(pos - (maxSubstringLen-2)/2);
        return s.substring(pos - (maxSubstringLen-2)/2, pos + (maxSubstringLen-2)/2 + 2);
    }
}
