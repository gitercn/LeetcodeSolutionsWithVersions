package com.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1TwoSumV1 {
    // V1 使用暴力法，遍历每个元素i，然后从i+1开始遍历查询与元素i相加等于target的
    // 时间复杂度O(n^2)
    // 空间复杂度O(1)
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] solution = twoSum(nums, target);
        System.out.println(Arrays.toString(solution));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] int1 = new int[2];
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int1[0] = i;
                    int1[1] = j;
//                    return int1;
                    return new int[] {i,j};
                }
            }
        }
//        return int1;
        throw new IllegalArgumentException("No two sum solution");
    }
}
