package com.array;

public class CircleArray59 {
    public static void main(String[] args) {
        int num = 4;
        int[][] ints = generateMatrix(num);

        printArr(ints);

        int[][] ints1 = generateMatrix2(num);
        printArr(ints1);


    }

    private static void printArr(int[][] ints) {
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * 1  2  3  4
     * 12 13 14 5
     * 11 16 15 6
     * 10 9  8  7
     *
     * @param n
     */
    public static int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while (num <= tar) {
            for (int i = l; i <= r; i++) {
                mat[t][i] = num++; // left to right.
            }
            t++;
            for (int i = t; i <= b; i++) {
                mat[i][r] = num++; // top to bottom.
            }
            r--;
            for (int i = r; i >= l; i--) {
                mat[b][i] = num++; // right to left.
            }
            b--;
            for (int i = b; i >= t; i--) {
                mat[i][l] = num++; // bottom to top.
            }
            l++;
        }
        return mat;
    }


    public static int[][] generateMatrix2(int n) {
        int[][] arr = new int[n][n];
        int totalNum = n * n;
        int init = 1;

        int l = 0, t = 0, r = n - 1, b = n - 1;
        while (init <= totalNum) {
            for (int i = l; i <= r; i++) {
                arr[t][i] = init++;
            }
            t++;

            for (int i = t; i <= b; i++) {
                arr[i][r] = init++;
            }
            r--;

            for (int i = r; i >= l; i--) {
                arr[b][i] = init++;
            }
            b--;

            for (int i = b; i >= t; i--) {
                arr[i][l] = init++;
            }
            l++;
        }
        return arr;

    }

}
