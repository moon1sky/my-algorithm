package com.node;

import com.entity.SingleListNode;

public class Calculate10for2binaryNode {

    public static void main(String[] args) {


        SingleListNode node = get101Node();

        int string = getDecimalValue(node);
        System.out.println(string);


    }

    public static int getDecimalValue(SingleListNode head) {
        if (head == null) {
            return 0;
        }
        return getDecimalValue0(head, 0);
    }

    public static int getDecimalValue0(SingleListNode node, int n) {
        if (node.nextNode == null) {
            return power(node.val, n);
        }
        int value0 = getDecimalValue0(node.nextNode, n);
        ++n;
        return value0 + power(node.val, n);
    }

    public static int power(int a, int b) {
        int power = 1;
        for (int c = 0; c < b; c++)
            power *= a;
        return power;
    }

    private static SingleListNode get101Node() {
        SingleListNode node1 = new SingleListNode(1);
        SingleListNode node2 = new SingleListNode(0);
        SingleListNode node3 = new SingleListNode(1);
        node1.nextNode = node2;
        node2.nextNode = node3;

        System.out.println(node1);
        return node1;
    }


}
