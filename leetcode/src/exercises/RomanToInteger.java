package src.exercises;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt_mySolution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(map.get(s.charAt(i)) < prev) res -= map.get(s.charAt(i));
            else res += map.get(s.charAt(i));
            prev = map.get(s.charAt(i));
        }
        return res;
    }
    public static int romanToInt_betterSolution(String s) {
        int res = 0, prev = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if(num < prev) res -= num;
            else res += num;
            prev = num;
        }
        return res;
    }
}
