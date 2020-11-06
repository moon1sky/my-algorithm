package com.hash;


/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 left 和 j，使得 nums [left] = nums [j]，并且 left 和 j 的差的 绝对值 至多为 k。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindDuplicate219 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean b = containsNearbyDuplicate(nums, 3);
        System.out.println(b);

        boolean c = containsNearbyAlmostDuplicate(nums, 3,0);
        System.out.println(c);


//        testStr();
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 1 || k <= 0) {
            return false;
        }

        for (int left = 0; left < nums.length - 1; left++) {
            int right = (k + left) >= nums.length ? (nums.length - 1) : (k + left);
            while (left < right && right < nums.length) {
                if (nums[left] == nums[right]) {
                    return true;
                }
                right--;
            }
        }

        return false;
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length < 1 || k <= 0) {
            return false;
        }

        for (int left = 0; left < nums.length - 1; left++) {
            int right = (k + left) >= nums.length ? (nums.length - 1) : (k + left);
            while (left < right && right < nums.length) {
                if ((nums[left] - nums[right]) <= t || (nums[right] - nums[left]) <= t) {
                    return true;
                }
                right--;
            }
        }

        return false;
    }

    /**
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     */


    private static void testStr() {
        String str1 = "计算机";
        String str2 = "计算机";
        System.out.println("str1==str2:" + (str1 == str2));//true

        String str3 = new String("计算机");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=============");


        System.out.println("str1==str3:" + (str1 == str3));
        System.out.println("str1==str3.intern():" + (str1 == str3.intern()));
        System.out.println("str2==str3.intern():" + (str2 == str3.intern()));

        String str4 = new String("计算机");
        System.out.println("str3==str4:" + (str3 == str4));
        System.out.println("str3.intern()==str4.intern():" + (str3.intern() == str4.intern()));


        String str5 = new StringBuilder("软件").append("工程").toString();
        System.out.println("str5.intern() == str5:" + (str5.intern() == str5));

        String str6 = new String(new StringBuilder("物联网").append("工程").toString());
        System.out.println("str6.intern() == str6:" + (str6.intern() == str6));

        String str7 = new String("物联网");
        System.out.println("str7.intern() == str7:" + (str7.intern() == str7));
    }
}
