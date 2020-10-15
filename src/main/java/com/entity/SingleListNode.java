package com.entity;

/**
 * 单向链表
 */
public class SingleListNode {
    public int val;
    public SingleListNode nextNode;


    public SingleListNode(int num) {
        this.val = num;
    }

    public SingleListNode(SingleListNode node) {
        this.nextNode = node;

    }

    public SingleListNode(int num, SingleListNode node) {
        this.val = num;
        this.nextNode = node;
    }

    public int getVal() {
        return val;
    }

    public SingleListNode getNextNode() {
        return nextNode;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNextNode(SingleListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        if (this == null) {
            return "";
        }
        StringBuffer buffer = new StringBuffer();
        buffer = getValue(buffer, this);
        return buffer.toString();
    }

    private StringBuffer getValue(StringBuffer buffer, SingleListNode nextNode) {
        if (nextNode == null) {
            buffer.append("null");
            return buffer;
        }
        buffer.append(nextNode.val + "->");
        return getValue(buffer, nextNode.nextNode);
    }

    /**
     * Demo1：
     * 创建一个单向链表，并返回head节点
     * 例如：1->2->3->4->5-null
     *
     * @param size
     * @return
     */
    public static SingleListNode createSingleListNode(int size) {
        if (size <= 0) {
            throw new RuntimeException("单向链表的size应该>0");
        }

        SingleListNode head = null;
        SingleListNode pre = null;
        for (int i = 1; i <= size; i++) {
            SingleListNode cur = new SingleListNode(i);
            if (i == 1) {
                head = cur;
                pre = cur;
                continue;
            }
            pre.nextNode = cur;
            pre = cur;
        }
        return head;
    }

    /**
     * Demo2：第一种解法
     * <p>
     * 1->2->3->4->5->null
     * 改成
     * 1<-2<-3<-4<-5
     */
    public static SingleListNode reverse(SingleListNode head) {
        if (head == null) {
            return null;
        }
        //当前节点的下一个节点是 上一个节点，需要知道上一个节点，所以对上一个节点做个分身
        //当前节点的下一个节点不能立马绑定关联关系，否则不知道下一个的节点，所以对当前节点做个分身

        SingleListNode pre = null;
        SingleListNode current = head;
        while (current != null) {
            SingleListNode nextNode = current.getNextNode();
            current.setNextNode(pre);
            pre = current;
            current = nextNode;
        }
        return pre;
    }

    /**
     * Demo2：第二种解法
     * <p>
     * 1->2->3->4->5->null
     * 改成：
     * null<-1<-2<-3<-4<-5
     */
    public static SingleListNode reverseList(SingleListNode head) {
        if (head == null || head.nextNode == null) {
            return head;
        }
        SingleListNode p = reverseList(head.getNextNode());//5
        head.nextNode.nextNode = head;//
        head.nextNode = null;
        return p;
    }

    /**
     * Demo3：
     *
     * 1->2->3->4->5->null
     * 改成：
     * 2->1->4->3->5
     */

    /**
     * 2->1->3->4
     * 2->1->4->3
     *
     * @param head
     * @return
     */

    public static SingleListNode swapPairs(SingleListNode head) {

        SingleListNode temp = null;
        SingleListNode pre = null;
        SingleListNode curr = head;
        //当前节点的上一个的next，等于该节点的下一个节点:3为开头节点
        //当前节点的next，等于该节点的下一个节点的下一个节点
        //当前下一个节点的next，等于该节点
        while (curr != null && curr.getNextNode() != null) {
            SingleListNode nextNode = curr.nextNode;//2 4
            SingleListNode nextNextNode = curr.nextNode.nextNode;//3 5

            if (pre != null) {
                pre.nextNode = nextNode;//0->2 1->4
            }
            curr.nextNode = nextNextNode;//1->3 3->5
            nextNode.nextNode = curr;//2->1 4->3

            if (temp == null) {
                temp = nextNode;
            }
            pre = curr;
            curr = nextNextNode;

        }
        return temp;
    }

    /**
     * @param head
     * @return
     */
    public static SingleListNode swapPairs2(SingleListNode head) {

        // If the list has no node or has only one node left.
        if ((head == null) || (head.nextNode == null)) {
            return head;
        }

        // Nodes to be swapped
        SingleListNode firstNode = head;
        SingleListNode secondNode = head.nextNode;

        // Swapping
        firstNode.nextNode = swapPairs2(secondNode.nextNode);
        secondNode.nextNode = firstNode;

        // Now the head is the second node
        return secondNode;
    }


    public static void deleteNode0(SingleListNode node,int num){
        SingleListNode pre=null;
        while(node!=null){
            int val = node.val;
            if(val==num){
                if(pre==null){
                    node = node.nextNode;
                }else{
                    pre.nextNode=node.nextNode;
                }
            }
            pre = node;
            node = node.nextNode;
        }

    }



}
