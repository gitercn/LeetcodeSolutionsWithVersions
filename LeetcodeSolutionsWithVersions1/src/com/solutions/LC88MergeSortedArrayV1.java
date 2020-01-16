package com.solutions;

public class LC88MergeSortedArrayV1 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] merged = new int[m+n];
        int aindex = 0;
        int bindex = 0;
        int mindex = 0;
        nums1 = merge(nums1, aindex, nums2, bindex, merged, mindex);
        System.out.println(nums1);

    }

    public static int[] merge(int[] a, int aIndex, int[] b, int bIndex, int[] result, int resultIndex){
        if(result.length ==resultIndex){
            return result;
        }
        if(aIndex == a.length){
            result[resultIndex++]=b[bIndex++];
            return merge(a,aIndex,b,bIndex,result,resultIndex);
        }
        if(bIndex == b.length){
            result[resultIndex++]=a[aIndex++];
            return merge(a,aIndex,b,bIndex,result,resultIndex);
        }
        if(a[aIndex] == b[bIndex]){
            result[resultIndex++] = a[aIndex++];
            result[resultIndex++] = b[bIndex++];
        }
        else if (a[aIndex] < b[bIndex]) {
            result[resultIndex++] = a[aIndex++];
        }
        else if (a[aIndex] > b[bIndex]) {
            result[resultIndex++] = b[bIndex++];
        }
        return merge(a,aIndex,b,bIndex,result,resultIndex);

    }
}
