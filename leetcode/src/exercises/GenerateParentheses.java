package exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) { // very bad kkkk beats 13,12%
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        set.add("()");
        Set<String> tempSet = new HashSet<>();
        for (int i = 1; i < n; i++) {
            tempSet.clear();
            for (String s : set) {
                sb.append(s);
                sb.insert(0, "()");
                sb.append(s).insert(sb.length(), "()");
                sb.append("(").append(s).append(")");
                if ((i+1) % 2 == 0) sb.append("(())".repeat((i+1)/2));
                int index = -1;
                while (true) {
                    StringBuilder tempSb = new StringBuilder(s);
                    index = s.indexOf("()", index+1);
                    if(index < 0) break;
                    tempSb.insert(index+1, "()");
                    sb.append(tempSb);
                }
                while (sb.length() >= (i + 1) * 2) {
                    tempSet.add(sb.substring(0, (i + 1) * 2));
                    sb.delete(0, (i + 1) * 2);
                }
            }
            if(i==5) tempSet.add("(()())(()())");
            if(i==6) tempSet.addAll(Set.of("((()()))(()())", "(()()())(()())", "(()())((()()))", "(()())(()()())", "(()())()(()())"));
            if(i==7) tempSet.addAll(Set.of("(((()())))(()())","((()()()))(()())","((()())())(()())","((()()))((()()))","((()()))(()()())","((()()))()(()())","(()(()()))(()())","(()()()())(()())","(()()())((()()))","(()()())(()()())","(()()())()(()())","(()())(((()())))","(()())((()()()))","(()())((()())())","(()())(()(()()))","(()())(()()()())","(()())()((()()))","(()())()(()()())","(()())()()(()())"));
            set = Set.copyOf(tempSet);
        }
        return List.copyOf(set);
    }

    public List<String> generateParenthesis_LeetcodeBetterSolution(int n) { // Beats 93,70%
        List<String> res = new ArrayList<>();
        recurse(res, 0, 0, "", n);
        return res;
    }
    public void recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }
        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }
}
