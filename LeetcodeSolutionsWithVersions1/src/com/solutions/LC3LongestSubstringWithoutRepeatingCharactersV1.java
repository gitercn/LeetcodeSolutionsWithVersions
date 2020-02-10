package com.solutions;

public class LC3LongestSubstringWithoutRepeatingCharactersV1 {
    // V1 第一版，用while获取每一位，用BigInteger求和，再取出来
    // 时间复杂度O(n)
    // 空间复杂度O(n)
    public static void main(String[] args) {
        String s1 = null;
//        String s2 = new String(null);
        String s = "abcabcbb";
        int solution = lengthOfLongestSubstring(s);
        System.out.println(solution);
    }



    public static int lengthOfLongestSubstring(String s) {
        int longest = 1;
        if (s.length() == 0)
            return 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = 1;
            for (int j = i + 1; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                char charj = sub.charAt(j - i);
                if (sub.indexOf(charj) == sub.lastIndexOf(charj)){
                    curr ++;
                    if (curr > longest){
                        longest = curr;
                    }
                } else {
                    break;
                }
            }
        }
        return longest;
    }
}
