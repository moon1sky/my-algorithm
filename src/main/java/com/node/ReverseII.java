package com.node;

public class ReverseII {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        System.out.println(node1);

        ListNode listNode = reverseBetween(node1, 2, 4);
        System.out.println(listNode);
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode pre = temp;
        while (m>1) {
            m--;
            pre = head;
            head = head.next;
        }
        pre.next = null;

        pre.next = reverseList(head, n-m+1);
        return temp.next;
    }

    public static ListNode reverseList(ListNode head,int index) {
        ListNode prev = null;
        ListNode curr = head;
        while (index>1) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
            index--;
        }
        head.next = curr;
        return prev;
    }
}
