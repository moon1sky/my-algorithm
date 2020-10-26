package com.array;

public class FindEle35 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int num = 2;
        int index = findEle1(arr, num);
        System.out.println(index);

        int index2 = findEle2(arr, num);
        System.out.println(index2);

    }

    private static int findEle1(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num) {
                return i;
            }
        }
        if(arr[arr.length-1]<num){
            return arr.length;
        }
        return 0;
    }

    private static int findEle2(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        int middle = (right - left) / 2;
        while (left <= right) {

            int mid = arr[middle];
            if (mid > num) {
                right = middle - 1;
                middle = (right - left) / 2;
            }
            if (mid < num) {
                left = middle + 1;
                middle = (right - left) / 2 + left;
            }
            if (mid == num) {
                return middle;
            }
        }
        if (left == 0) {
            return 0;
        }
        if (right == arr.length-1) {
            return arr.length;
        }

        return left;
    }
}
