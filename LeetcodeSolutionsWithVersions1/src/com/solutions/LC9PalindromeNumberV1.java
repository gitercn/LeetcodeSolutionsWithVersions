package com.solutions;

public class LC9PalindromeNumberV1 {
    public static void main(String[] args){
        int x = 10;
            if (x < 0){
//                return false;
                System.out.println(false);

            }

            int length = getNumberLength((long) x);
            for (int i = 0; i < length/2; i++){
                int back = x/(int) (Math.pow(10, i))%10;
                int front = x/(int) (Math.pow(10, length - i - 1))%10;
                System.out.println("front"+front + "back" + back);
                if (front != back){
//                    return false;
                    System.out.println(false);
                }
            }
//            return true;



    }

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
}
