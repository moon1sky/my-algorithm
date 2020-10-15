package com.node;

/**
 * 817. 链表组件
 * <p>
 * https://leetcode-cn.com/problems/linked-list-components/
 */
public class ListNodeCompent {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(head);

        int[] G = {2, 3, 4, 6};


        System.out.println(node5);
        ListNode copy5 = node5;
        node5.val = 2;
        System.out.println(copy5);


    }


}
