package com.array;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int[][] aee = { {-1},{-1} };
        int num = -2;
        System.out.print(searchMatrix(aee, num));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {//判空：数组为空 或数组长度为0 或数组（二维）内的数组长度为0
            return false;
        }
        int i = 0;//左下角行标
        int j = 0;//左下角列标
        while (i <= matrix.length - 1 && j <= matrix[0].length - 1) {
            if (matrix[i][j] < target) {
                j++;
            } else if (matrix[i][j] > target) {
                i++;
                j--;
            } else {
                return true;//找到目标数
            }
        }
        return false;
    }
}
