package com.array;

//给定 nums = [0,0,1,1,1,2,2,3,3,4],
//
//        函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
//
public class RemoveDuplicateElement {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);

    }

    public static int removeDuplicates(int[] nums) {
        if(nums==null){
            return -1;
        }
        
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] == nums[j]){
                nums[i] = nums[j];
            }else{
                nums[++i] = nums[j];
            }
        }
        return nums.length;
        
        
    }
}
