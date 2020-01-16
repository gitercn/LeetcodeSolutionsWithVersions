package com.solutions;

public class LC14LongestCommonPrefixV1 {
    public static void main(String[] args) {
        String[] s = {"alower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 2){
            return "";
        }

        // Loop through strs to find the minLength
        int minLength = strs[0].length();
        for (int i = 0; i < strs.length; i++){
            if(minLength > strs[i].length()){
                minLength = strs[i].length();
            }
        }


        int maxCommonLength = 0;
        boolean allCommon = false;
        boolean continuous = false;
        boolean commonExist = false;
        for (int i = 0; i < minLength; i ++){
            for(int j = 0; j < strs.length - 1; j++){
                if(strs[j].charAt(i) == strs[j + 1].charAt(i)){
                    allCommon = true;

                } else {
                    allCommon = false;
//                    continuous = false;
                    break;
                }
            }
            if(allCommon){
                commonExist = true;
                maxCommonLength = i;
//                if(continuous){
//                    maxCommonLength = i;
//                } else {
//                    break;
//                }
            } else {
                break;
            }
        }

        if(commonExist){
            return strs[0].substring(0, maxCommonLength + 1);
        } else {
            return "";
        }


    }
}
