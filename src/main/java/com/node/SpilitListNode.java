package com.node;

/*
86. 分隔链表
https://leetcode-cn.com/problems/partition-list/
 */
public class SpilitListNode {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);
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

        ListNode partition = partition(node1, 3);
        System.out.println(partition);
        ListNode listNode = spilitNode(node1, 3);
        System.out.println(listNode);


    }

    /**
     * 输入: head = 1->4->3->2->5->2, x = 3
     * 输出: 1->2->2->4->3->5
     *
     * @param head
     * @return
     */
    public static ListNode spilitNode(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode one = new ListNode(-1);
        one.next = head;
        ListNode onePre = one;

        ListNode two = new ListNode(-2);
        ListNode twoPre = two;

        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            if (curr.val < x) {
                onePre.next = curr;
                onePre = curr;
                twoPre.next = temp;
            } else if (curr.val >= x) {
                if(two.next == null){
                    two.next = curr;
                }
                twoPre = curr;
            }
            curr = temp;
        }
        twoPre.next = null;
        onePre.next = two.next;
        return one.next;


    }

    /**
     * 原题解法
     *
     * @param head
     * @param x
     * @return
     */
    public static ListNode partition(ListNode head, int x) {

        // before and after are the two pointers used to create the two list
        // before_head and after_head are used to save the heads of the two lists.
        // All of these are initialized with the dummy nodes created.
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {

            // If the original list node is lesser than the given x,
            // assign it to the before list.
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                // If the original list node is greater or equal to the given x,
                // assign it to the after list.
                after.next = head;
                after = after.next;
            }

            // move ahead in the original list
            head = head.next;
        }

        // Last node of "after" list would also be ending node of the reformed list
        after.next = null;

        // Once all the nodes are correctly assigned to the two lists,
        // combine them to form a single list which would be returned.
        before.next = after_head.next;

        return before_head.next;
    }


}
