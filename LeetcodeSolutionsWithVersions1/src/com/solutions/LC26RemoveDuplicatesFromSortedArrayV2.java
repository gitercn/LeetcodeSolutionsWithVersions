package com.solutions;

public class LC26RemoveDuplicatesFromSortedArrayV2 {
    public static void main(String[] args) {

        int[] nums = {0, 1, 1, 2, 2, 3, 4, 4, 4, 4};
        // {0, 1, 1, 2, 2, 3, 4, 4, 4, 4};
        // {0, 1, 2, 2, 3, 4, 4, 4, 4, 4};
        // {0, 1, 2, 3, 4, 4, 4, 4, 4, 4};
        // {0, 1, 2, 3, 4, 4, 4, 4, 4, 4};
        int length = removeDuplicates(nums);
        System.out.println(length);

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }

        int slowPointer = 0;
        int fastPointer = 0;

        for (fastPointer = 0; fastPointer < nums.length; fastPointer ++){
            if (nums[fastPointer] == nums[slowPointer]) {

            } else {
                slowPointer = slowPointer + 1;
                nums[slowPointer] = nums[fastPointer];
            }
        }

        return slowPointer + 1;
    }
}
