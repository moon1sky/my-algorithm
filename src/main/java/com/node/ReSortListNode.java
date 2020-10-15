package com.node;

import java.util.ArrayList;
import java.util.List;

/**
 * 143. 重排链表
 * https://leetcode-cn.com/problems/reorder-list/
 */
public class ReSortListNode {
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


        //第一种解法
//        ListNode nNode = reSort(node1);

        //第二种解法：
        reorderList(node1);
    }


    public static ListNode reSort(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode ji = new ListNode(-1);
        ji.next = head;
        ListNode jiPre = ji;

        ListNode ou = new ListNode(-2);
        ou.next = head;
        ListNode ouPre = ou;

        int i = 1;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            if(i%2==1){
                jiPre.next = curr;
                jiPre = curr;
            }else{
                ouPre.next = curr;
                ouPre = curr;
            }
            curr = temp;
            i++;
        }
        ouPre.next = null;
        //将偶数翻转
        ListNode reverseNode = reverseList(ou.next);
        ListNode jiNode = ji.next;

        ListNode listNode = mergeTwoLists(jiNode, reverseNode);
        //
//        jiPre.next = ou.next;
//        return ji.next;
        return listNode;
    }



    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;

    }


    public static void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        //存到 list 中去
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        //头尾指针依次取元素
        int i = 0, j = list.size() - 1;
        while (i != j) {
            list.get(i).next = list.get(j);
            i++;
            //偶数个节点的情况，会提前相遇
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
        System.out.println("");
    }

}
