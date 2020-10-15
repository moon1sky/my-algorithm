package com.array;

//209. 长度最小的子数组


public class MinSubArrayLen {
    public static void main(String[] args) {
//        int[] nums = {2, 3, 1, 2, 4, 3};
        int[] nums = {1,2,3,4,5};

        int result = minSubArrayLen(11, nums);
        System.out.println(result);


        int[] nums2 = {1, 4, 4};
//        int i = minSubArrayLen2(4, nums2);
        int i = minSubArrayLen2(7, nums);
        System.out.println(i);
    }

    public static int minSubArrayLen2(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int sum = nums[i];
        int newLength = Integer.MAX_VALUE;
        while (i <= j && j < nums.length) {
            if (sum < s) {
                //总和小，j右移
                j++;
                if(j>=nums.length){
                    break;
                }
                sum += nums[j];
            } else if (sum >= s) {
                //总和大，i右移
                if (j - i + 1< newLength) {
                    newLength = j - i + 1;
                }
                sum -= nums[i];
                i++;
            }
        }
        return newLength == Integer.MAX_VALUE ? 0 : newLength;
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= s) {
                    int len = j - i + 1;
                    result = Math.min(result, len);
                    break;
                }
            }
        }


        int ans = Integer.MAX_VALUE;
        ;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= s) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        System.out.println(toString(nums));
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }

    private static String toString(int[] nums) {
        StringBuffer sb = new StringBuffer();
        for (int num : nums) {
            sb.append(num + ", ");
        }
        return sb.toString();
    }
}
