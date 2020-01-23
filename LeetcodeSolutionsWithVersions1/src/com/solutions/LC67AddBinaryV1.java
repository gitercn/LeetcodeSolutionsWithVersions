package com.solutions;

import java.math.BigInteger;

public class LC67AddBinaryV1 {

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));

    }

    public static String addBinary(String a, String b) {
        String longerstr = "";
        String shortter = "";
        longerstr = a.length()>b.length() ?  a :  b;
        shortter = a.length()<=b.length() ?  a :  b;
        int count = 0;
        int carry = 0;
        StringBuilder sb1 = new StringBuilder();
        for(int i=longerstr.length()-1; i>=0; i--){
            int ai = Character.getNumericValue(longerstr.charAt(i));
            int bi = 0;
            if(shortter.length()-count-1>=0){
                bi = Character.getNumericValue(shortter.charAt(shortter.length()-count-1));
            }
            System.out.println(i+"ai"+ai);
            System.out.println("bi"+bi);
            if(ai+bi+carry==3){
                sb1.append("1");
                carry = 1;
                if(i==0){
                    sb1.append("1");
                }
            }
            if(ai+bi+carry==2){

                sb1.append("0");
                if(i==0){
                    sb1.append("1");
                }
                carry = 1;
            }
            if(ai+bi+carry==1||ai+bi+carry==0){
                sb1.append(ai+bi+carry);
                carry=0;
            }
            count ++;

        }
        StringBuffer sf1 = new StringBuffer(sb1.toString());

        return sf1.reverse().toString();
    }

}
