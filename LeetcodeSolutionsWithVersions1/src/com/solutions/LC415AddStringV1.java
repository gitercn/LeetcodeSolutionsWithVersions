package com.solutions;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class LC415AddStringV1 {
    public static void main(String[] args){
        String num1 = "12345";
        String num2 = "2078999";

        StringBuilder addedNum = new StringBuilder();
        int minLength = min(num1.length(), num2.length());
        int maxLength = max(num1.length(), num2.length());

        boolean bigerThanTen = false;
        for(int i = 0; i < maxLength; i ++){

//            System.out.println(num1.charAt(num1.length() - i - 1));
//            System.out.println(num2.charAt(num2.length() - i - 1));

            char charNum1;
            char charNum2;
            if(num1.length() - i - 1 >= 0){
                charNum1 = num1.charAt(num1.length() - i - 1);
            } else {
                charNum1 = '0';
            }

            if(num2.length() - i - 1 >= 0){
                charNum2 = num2.charAt(num2.length() - i - 1);
            } else {
                charNum2 = '0';
            }

            int addedDigit = Character.getNumericValue(charNum1) + Character.getNumericValue(charNum2);
            if(bigerThanTen){
                addedDigit = addedDigit + 1;
            }
            System.out.println(addedDigit/10);
            if((addedDigit/10) >= 1){
                addedNum.append((int)(addedDigit%10));
                bigerThanTen = true;

            } else {
                addedNum.append((int)(addedDigit));
                bigerThanTen = false;
            }
            System.out.println(addedNum);




        }

        if (bigerThanTen) {
            addedNum.append("1");
        }

        StringBuffer addedNumSBF = new StringBuffer(addedNum.toString());
        System.out.println(addedNumSBF.reverse());
    }
}
