package com.strings;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDuplicateStrings {

    public static void main(String[] args) {
        String str = removeDuplicates("abbaca");
        System.out.println(str);
    }

    public static String removeDuplicates(String S) {
        if (StringUtils.isBlank(S)) {
            return "";
        }
        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack();
        stack.add(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (!stack.isEmpty() && stack.peek() == chars[i]) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
        }

        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            Character pop = stack.pop();
            sb.append(pop);
        }
        return sb.reverse().toString();

    }
}
