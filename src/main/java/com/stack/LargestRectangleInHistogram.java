package com.stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        Solution solution = new LargestRectangleInHistogram().new Solution();
        int[] nums = {0, 9};
        int result = solution.largestRectangleArea(nums);
        System.out.println(result);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int largestRectangleArea(int[] heights) {
//            return this.暴力破解(heights);
            return this.一次循环破解(heights);
        }

        private int 一次循环破解(int[] heights) {
            if (heights == null || heights.length == 0) {
                return -1;
            }

            int area = 0;//面积
            int startIndex = 0; //从哪个下标开始
            int maxArea = 0;//最大面积
            int minIndexValue = heights[0];
            for (int i = 0; i < heights.length; i++) {
                int width = i - startIndex + 1;
                minIndexValue = Math.min(minIndexValue,heights[i]);


            }


            return 0;
        }


        private int 暴力破解(int[] heights) {
            if (heights == null) {
                return -1;
            }
            if (heights.length == 1) {
                return heights[0] * 1;
            }

            int area = 0;
            for (int i = 0; i < heights.length; i++) {
                int min = heights[i];
                for (int j = i; j < heights.length;
                     j++) {
                    min = Math.min(min, heights[j]);
                    area = Math.max(area, (min * (j - i + 1)));
                }
            }
            return area;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

