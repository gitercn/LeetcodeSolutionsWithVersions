package com.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC167TwoSumIIInputArrayIsSortedV2 {
    // 模仿Two Sum V3 使用一遍哈希表的同样的算法
    // 时间复杂度O(n) 每个元素最多被访问一次，共有 n 个元素。
    // 空间复杂度O(1) 只是用了两个指针。
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 7, 15};
        int target = 9;
        int[] solution = twoSum(nums, target);
        System.out.println(Arrays.toString(solution));
    }


    public static int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            int sum = nums[low] + nums[high];
            if (sum == target){
                return new int[] {low + 1, high + 1};
            }
            if (sum < target){
                low = low + 1;
            } else {
                high = high - 1;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
