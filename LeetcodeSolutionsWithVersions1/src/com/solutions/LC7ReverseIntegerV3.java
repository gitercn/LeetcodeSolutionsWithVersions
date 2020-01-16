package com.solutions;

public class LC7ReverseIntegerV3 {
    // V2 使用计算的方法
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
        int x2 = 1534236469; // Overflow
        System.out.println(reverse(x2));
    }


    public static int reverse(int x) {
        int num = x;
//        int i = 0;
        int reverted = 0;
        while(x != 0){
            int pop = x%10;
            x = x/10;
            if(reverted > Integer.MAX_VALUE/10 || (reverted == Integer.MAX_VALUE/10 && pop > 7)){
                return 0;
            }
            if(reverted < Integer.MIN_VALUE/10 || (reverted == Integer.MIN_VALUE/10 && pop < -8)){
                return 0;
            }

            reverted = reverted*10 + pop;

        }

        return reverted;

//        System.out.println(reverted);

//        if ((int) reverted == reverted){
//            return (int) reverted;
//        }

//        return 0;


    }
}
