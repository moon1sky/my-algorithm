package com.strings;

public class ReverStrings344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};


        char[] chars = reverseString(s);
        for (char aChar : chars) {
            System.out.print(aChar+" ");
        }
    }

    public static char[] reverseString(char[] s) {
        if(s==null || s.length<=1){
            return s;
        }
        for(int i=0,j=s.length-1;i<s.length/2;i++,j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return s;
    }
}
