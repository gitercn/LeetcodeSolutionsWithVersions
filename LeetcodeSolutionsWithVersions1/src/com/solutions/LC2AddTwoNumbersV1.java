package com.solutions;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LC2AddTwoNumbersV1 {
    // V1 第一版，用while获取每一位，用BigInteger求和，再取出来
    // 时间复杂度O(n)
    // 空间复杂度O(n)
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode added = addTwoNumbers(l1, l2);

        while(added != null){
            System.out.println(added.val);
            added = added.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long i = 0;

        String number1s = new String();
        while (l1 != null){
            System.out.println(l1.val);
            number1s = String.valueOf(l1.val).concat(number1s);
            l1 = l1.next;
            i++;
            System.out.println(number1s);
        }
        BigInteger number1 = new BigInteger(number1s);

        System.out.println("number1:"+number1);
        long j = 0;

        String number2s = new String();
        while (l2 != null){
            System.out.println(l2.val);
            // if(j == 0){
            //     number2 = number2.add(new BigInteger(String.valueOf(l2.val)));
            // } else {
            //     number2 = new BigInteger(String.valueOf(l2.val).concat(number2.toString()));
            // }
            number2s = String.valueOf(l2.val).concat(number2s);
            // Long l2val = new Double(l2.val*Math.pow(10,j)).longValue();
            // number2 = number2.add(new BigInteger(l2val.toString()));
            l2 = l2.next;
            j++;
            System.out.println(number2s);
        }
        BigInteger number2 = new BigInteger(number2s);


        System.out.println("number2:"+number2);
        BigInteger addedNumber = number1.add(number2);
        System.out.println("addedNumber:"+addedNumber);

        String addedNumberS = new StringBuffer(addedNumber.toString()).reverse().toString();
        // addedNumber = new BigInteger(addedNumberS);

        // addedNumber = 10000000000L;

//         ListNode listNode3 = new ListNode(8);

//         ListNode listNode2 = new ListNode(0);
//         listNode2.next = listNode3;
//         ListNode listNode1 = new ListNode(7);
//         listNode1.next = listNode2;

        int length = 0;
        // if (addedNumber.equals(new BigInteger("0"))){
        //     length = 1;
        // } else {
        //     length = (long) Math.log10(addedNumber) + 1;
        // }

        length = addedNumberS.toString().length();


        LinkedList<ListNode> linkedList = new LinkedList<ListNode>();
        // Long divided = new Double(Math.pow(10, length - 1)).longValue();
        // BigInteger num1 = addedNumber.divide(new BigInteger(divided.toString()));
        // int num1int = new Long(num1).intValue();
        char num1 = addedNumberS.toString().charAt(length - 1);
        System.out.println("num1:"+Character.getNumericValue(num1));
        ListNode listNodeLast = new ListNode(Character.getNumericValue(num1));
        linkedList.add(listNodeLast);
        for(int k = 1; k < length; k ++){
            // Long divided2 = new Double(Math.pow(10, length - k - 1)).longValue();
            // BigInteger numNext = addedNumber.divide(new BigInteger(divided2.toString()));
            // numNext = numNext.divideAndRemainder(new BigInteger("10"))[1];
            char numNext = addedNumberS.toString().charAt(length - k - 1);
            // int numNextInt = new Long(numNext).intValue();
            System.out.println(Character.getNumericValue(numNext));
            ListNode listNodePrevious = new ListNode(Character.getNumericValue(numNext));
            // if(k == 1){
            //     listNodePrevious.next = listNodeLast;
            // }else{
            //     listNodePrevious.next = linkedList.get(k-1);
            // }
            listNodePrevious.next = linkedList.get((int)k-1);
            // listNodeLast = listNodePrevious;
            linkedList.add(listNodePrevious);
        }




        return linkedList.get((int)length-1);
    }
}
