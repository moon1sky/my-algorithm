package com.node;


public class SortTwoNodes {
    public static void main(String[] args) {
        ListNode l1 = ListNode.createSingleListNode(2);
//        ListNode l2 = ListNode.createSingleListNode(2);
//        ListNode listNode = mergeTwoLists(l1, l2);
//        System.out.println(listNode);
//
//        ListNode pre = l1;
//        l1 = new ListNode(5);
//        System.out.println(pre==l1);

        System.out.println(l1);
//        ListNode halfPre = l1;
//        ListNode listNode = ListNode.reverseList(l1);
//        System.out.println(listNode);
//



        isPalindrome(l1);

    }

    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        if(head.val==head.next.val && head.next.next==null){
            return true;
        }
        if(head.next.next!=null && head.next.next.next==null
                && head.val==head.next.next.val){
            return true;
        }


        int total  = 0;
        int half = 0;
        boolean flag = false;

        while (head!=null){
            total++;
            if(flag){
                half++;
            }
            if(head.next!=null && head.next.val==head.val){
                flag = true;
            }
            head = head.next;
        }
        total = total / 2 + (total % 2 == 0 ? 0 : 1);
        if(half!=total){
            return false;
        }
        return true;
    }


    //            输入：1->2->4, 1->3->4
    //            输出：1->1->2->3->4->4
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ll1 = l1;
        ListNode pre = null;
        while (ll1 != null && l2 != null) {
            pre = ll1;
            ListNode temp1 = ll1.next;
            ListNode temp = l2.next;
            if (ll1.val <= l2.val) {
                l2.next = ll1.next;
                ll1.next = l2;
            } else {
                l2.next = ll1;
            }
            l2 = temp;
            ll1 = temp1;
        }
        l1 = l2 == null ? l1 : (pre.next = l2);
        return l1;

//        ListNode l1Next = l1;
//        ListNode l2Next = l2;
//        while (l1Next != null) {
//            ListNode temp1 = l1Next.next;
//            while (l2Next != null) {
//                ListNode temp2 = l2Next.next;
//                if (l1Next.val <= l2Next.val) {
//                    l2Next.next = l1Next.next;
//                    l1Next.next = l2Next;
//                } else {
//                    l2Next.next = l1Next;
//                }
//                l2Next = temp2;
//                break;
//            }
//            l1Next = temp1;
//        }
//        return l1;
    }
}


class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
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

    private StringBuffer getValue(StringBuffer buffer, ListNode nextNode) {
        if (nextNode == null) {
            buffer.append("null");
            return buffer;
        }
        buffer.append(nextNode.val + "->");
        return getValue(buffer, nextNode.next);
    }

    public static ListNode createSingleListNode(int size) {
        if (size <= 0) {
            throw new RuntimeException("单向链表的size应该>0");
        }

        ListNode head = null;
        ListNode pre = null;
        for (int i = 1; i <= size; i++) {
            ListNode cur = new ListNode(i);
            if (i == 1) {
                head = cur;
                pre = cur;
                continue;
            }
            pre.next = cur;
            pre = cur;
        }
        return head;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);//5
        head.next.next = head;//
        head.next = null;
        return p;
    }
}
