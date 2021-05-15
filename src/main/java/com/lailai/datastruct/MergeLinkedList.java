package com.lailai.datastruct;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 */
public class MergeLinkedList {


    /**
     *
     * 双指针，比较排序
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode newList2 = dummy;
        while (l1!=null||l2!=null){
            if (l1==null){
                newList2.next=new ListNode(l2.val);
                l2=l2.next;
            }else if (l2==null){
                newList2.next=new ListNode(l1.val);
                l1=l1.next;
            }else if (l1.val>l2.val){
                newList2.next=new ListNode(l2.val);
                l2=l2.next;
            }else if (l1.val<=l2.val){
                newList2.next=new ListNode(l1.val);
                l1=l1.next;
            }
            newList2=newList2.next;
        }
        return dummy.next;
    }
}
