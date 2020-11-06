package com.strings;

public class CountAtoZ {
    public static void main(String[] args) {
        String str = "abcaaaefdabbhg";
        count(str);
    }

    public static void count(String str){
        //创建26个空间大小的数组，存放26个字母
        int[] nums = new int[26];
        for(char i: str.toCharArray()){
            //自动将char i转化成ascall码
            if(i>=97 && i<= 122){
                //利用数组的索引进行存储
                nums[i-97]++;
            }
        }
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                //i加上97并且再转化为char类型就可以显示相应的字符
                char j = (char)(i+97);
                System.out.println( j + "====" + nums[i]);
            }
        }
    }
}
