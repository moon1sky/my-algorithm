package com.array;

/**
 * LeetCode167
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */
public class TwoSum4SortArray {
    public static void main(String[] args){
        int[] arr=new int[]{2,4,5,7};//创建一个升序排列的数组
        int num=6;//定义一个目标数
        int[] a=twoSum(arr,num);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] twoSum(int[] numbers, int target){//双指针法
        int i=0;//定义头指针
        int j=numbers.length-1;//定义尾指针
        while(i<numbers.length/2){//头尾指针没有相遇 满足条件 进入循环
            int sum=numbers[i]+numbers[j];//依次对数组两端的数求和
            if(sum==target){
                return new int[]{i+1,j+1};//求得和等于目标数 返回两个下标值
            }else if(sum<target){
                i++;//求得和小于目标数表示头指针需要右移
            }else{
                j--;//求得和大于目标数表示尾指针需要左移
            }
        }
        return null;
    }
}
