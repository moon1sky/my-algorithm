package com.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidBrackets {
    public static void main(String[] args) {
//        String ss = "{[]}";
        String ss = "){";

        boolean valid = isValid(ss);
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        if(s==null || s.length()<=1){
            return false;
        }

        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        Stack<Character> stack = new Stack();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(map.get(c)!=null){
                stack.push(map.get(c));
            }else{
                if(stack.empty() || stack.pop() !=c){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
