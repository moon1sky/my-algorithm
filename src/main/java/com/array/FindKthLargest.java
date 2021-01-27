package com.array;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int ints = findKthLargest(nums, k);
        System.out.println(ints);
    }

    public static int findKthLargest(int[] nums, int k) {
        final int temp = k;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (temp > nums.length / 2) {
                    return o2 - o1;
                } else {
                    return o1 - o2;
                }
            }
        });

        if (k > nums.length / 2) {
            k = nums.length + 1 - k;
        }

        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int result = queue.poll();
        return result;


    }


}
