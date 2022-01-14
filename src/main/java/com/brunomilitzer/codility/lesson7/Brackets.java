package com.brunomilitzer.codility.lesson7;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (char c : S.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return 0;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return 0;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return 0;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
