package com.solutions;

import java.math.BigInteger;
import java.util.LinkedList;

public class LC2AddTwoNumbersV2 {
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
        ListNode dummyl1 = l1;
        ListNode dummyl2 = l2;
//        dummyl1.next = l1;
//        dummyl2.next = l2;
        int carry = 0;

        ListNode dummyForReturn = new ListNode(-1);
        ListNode curr = dummyForReturn;
        while (dummyl1 != null || dummyl2 != null){
            if (dummyl1 == null){}

            int x = dummyl1 != null ? dummyl1.val : 0;
//            int y = dummyl2 = null ? 0 : dummyl1.val; ?三元表达式
            int y = dummyl2 != null ? dummyl2.val : 0;
            int sum = x + y + carry;
            carry = sum/10;
            int currentVal = sum%10;
            curr.next = new ListNode(currentVal);
            curr = curr.next;
            dummyl1 = dummyl1.next;
            dummyl2 = dummyl2.next;
        }
        return dummyForReturn.next;
    }
}
