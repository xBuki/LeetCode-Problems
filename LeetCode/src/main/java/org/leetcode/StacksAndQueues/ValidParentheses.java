package org.leetcode.StacksAndQueues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> matchSet = new HashMap<>();
        matchSet.put('(', ')');
        matchSet.put('{', '}');
        matchSet.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (matchSet.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char previousOpening = stack.pop();
                if (matchSet.get(previousOpening) != c) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
