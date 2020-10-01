package edu.northeastern.Leahsu;

/*
9. Swap Nodes in Pairs: Leet code 24
*/
public class SwapNodesPairs {

    public ListNode SwapNodes(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode n = SwapNodes(head.next.next);
        ListNode next = head.next;
        head.next.next = head;
        head.next = n;
        return next;
    }

}
