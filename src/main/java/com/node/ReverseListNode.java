package com.node;

import com.entity.SingleListNode;

/**
 * 1->2->3->4->5->null
 * 改成：
 * 5->4->3->2->1->null
 */
public class ReverseListNode {
    public static void main(String[] args) {
        SingleListNode head = SingleListNode.createSingleListNode(5);
        System.out.println(head);

        //reverse 单向链表1
//        SingleListNode newHead = SingleListNode.reverse(head);
//        System.out.println(newHead);

        //reverse 单向链表2
//        SingleListNode newHead = SingleListNode.reverseList(head);
//        System.out.println(newHead);

        //两两交换1
//        SingleListNode swapPairs = SingleListNode.swapPairs(head);
//        System.out.println(swapPairs);
        //两两交换2
//        SingleListNode swapPairs2 = SingleListNode.swapPairs2(head);
//        System.out.println(swapPairs2);

        //交换节点的两种方式
//        swapNode();

        //删除某个节点，传nodeList和某个node的val
        SingleListNode.deleteNode0(head,3);
        System.out.println(head);



    }

    private static void swapNode() {
        SingleListNode A = new SingleListNode(1);
        SingleListNode B = new SingleListNode(2);
        A.nextNode = B;
        System.out.println(A);
        System.out.println(B);
        //交换
//        A.nextNode = null;
//        B.nextNode = A;
//        A.nextNode.nextNode = A;
//        A.nextNode = null;
        System.out.println(A);
        System.out.println(B);
    }


}
