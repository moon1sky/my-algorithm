package com.array;

import com.Utils;

import java.util.*;

public class FindTopKFrequent347 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ints = topKFrequent(nums, k);
        Utils.printIntArray(ints);


    }


    public static int[] topKFrequent(int[] nums, int k) {

        int[] nums3 = useHeap(nums, k);

        return nums3;
    }

    private static int[] useHeap(int[] nums, int k) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (int num : nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            queue.offer(new int[]{entry.getKey(),entry.getValue()});
        }

        int[] result = new int[k];
        while(k-- >0){
            result[k] = queue.poll()[0];
        }

        return result;
    }

}
