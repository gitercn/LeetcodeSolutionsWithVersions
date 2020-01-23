package com.solutions;

public class LC26RemoveDuplicatesFromSortedArrayV1 {
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
        int rindex = nums.length;
        int replaceStartIndex = 0;
        int replacingIndex = 0;
        int previousNum = nums[0];
        int replacedNum = nums[0];
        int j = 0;
        int replacementHappenedCount = 0;

        for ( ; ; ) {
            boolean replacementHappened = false;
            int previousReplacedIndex = replacingIndex;

            for (int i = 0; i < nums.length; i ++){
                int previousReplaceStartIndex = 0;
                if (nums[i] == previousNum && i != 0 ) {
                    replacedNum = nums[i - 1];
                    // 把每个往前移，一直移到最后一个
                    for(int k = i; k < nums.length; k ++){
                        nums[k - 1] = nums[k];
                    }
                    replacingIndex = i;
                    rindex = rindex - 1;
                    replacementHappened = true;
                } else {
                    previousNum = nums[i];
                }
                // 在一个循环当中如果发生移动，则把最后一个设为0
                if (replacementHappened){
                    nums[nums.length - replacementHappenedCount - 1] = 0;
                    replacementHappenedCount ++;

                }

            }

            if (previousReplacedIndex == replacingIndex && !replacementHappened && replacedNum == nums[replacingIndex]){
                break;
            }
            j ++;
        }

        return nums.length - replacementHappenedCount;

    }
}
