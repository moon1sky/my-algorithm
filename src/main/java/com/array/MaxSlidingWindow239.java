package com.array;

import com.queue.MyDeque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow239 {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ints = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        MyDeque myDeque = new MyDeque();

        for (int i = 0; i < k; i++) {
            myDeque.push(nums[i]);
        }
        result[0] = myDeque.max;
        for (int i = 0; i < nums.length - k; i++) {
            myDeque.pop(nums[i]);
            myDeque.push(nums[i + k]);
            result[i + 1] = myDeque.max;
        }
        return result;
    }


    static class MyDeque {

        private int max = 0;

        private Deque<Integer> deque = new LinkedList<>();

        public void push(int num) {
            if (deque.isEmpty()) {
                deque.push(num);
                max = num;
                return;
            }
            /**如果push的元素，比最小的元素小，那么push进去，如果比最小的大，则剔除，直到小或者等于最小的元素 */
            Integer last = deque.peekLast();
            while (num > last) {
                deque.removeLast();
                if (!deque.isEmpty()) {
                    last = deque.peekLast();
                } else {
                    break;
                }
            }
            deque.addLast(num);
            max = deque.peekFirst();
        }

        //弹出元素
        public void pop(int num) {
            if (!deque.isEmpty() && num == max) {
                deque.removeFirst();
            }
            if (!deque.isEmpty()) {
                max = deque.peekFirst();
            } else {
                max = 0;
            }
        }

        public int peekMax() {
            return max;
        }
    }
}
