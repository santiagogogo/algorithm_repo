package com.lailai.datastruct;

import java.util.HashSet;

/**
 * 给定一个链表，判断链表中是否有环。
 */
public class FindLinkedCycle {

    /**
     * 双指针
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
    /**
     * 哈希表
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        HashSet<ListNode> listNodes = new HashSet<>();
        while(listNodes.add(head)){
            if (head==null||head.next==null){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}
