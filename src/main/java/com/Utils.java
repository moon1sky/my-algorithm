package com;

public class Utils {

    public static void printIntArray(int[] nums) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < nums.length; i++) {
            sb = i == (nums.length - 1) ? (sb.append(nums[i] + "")) : (sb.append(nums[i] + ","));
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
