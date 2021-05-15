package com.lailai.datastruct;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * <p>
 * 返回删除后的链表的头节点。
 */
public class DelLinkedListNode {
    /**
     * 单指针
     */
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        while (first.next != null) {
            if (first.next.val == val) {
                first.next=first.next.next;
                break;
            }
            first = first.next;
        }
        return dummy.next;
    }
}
