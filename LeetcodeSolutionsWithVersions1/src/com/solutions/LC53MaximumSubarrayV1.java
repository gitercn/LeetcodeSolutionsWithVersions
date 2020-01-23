package com.solutions;

public class LC53MaximumSubarrayV1 {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int i, j;
        for(i = 0; i < nums.length; i++){
            int currentSum = 0;
            for(j = i; j < nums.length; j++){
                currentSum = currentSum + nums[j];
                if(maxSum<=currentSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

}
