package edu.northeastern.Leahsu;

import java.util.ListIterator;

/*
5. Remove Duplicates from Sorted List II: Leet code 82
 */
public class RemoveDuplicatesII {
    public ListNode RemoveDuplicates(ListNode node, int val){
        while (node != null && node.val == val)
            node = node.next;
        return node;
    }

    public ListNode DeleteDuplicates(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode temp = new ListNode(Integer.MIN_VALUE);
        temp.next = head;
        ListNode n = temp;
        ListNode pre = null;

        while (n != null){
            while (n != null && n.next != null && n.val == n.next.val){
                ListNode t = RemoveDuplicates(n,n.val);
                if (pre == null)
                    pre = t;
                else
                    pre.next = t;
                n = pre;
            }
            pre = n;
            n = n.next;
        }
        return temp.next;
    }

}
