package com.array;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        removeElement(nums,3);

    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
