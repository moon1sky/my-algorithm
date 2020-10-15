package com.array;

import java.util.*;

/**
 * LeetCode169
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * 示例 1:
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class FindDuplicateNum {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 3, 1, 3, 3, 1, 1, 2, 2, 2, 2, 3, 3, 3};
//        finDuplicateNum(arr);


        int i = finDuplicateNum2(arr);
        System.out.println(i);
        System.out.println(arr.length);

        int i1 = finDuplicateNum3(arr);
        System.out.println(i1);

    }


    private static void finDuplicateNum(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set set = new HashSet();
        for (int i : arr) {
            Integer num = map.get(i) == null ? 0 : map.get(i);
            map.put(i, ++num);
            if (num >= arr.length / 2) {
                set.add(i);
            }
        }
        System.out.println(set);
    }

    private static int finDuplicateNum2(int[] nums) {
        int maj = nums[0];//将数组第一个数存入变量 用于与后面数字比较
        int count = 1;//设置一个计数器
        for (int i = 1; i < nums.length; i++) {//从数组第二个数开始遍历数组
            if (nums[i] == maj) {
                count++;//与第一个数相同 次数加一
            } else {
                count--;//与第一个数不同 次数减一
                if (count == 0) {
                    maj = nums[i];//次数为零  换个数继续比较
                    count = 1;
                }
            }
        }
        return maj;
    }

    private static int finDuplicateNum3(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
