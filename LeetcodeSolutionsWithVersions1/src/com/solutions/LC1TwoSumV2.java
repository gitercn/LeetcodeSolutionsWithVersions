package com.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1TwoSumV2 {
    // V2 使用两遍哈希表，第一次迭代，把元素的作为key，索引作为value加入map中。第二次迭代查找key对应的value
    // 时间复杂度O(n)
    // 空间复杂度O(n)
    public static void main(String[] args) {
        int[] nums = {2,2,3,4,5};
        int target = 4;
        int[] solution = twoSum(nums, target);
        System.out.println(Arrays.toString(solution));
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i ++){
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[] { i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
