package exercises;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (c == ')') {
                if (stack.empty() || c != stack.peek() + 1) return false;
                stack.pop();
            }
            if (c == ']' || c == '}') {
                if (stack.empty() || c != stack.peek() + 2) return false;
                stack.pop();
            }
        }
        return stack.empty();
    }
}
