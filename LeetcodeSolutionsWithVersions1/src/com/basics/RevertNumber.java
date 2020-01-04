package com.basics;

public class RevertNumber {
    public static void main(String[] args){
        // 翻转一个数比如从 123 to 321
        // java int MIN_VALUE=-2147483648 (-2^31) MAX_VALUE=2147483647 (2^31-1)
//        int num = 1534236469;
        int num = 8;
        int revertedInt = RevertNumberInt1(num);
        System.out.println(revertedInt);

        long revertedLong = RevertNumberLong1(num);
        System.out.println(revertedLong);


    }

    public  static int RevertNumberInt1(int num) {
        int i = 0;
        int reverted = 0;
        while(num/Math.pow(10, i) > 1 || num/Math.pow(10, i) < -1){
//            System.out.println(num/Math.pow(10,i));
//            (int) (num/Math.pow(10,i)%10) 是这个数的当前位
//            System.out.println((int) (num/Math.pow(10,i)%10));
            reverted = reverted*10 + (int) (num/Math.pow(10,i)%10);
//            System.out.println(reverted);
            i ++ ;
        }

        return reverted;
    }

    public  static long RevertNumberLong1(long num) {
//        if ((num > 0 && num/10 < 1) || (num < 0 && num/10 > -1)){
//            return num;
//        }

        int i = 0;
        long reverted = 0;
        while(num/Math.pow(10, i) > 1 || num/Math.pow(10, i) < -1){
//            System.out.println(num/Math.pow(10,i));
//            (int) (num/Math.pow(10,i)%10) 是这个数的当前位
//            System.out.println((int) (num/Math.pow(10,i)%10));
            reverted = reverted*10 + (int) (num/Math.pow(10,i)%10);
//            System.out.println(reverted);
            i ++ ;
        }

        return reverted;
    }


}
