package com.array;

import java.util.HashSet;
import java.util.Set;

public class TwoArraysCommonElement349 {
    public static void main(String[] args) {
        int[] num1 = {11, 22, 3, 4, 56, 6, 7};
        int[] num12 = {123, 3};

        int[] ss = getCommoneElements(num1, num12);

    }

    private static int[] getCommoneElements(int[] num1, int[] num12) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : num1) {
            set.add(i);
        }

        Set<Integer> set2 = new HashSet<Integer>();
        for (int i : num12) {
            if(set.contains(i)){
                set2.add(i);
            }
        }
        Object[] objects = set2.toArray();
        System.out.println(set2);
        return null;

    }



}
