package com.solutions;

public class LC28ImplementStrStrV1 {
    public static void main(String[] args) {
        // V1 使用暴力法，遍历两遍
        // 时间复杂度O(n^2)
        // 空间复杂度O(1)
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length() <= 0){
            return 0;
        }
        for (int i = 0; i < haystack.length(); i ++){
            if (haystack.charAt(i) == needle.charAt(0)){
                boolean same = true;
                for (int j = 0; j < needle.length(); j ++){

                    if (haystack.charAt(i + j) != needle.charAt(j)){
                        same = false;
                        break;
                    }
                }
                if (same == true){
                    return i;
                }
            }
        }
        return -1;
    }
}
