package com.stack;

import java.util.Stack;

public class EvalRPN150 {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int i = evalRPN(tokens);
        System.out.println(i);
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stringStack = new Stack();
        for (String token : tokens) {
            if ("+".equalsIgnoreCase(token) || "-".equalsIgnoreCase(token)
                    || "*".equalsIgnoreCase(token) || "/".equalsIgnoreCase(token)) {
                int num1 = stringStack.pop();
                int num2 = stringStack.pop();
                if ("+".equalsIgnoreCase(token)) {
                    stringStack.push(num2 + num1);
                }
                if ("-".equalsIgnoreCase(token)) {
                    stringStack.push(num2 - num1);
                }
                if ("*".equalsIgnoreCase(token)) {
                    stringStack.push(num2 * num1);
                }
                if ("/".equalsIgnoreCase(token)) {
                    stringStack.push(num2 / num1);
                }
            } else {
                stringStack.push(Integer.valueOf(token));
            }
        }
        return stringStack.pop();
    }


}
