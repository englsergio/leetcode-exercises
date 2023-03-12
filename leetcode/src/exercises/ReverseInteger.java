package src.exercises;

import static java.lang.Math.abs;

public class ReverseInteger {
    public static int reverse(int x) {
        var numDigits = 0;
        int temp = x;
        while(temp != 0) {
            temp /= 10;
            numDigits++;
        }
        int temp2 = abs(x);
        var res = 0L;
        for (var i = 0; i < numDigits; i++) {
            int element = temp2 % 10;
            temp2 /= 10;
            res += element * Math.pow(10, numDigits - i - 1);
        }
        if(res > 2_147_483_647 || res < -2_147_483_648) return 0;
        return x < 0 ? (int)-res : (int)res;
    }
    public static int reverse_GPT(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            int newReversed = reversed * 10 + digit;
            if ((newReversed - digit) / 10 != reversed) {
                // Overflow occurred
                return 0;
            }
            reversed = newReversed;
            x /= 10;
        }
        return reversed;
    }
}