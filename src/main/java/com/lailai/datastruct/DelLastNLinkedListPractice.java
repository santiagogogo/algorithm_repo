package com.lailai.datastruct;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 删除链表的倒数第N个节点
 * <p>
 * 在对链表进行操作时，一种常用的技巧是添加一个哑节点（dummy node），它的 \textit{next}next 指针指向链表的头节点。这样一来，我们就不需要对头节点进行特殊的判断了。
 */
public class DelLastNLinkedListPractice {


    /**
     * 链表长度解法
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode cur = head, pre = null;
        int index = 0;
        //获得链表长度
        while (cur != null) {
            cur = cur.next;
            index++;
        }
        //获得要删除的节点
        cur = head;
        for (int i = 0; i < (index - n); i++) {
            pre = cur;
            cur = cur.next;
        }
        //删除节点
        pre.next = cur.next;
        return head;
    }

    /**
     * 栈解法
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        //全部放入栈中，先进先出
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode cur = dummy;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        //取出第n+1个数据
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode pre = stack.peek();
        //删除节点
        pre.next = pre.next.next;
        return dummy.next;
    }


    /**
     * 双指针解法
     */
    public ListNode removeNthFromEnd3(ListNode head, int n) {
        ListNode first = head;
        ListNode dummy = new ListNode(0, head);
        ListNode second = dummy;

        //first先跑领先 n+1个节点
        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        //双指针一块跑
        while (first != null) {
            second=second.next;
            first=first.next;
        }

        second.next=second.next.next;
        return dummy.next;
    }


}
