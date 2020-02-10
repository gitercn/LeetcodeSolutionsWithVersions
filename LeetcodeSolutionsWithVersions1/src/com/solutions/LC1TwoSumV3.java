package com.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1TwoSumV3 {
    // V3 使用一遍哈希表
    // 时间复杂度O(n)
    // 空间复杂度O(n)
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 7, 15};
        int target = 9;
        int[] solution = twoSum(nums, target);
        System.out.println(Arrays.toString(solution));
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++){
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[] { map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
