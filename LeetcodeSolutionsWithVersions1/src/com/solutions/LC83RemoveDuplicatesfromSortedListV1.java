package com.solutions;

public class LC83RemoveDuplicatesfromSortedListV1 {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(7);
//        l2.next.next = new ListNode(8);

        ListNode merged = deleteDuplicates(l1);

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

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }

        int previousVal = -1;
        ListNode previousListNode = head;
        ListNode l1 = previousListNode;
        while(head != null){
            if(previousVal == head.val){
                previousListNode.next = head.next;
            }
            if (previousVal == head.val){

            } else {
                previousVal = head.val;
                previousListNode = head;
            }
            head = head.next;

        }

        return l1;
    }
}
