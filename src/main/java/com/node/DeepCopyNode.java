package com.node;

import java.util.HashMap;

public class DeepCopyNode {

    public static HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.random = node3;
        node2.random = node4;
        node3.random = node1;

        printAll(node1);

        Node node = copyRandomList(node1);
        printAll(node);

        Node myNode = myCopyRandomList(node1);
        printAll(myNode);

        System.out.println(node==myNode);
    }

    private static void printAll(Node node) {
        while(node!=null){
            System.out.println(node);
            System.out.println(node.random);
            node = node.next;
        }
        System.out.println("===============");
    }

    /**
     * 原题解法
     *
     * @param head
     * @return
     */

    public static Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        // If we have already processed the current node, then we simply return the cloned version of
        // it.
        if (visitedHash.containsKey(head)) {
            return visitedHash.get(head);
        }

        // Create a new node with the value same as old node. (i.e. copy the node)
        Node node = new Node(head.val, null, null);

        // Save this value in the hash map. This is needed since there might be
        // loops during traversal due to randomness of random pointers and this would help us avoid
        // them.
        visitedHash.put(head, node);

        // Recursively copy the remaining linked list starting once from the next pointer and then from
        // the random pointer.
        // Thus we have two independent recursive calls.
        // Finally we update the next and random pointers for the new node created.
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);

        return node;
    }


    /**
     * 我的解法
     *
     * @param head
     * @return
     */
    public static Node myCopyRandomList(Node head) {
        Node temp = head;
        Node temp1 = head;

        if (temp == null) {
            return null;
        }

        while (temp != null) {
            if (!visitedHash.containsKey(temp)) {
                visitedHash.put(temp, new Node(temp.val, null, null));
            }
            if (temp.random != null && !visitedHash.containsKey(temp.random)) {
                visitedHash.put(temp.random, new Node(temp.random.val, null, null));
            }
            temp = temp.next;
        }
        visitedHash = visitedHash;

        Node tt = new Node(-1);
        Node pre = tt;
        while (temp1 != null) {
            Node node = visitedHash.get(temp1);
            Node randomNode = visitedHash.get(temp1.random);
            node.random = randomNode;

            pre.next = node;
            pre = node;
            temp1 = temp1.next;
        }
        return tt.next;
    }

    public static Node myCopyRandomList3(Node head) {
        Node temp = head;

        if (temp == null) {
            return null;
        }

        Node tt = new Node(-1);
        Node pre = tt;
        while (temp != null) {
            if (!visitedHash.containsKey(temp)) {
                visitedHash.put(temp, new Node(temp.val, null, null));
            }
            if (temp.random != null && !visitedHash.containsKey(temp.random)) {
                visitedHash.put(temp.random, new Node(temp.random.val, null, null));
            }
            Node node = visitedHash.get(temp);
            Node randomNode = visitedHash.get(temp.random);
            node.random = randomNode;

            pre.next = node;
            pre = node;
            temp = temp.next;
        }
        return tt.next;
    }

}

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
        next = null;
        random = null;
    }


    public Node(int _val, Node _next, Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
