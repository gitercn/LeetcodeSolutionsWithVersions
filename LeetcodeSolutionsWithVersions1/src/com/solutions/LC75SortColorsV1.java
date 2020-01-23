package com.solutions;

public class LC75SortColorsV1 {
    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        // {2,0,2,1,1,0} i = 0, j = 0
        // {0,2,2,1,1,0} i = 0, j = 1
        // {0,2,2,1,1,0} i = 0, j = 2
        // {0,2,1,2,1,0} i = 0, j = 3
        // {0,2,1,1,2,0} i = 0, j = 4
        // {0,2,1,1,0,2} i = 0, j = 5
        // {2,0,2,1,1,0} i = 0, j = 0
        // {0,2,2,1,1,0} i = 0, j = 1
        // {2,0,2,1,1,0} i = 0, j = 0
        // {0,2,2,1,1,0} i = 0, j = 1
        // {2,0,2,1,1,0} i = 0, j = 0
        // {0,2,2,1,1,0} i = 0, j = 1
        sortColors(nums);
        System.out.println(nums);

    }

    public static void sortColors(int[] nums) {
        if (nums.length <= 0) {
            return;
        }

        for (int i = 0; i < nums.length; i ++) {
            for (int j = 0; j + 1 < nums.length; j ++){
                if(nums[j] >= nums[j + 1]){
                    int tempForExchange = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tempForExchange;
                }
            }
        }


    }
}
