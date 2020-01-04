package com.basics;

public class GetNumLength {
    public static void main(String[] args){
        int numInt = 123;
        numInt = -2147483648;
//      java int MIN_VALUE=-2147483648 (-2^31) MAX_VALUE=2147483647 (2^31-1)
        int numIntLength = getNumberLengthInt1(numInt);
        System.out.println(numIntLength);


        long numLong = 123321;
        numLong = -9223372036854775808L;
//        num = 0;
//        num = -123321;
        // java long MIN_VALUE=-9223372036854775808 (-2^63) MAX_VALUE=9223372036854775807 (2^64-1) and the length is 19
        System.out.println(numLong/10);
        int numLongLength = getNumberLengthLong3(numLong);
        System.out.println(numLongLength);
        // https://blog.csdn.net/Mingyueyixi/article/details/54313665
    }

    public static int getNumberLengthInt1(int num) {

        if(num == Integer.MIN_VALUE){
            return 10;
        }
        num = num > 0? num: -num;

        if(num == 0){
            return 0;
        }
        return (int) (Math.log10(num) + 1);
    }


    // The first method is use Math.log10() to get the length (推荐)
    public static int getNumberLengthLong1(long num) {

    	if(num == Long.MIN_VALUE){
            return 19;
        }
        num = num > 0? num: -num;
    	
        if(num == 0){
            return 0;
        }
        return (int) (Math.log10(num) + 1);
    }

    // The second method is use String.valueOf().length() to get the length
    public static int getNumberLengthLong2(long num){
        if(num == Long.MIN_VALUE){
            return 19;
        }
        num = num > 0? num: -num;
        return String.valueOf(num).length();
    }

    // The third method is use to use for loop to divid it with 10 to get the length
    public static int getNumberLengthLong3(long num){
        if(num == 0){
            return 1;
        }
        int length = 0;
        for(long temp = num; temp != 0; temp = temp/10){
            length ++;
        }
        return length;

    }
}
