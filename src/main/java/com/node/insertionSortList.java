package com.node;

public class insertionSortList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(8);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(1);
        ListNode node8 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        System.out.println(node1);


        ListNode listNode = insertionSortList(node1);
        System.out.println(listNode);

    }

//    1->3->5->2->4->7
//
//    1->2->3->5->4->7

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (pre.val <= cur.val) {
                pre = cur;
                cur = cur.next;
            } else {
                ListNode temp = dummy;
                while (temp.next != null && cur.val > temp.next.val) {
                    temp = temp.next;
                }
                ListNode curNext = cur.next;
                pre.next = curNext;
                cur.next = temp.next;
                temp.next = cur;
                cur = pre.next;
            }
        }
        return dummy.next;
    }

}
