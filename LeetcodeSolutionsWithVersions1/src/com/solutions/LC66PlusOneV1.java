package com.solutions;

import java.math.BigInteger;

public class LC66PlusOneV1 {

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(plusOne(digits));

    }

    public static int[] plusOne(int[] digits) {
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i<digits.length; i++){
            sb1.append(digits[i]);
        }
        BigInteger bi1 = new BigInteger(sb1.toString());
        BigInteger bi2 = new BigInteger("1");
        BigInteger bi3 = bi1.add(bi2);
        String newnumstr = bi3.toString();
        int[] newdigits = new int[newnumstr.length()];
        for(int i = 0; i<newdigits.length; i++){
            newdigits[i] = Character.getNumericValue(newnumstr.charAt(i));
        }
        return newdigits;
    }

}
