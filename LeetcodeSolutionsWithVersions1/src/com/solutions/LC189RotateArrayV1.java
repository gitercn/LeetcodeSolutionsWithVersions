package com.solutions;

import java.util.Arrays;

public class LC189RotateArrayV1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i ++){
            int lastOfNums = nums[nums.length - 1];
            for (int j = 0; j < nums.length - 1; j ++){
                nums[nums.length - j - 1] = nums[nums.length - j - 2];
            }
            nums[0] = lastOfNums;
        }
    }
}
