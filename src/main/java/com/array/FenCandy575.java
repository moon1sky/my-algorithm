package com.array;

import java.util.HashSet;
import java.util.Set;

public class FenCandy575 {
    public static void main(String[] args) {

        int[] candies = {1, 1, 2, 2, 3, 3};
        int i = distributeCandies(candies);
        System.out.println(i);

    }

    public static int distributeCandies(int[] candies) {
        Set set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }

        return set.size() > candies.length / 2 ? candies.length / 2 : set.size();

    }
}
