package com.node;

import java.util.ArrayList;
import java.util.List;

/**
 * 725. 分隔链表
 */
public class QieGeNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
//        ListNode node7 = new ListNode(7);
//        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;
        System.out.println(node1);
        ListNode[] listNodes = splitListToParts(node1, 3);
        System.out.println(listNodes);

    }

    public static ListNode[] splitListToParts(ListNode root, int k) {
        List<ListNode> list = new ArrayList<>();
        while (root != null) {
            list.add(root);
            root = root.next;
        }

        int rem = list.size() % k;
        int xx = list.size() / k;

        ListNode[] nodes = new ListNode[k];
        for (int i = 0; i < k; i++) {
            int i1 = i * xx;
            nodes[i] = list.get(i1);

            list.get((i+1)*xx-1).next = null;
            System.out.println("");
        }
        ListNode listNode = list.get(0);
        System.out.println(listNode);
        return nodes;

    }
}
