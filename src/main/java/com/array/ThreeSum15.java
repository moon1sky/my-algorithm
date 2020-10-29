package com.array;

import java.util.*;

public class ThreeSum15 {
    public static void main(String[] args) {
//        int[] nums = {-4, -1, -1, 0, 1, 2};
//        int[] nums = {0, 0, 0, 0, 0};
//        int[] nums = {0, 0, 0, 0};
        int[] nums = {-4,-1,-1,0,0,1,2,3,4};
//        int[] nums = {-2, 0, 0, 2, 2};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length <= 2) {
            return lists;
        }
        Arrays.sort(nums);


        int target = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            if (a > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                int left = nums[j];
                int k = nums.length - 1;
                while (j < k) {
                    int right = nums[k];
                    if (left + right + a == target) {
                        if (lists.size() > 0 && nums[j] == nums[j - 1]) {
                            k--;
                            continue;
                        }
                        if (k < nums.length - 1 && lists.size() > 0 && nums[k] == nums[k + 1]) {
                            k--;
                            continue;
                        }
                        List<Integer> integerList = new ArrayList<>();
                        integerList.add(a);
                        integerList.add(left);
                        integerList.add(right);
                        lists.add(integerList);
                    }
                    k--;
                }
            }
        }
        return lists;
    }

}
