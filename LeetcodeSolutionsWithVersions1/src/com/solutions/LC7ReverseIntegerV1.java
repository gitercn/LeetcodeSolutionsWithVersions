package com.solutions;

public class LC7ReverseIntegerV1 {
    // V1 使用字符串方法
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
        int x2 = 1534236469; // Overflow
        System.out.println(reverse(x2));
    }


    public static int reverse(int x) {
        long absx;
        if (x < 0) {
            absx = -(long) x;
            String absxstr = String.valueOf(absx);
            String reverseAbsXStr = new StringBuffer(absxstr).reverse().toString();
            long longReverseAbsXStr = Long.valueOf(reverseAbsXStr).longValue();
            if (longReverseAbsXStr > (Math.pow(2, 31) - 1)) {
                return 0;
            }
            int intReverseAbsXStr = Integer.valueOf(reverseAbsXStr).intValue();
            return -intReverseAbsXStr;
        } else {
            absx = (long) x;
            String absxstr = String.valueOf(absx);
            String reverseAbsXStr = new StringBuffer(absxstr).reverse().toString();
            long longReverseAbsXStr = Long.valueOf(reverseAbsXStr).longValue();
            if (longReverseAbsXStr > (Math.pow(2, 31) - 1)) {
                return 0;
            }
            int intReverseAbsXStr = Integer.valueOf(reverseAbsXStr).intValue();
            return intReverseAbsXStr;
        }


    }
}
