package com.basics;

public class GetNumLength {
    public static void main(String[] args){
        long num = 123321;
        num = -9223372036854775808L;
//        num = 0;
//        num = -123321;
        // java long MIN_VALUE=-9223372036854775808 (-2^63) MAX_VALUE=9223372036854775807 (2^64-1) and the length is 19
        System.out.println(num/10);
        int numLength = getNumberLength3(num);
        System.out.println(numLength);
        // https://blog.csdn.net/Mingyueyixi/article/details/54313665
    }

    // The first method is use Math.log10() to get the length
    private static int getNumberLength(long num) {

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
    private static int getNumberLength2(long num){
        if(num == Long.MIN_VALUE){
            return 19;
        }
        num = num > 0? num: -num;
        return String.valueOf(num).length();
    }

    // The third method is use to use for loop to divid it with 10 to get the length
    private static int getNumberLength3(long num){
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
