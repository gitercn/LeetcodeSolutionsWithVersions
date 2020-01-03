package com.solutions;

import java.util.HashMap;
import java.util.Map;

public class LC169MajorityElementV1 {
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(nums);
        System.out.println(nums.length);
        int n = nums.length;

        int count = 0;
        Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++) {
        	System.out.println(nums[i]);
            if(intMap.containsKey(nums[i])){
                count = intMap.get(nums[i]);
                count ++;
                intMap.put(nums[i], count);
            } else {
                count = 1;
                intMap.put(nums[i], count);
            }
        }


        for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {

            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

            if(entry.getValue()>(n/2)){
//                return entry;
                System.out.println(entry.getValue());
            }

        }

    }
}
