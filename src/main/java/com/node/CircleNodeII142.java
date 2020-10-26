package com.node;

public class CircleNodeII142 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;

        findFirstCircleNode(node1);
    }

    private static ListNode findFirstCircleNode(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(slow!=fast){
            if(fast==null || fast.next==null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }
}
