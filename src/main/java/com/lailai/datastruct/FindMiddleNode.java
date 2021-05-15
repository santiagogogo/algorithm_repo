package com.lailai.datastruct;

/**
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class FindMiddleNode {

    /**
     * 快满指针
     * 0 1 2 3 4
     * 0 2 4 6 8
     */
    public ListNode middleNode(ListNode head) {
        if (head.next==null){
            return head;
        }
        if (head.next.next==null){
            return head.next;
        }
        ListNode first=head;
        ListNode second=head;
        while(first!=null&&first.next!=null){
            second=second.next;
            first=first.next.next;
        }
        return second;
    }

    /**
     *  遍历数组长度
     */
    public ListNode middleNode2(ListNode head) {
        if (head.next==null){
            return head;
        }
        if (head.next.next==null){
            return head.next;
        }
        ListNode first=head;
        int index=0;
        while(first!=null){
            first=first.next;
            index++;
        }
        int j=index/2;
        for(int i=0;i<j;i++){
            head=head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(7/2);
    }
}
