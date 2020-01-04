package com.solutions;

public class LC7ReverseIntegerV2 {
    // V2 使用计算的方法
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
        int x2 = 1534236469; // Overflow
        System.out.println(reverse(x2));
    }


    public static int reverse(int x) {
        long num = x;
        int i = 0;
        long reverted = 0;
        while(num/Math.pow(10, i) >= 1 || num/Math.pow(10, i) <= -1){
//            System.out.println(num/Math.pow(10,i));
//            (int) (num/Math.pow(10,i)%10) 是这个数的当前位
//            System.out.println((int) (num/Math.pow(10,i)%10));
            reverted = reverted*10 + (int) (num/Math.pow(10,i)%10);
//            System.out.println(reverted);
            i ++ ;
        }

        if ((int) reverted == reverted){
            return (int) reverted;
        }

        return 0;


    }
}
