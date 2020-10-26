package com.array;

public class JiOuSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 4};
        int[] ints = sortArrayByParity(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    private static int[] sortArrayByParity(int[] arr) {
        if(arr==null || arr.length==1){
            return arr;
        }

        int[] newArray = new int[arr.length];

        int a = 0;
        int b = arr.length - 1;
        for (int num : arr) {
            if (num % 2 == 0) {
                newArray[a] = num;
                a++;
            } else {
                newArray[b] = num;
                b--;
            }
        }
        return newArray;

    }




}
