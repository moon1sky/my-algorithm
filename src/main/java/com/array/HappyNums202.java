package com.array;

import java.util.HashSet;
import java.util.Set;

public class HappyNums202 {

    public static void main(String[] args) {
        int num = 2;
        boolean flag = isHappy(num);
        System.out.println(flag);

    }

    private static boolean isHappy(int num) {
        int max = 0;
        return isHappy0(num,max);
    }

    private static boolean isHappy0(int num, int max) {
        String ss = (num + "");
        int total = 0;
        for (int i = 0; i < ss.length(); i++) {
            int no = Integer.parseInt(ss.charAt(i) + "");
            total += Math.pow(no,2);
            if(max++>=30){
                return false;
            }
        }
        if(total==1){
            return true;
        }
        return isHappy0(total,max);
    }


}
