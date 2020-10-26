package com.array;

public class ShuJinXin383 {
    public static void main(String[] args) {
        boolean flag = canConstruct("aab", "aab");
        System.out.println(flag);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] caps = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            caps[c - 97] = caps[c - 97] + 1;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            caps[c - 97] = caps[c - 97] - 1;
            if (caps[c - 97] < 0) {
                return false;
            }
        }
        return true;
    }
}
