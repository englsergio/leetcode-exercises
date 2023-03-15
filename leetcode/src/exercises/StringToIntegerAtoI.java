package src.exercises;

public class StringToIntegerAtoI {
    public static int myAtoi(String s) {
        int sign = 1;
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean numberStarted = false;
        for (char c : arr) {
            if (numberStarted && (c < 48 || c > 57)) break;
            if (c == ' ') continue;
            if (c == '-' || c == '+') {
                sign = c == '-' ? -1 : 1;
                numberStarted = true;
            }
            if (c > 47 && c < 58) {
                numberStarted = true;
                sb.append(c);
            }
            if (c != '-' && c != '+' && (c < 48 || c > 57)) break;
        }
        while(sb.length() > 0 && sb.charAt(0) == 48) sb.deleteCharAt(0);
        String strFinal = sb.toString();
        int defaultReturn = sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        if(strFinal.length() > 10) return defaultReturn;
        if(strFinal.length() == 10) {
            for (int i = 0; i < strFinal.length(); i++) {
                int limitDigit = (Integer.MAX_VALUE / (int) Math.pow(10, 9 - i)) % 10;
                if(strFinal.charAt(i) - 48 > limitDigit || i == 9 && sign < 0 && limitDigit > 7) return defaultReturn;
                if(strFinal.charAt(i) - 48 < limitDigit) break;
            }
        }
        if(strFinal.equals("")) return 0;
        return Integer.parseInt(strFinal) * sign;
    }
}