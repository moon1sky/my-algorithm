package com.node;


public class Ji_Ou_List {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//        ListNode node7 = new ListNode(7);
//        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;
        System.out.println(node1);

//        ListNode listNode = jiOuList(node1);
//        System.out.println(listNode);

//        ListNode listNode1 = oddEvenList(node1);
        ListNode listNode = jiOu3(node1);
        System.out.println(listNode);
    }


//        输入:1->2->3->4->5->NULL
//        输出:1->3->5->2->4->NULL
    /**    第一种
     *    循环遍历每一个node， 提前记录奇数的pre和偶数的pre
     *    如果下一个是奇数，则将pre的next指向当前节点
     */
    public static ListNode jiOuList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }


        ListNode ji = new ListNode(-1);
        ListNode jiPre = ji;
        ListNode ou = new ListNode(-2);
        ListNode ouPre = ou;
        int i = 1;
        ListNode curr = head;

        ListNode ouLast = head.next;

        while(curr!=null){
            ListNode temp = curr.next;
            if(i%2==1){
                curr.next = jiPre;
                jiPre = curr;
            }else{
                curr.next = ouPre;
                ouPre = curr;
            }
            curr = temp;
            i++;
        }
        ouLast.next = jiPre;
        System.out.println(jiPre);
        System.out.println(ouPre);

        return reverse(ouPre).next;
    }


    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        //当前节点的下一个节点是 上一个节点，需要知道上一个节点，所以对上一个节点做个分身
        //当前节点的下一个节点不能立马绑定关联关系，否则不知道下一个的节点，所以对当前节点做个分身

        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next=pre;
            pre = current;
            current = nextNode;
        }
        return pre;
    }

    /**
     * 第二种
     */
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        odd.next = null;
        System.out.println(head);
        System.out.println(odd);

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }


    /**
     * 第三种
     */
    public static ListNode jiOu3(ListNode head){
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
        jiPre.next = ou.next;
        return ji.next;
    }
}





