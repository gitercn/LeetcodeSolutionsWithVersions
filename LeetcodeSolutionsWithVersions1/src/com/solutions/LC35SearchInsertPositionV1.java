package com.solutions;

public class LC35SearchInsertPositionV1 {
    public static void main(String[] args) {
        // 遍历求解
        int[] nums = {1,3,5,6};
        int length = searchInsert(nums, 0);
        System.out.println(length);

    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

}
