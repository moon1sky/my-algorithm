package com.stack;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperatures739 {
//1, 1, 4, 2, 1, 1, 0, 0
    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ints = dailyTemperatures(T);
        System.out.println(Arrays.toString(ints));
    }
//    1, 1, 3, 2, 1, 1, 0, 0
    //1, 1, 4, 2, 1, 1, 0, 0
    public static int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        Deque<Integer> deque = new LinkedList();
        for (int i = 0; i < T.length; i++) {
            int ele = T[i];
            while (!deque.isEmpty() && ele >  T[deque.peekLast()]) {
                int stackIndex = deque.removeLast();
                result[stackIndex] = i - stackIndex;
            }
            deque.addLast(i);
        }
        return result;
    }
}
