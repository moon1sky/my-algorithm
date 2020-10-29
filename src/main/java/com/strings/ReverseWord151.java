package com.strings;

public class ReverseWord151 {
    public static void main(String[] args) {
        String s = "  hello world!  ";
        String s1 = reverseWords(s);
        System.out.println(s1);


    }


    public static String reverseWords(String s) {
        //1.移除多余的空格
        s = removeMoreSpace(s);
        System.out.println(s);
        //反转字符串
        char[] chars = s.toCharArray();
        return new String(ReverStrings344.reverseString(chars));
    }

    private static String removeMoreSpace(String s) {
        char[] chars = s.toCharArray();
        char pre = chars[0];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(i==chars.length-1 && c==' '){
                continue;
            }
            if (pre == ' ' && c == ' ') {
                continue;
            }
            pre = c;
            sb.append(c);
        }
        return sb.toString();
    }
}
