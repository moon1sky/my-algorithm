package com.strings;

public class ReverseStringsII541 {

    public static void main(String[] args) {
        int k = 2;
        String s = "abcdefg";
        String newStr = reverseStr(s, k);
        System.out.println(newStr);

    }

    public static String reverseStr(String s, int k) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        if (k <= 1) {
            return s;
        }

        char[] chars = s.toCharArray();

        int start = 0;
        int end = k - 1;
        end = end >= (chars.length-1) ? (chars.length-1) : end;
        StringBuffer sb = new StringBuffer();
        int page = chars.length / k + ((chars.length % k) == 0 ? 0 : 1);
        for (int i = 0; i < page; i++) {
            if (start / k % 2 == 0) {
                reverseStr0(chars, sb, start, end);
            } else {
                appendStr0(chars, sb, start, end);
            }
            start += k;
            end += k;
            end = end >= (chars.length-1) ? (chars.length-1) : end;
        }

        return sb.toString();
    }

    private static void reverseStr0(char[] chars, StringBuffer sb, int start, int end) {
        for (int i = end; i >= start; i--) {
            sb.append(chars[i]);
        }
    }
    private static void appendStr0(char[] chars, StringBuffer sb, int start, int end) {
        for (int i = start; i <= end; i++) {
            sb.append(chars[i]);
        }
    }

}
