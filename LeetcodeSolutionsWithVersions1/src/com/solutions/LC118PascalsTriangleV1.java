package com.solutions;

import java.util.Arrays;

public class LC118PascalsTriangleV1 {
    public static void main(String[] args) {
        // 如果数组长度大于k就新建一个数组用整体移位法，如果小于k就用
        int numRows = 3;
        int[] nums = {1,2,3,0,0,0};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        if (nums.length <= 1){
            return;
        }

        if (k/(nums.length * 2) > 1){
            k = k%(k/(nums.length * 2));
        }

        if (nums.length > k){
            int[] lastNumsK = new int[nums.length];
            for (int i = 0; i < k; i ++) {
                lastNumsK[i] = nums[nums.length - k + i];
            }

            for (int j = 0; j < nums.length - k; j ++){
                lastNumsK[j + k] = nums[j];
            }

            for (int j = 0; j < nums.length; j ++){
                nums[j] = lastNumsK[j];
            }
        } else {
            for (int i = 0; i < k; i ++){
                int lastOfNums = nums[nums.length - 1];
                for (int j = 0; j < nums.length - 1; j ++){
                    nums[nums.length - j - 1] = nums[nums.length - j - 2];
                }
                nums[0] = lastOfNums;
            }
        }


    }
}
