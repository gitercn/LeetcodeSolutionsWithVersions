package com.solutions;

public class LC88MergeSortedArrayV2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int num2i = 0; num2i < n; num2i ++){
            for(int num1i = 0; num1i < nums1.length; num1i ++){
                if(nums1[num1i] >= nums2[num2i]){
                    for(int k = nums1.length - 1; k >= num1i; k --){
                        nums1[k] = nums1[k - 1];
                    }
                    nums1[num1i] = nums2[num2i];
                    break;
                } else {
                    if(num1i+1<nums1.length && nums1[num1i + 1] <= nums2[num2i]){
                        continue;
                    }
                    if(nums1[num1i + 1] == 0){
                        nums1[num1i + 1] = nums2[num2i];
                    } else {
                        for(int k = nums1.length - 1; k >= num1i; k --){
                            nums1[k] = nums1[k - 1];
                        }
                        nums1[num1i] = nums2[num2i];
                        break;
                    }

                }
            }
        }
    }
}
