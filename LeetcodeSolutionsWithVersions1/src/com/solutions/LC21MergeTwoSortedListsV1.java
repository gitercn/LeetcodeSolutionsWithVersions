package com.solutions;

public class LC21MergeTwoSortedListsV1 {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);

        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(7);
//        l2.next.next = new ListNode(8);

        ListNode merged = mergeTwoLists(l1, l2);

        while(merged != null){
            System.out.println(merged.val);
            merged = merged.next;
        }


    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 非递归方法

        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        ListNode merged = null;
        ListNode mergedForReturn = null;
        while (!(l1 == null && l2 == null)) {
            if (l1.val < l2.val) {
                if (merged == null) {
                    merged = new ListNode(l1.val);
                    mergedForReturn = merged;
                } else {
                    merged.next = new ListNode(l1.val);
                    merged = merged.next;
                }

                if (l1 != null) {
                    l1 = l1.next;
                } else {

                }

            } else {
                if (merged == null) {
                    merged = new ListNode(l2.val);
                    mergedForReturn = merged;
                } else {
                    merged.next = new ListNode(l2.val);
                    merged = merged.next;
                }

                if (l2 != null) {
                    l2 = l2.next;
                } else {

                }
            }

            if(l1 == null){
//                while(l2 != null){
//                    merged.next = new ListNode(l2.val);
//                    merged = merged.next;
//                    l2 = l2.next;
//                }
                merged.next = l2;
                l2 = null;
            }

            if(l2 == null){
//                while(l1 != null){
//                    merged.next = new ListNode(l1.val);
//                    merged = merged.next;
//                    l1 = l1.next;
//                }
                merged.next = l1;
                l1 = null;
            }

        }

        return mergedForReturn;
    }
}
