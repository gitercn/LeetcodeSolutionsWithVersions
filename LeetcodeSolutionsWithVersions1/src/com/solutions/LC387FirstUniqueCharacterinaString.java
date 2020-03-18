package com.solutions;

public class LC387FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String s = "aadadaad";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s){
        int firstUniqIndex = -1;
        for (int i = 0; i < s.length(); i ++){
            if(i == s.indexOf(s.charAt(i)) && i == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
