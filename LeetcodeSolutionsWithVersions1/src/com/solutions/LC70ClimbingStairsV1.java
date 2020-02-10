package com.solutions;

public class LC70ClimbingStairsV1 {

    public static void main(String[] args) {
        int n = 46;
        System.out.println(climbStairs(n));

    }

    public static int climbStairs(int n) {
        int methodsSum = 0;
        int step = 0;
        return climb_Stairs(0, n);

    }

    private static int climb_Stairs(int i, int n) {
        if(i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        int sum =climb_Stairs(i+1,n)+climb_Stairs(i+2,n);
        return sum;

    }

}
