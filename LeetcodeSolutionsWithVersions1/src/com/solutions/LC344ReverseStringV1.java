package com.solutions;

import java.util.Arrays;
/**
 * 从中间开始交换的解法
 * */
public class LC344ReverseStringV1 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {

        for (int i = 0; i < s.length/2; i ++){
            char temp = s[s.length/2 - 1 - i];
            s[s.length/2 - 1 - i] = s[s.length/2 + s.length%2 + i];
            s[s.length/2 + s.length%2 + i] = temp;

        }

    }
}
