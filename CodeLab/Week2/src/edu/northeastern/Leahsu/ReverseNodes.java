package edu.northeastern.Leahsu;
/*
6. Reverse Nodes in k-Group: Leet code 25
 */

public class ReverseNodes {
    public ListNode reverseNode(ListNode head, int k){
        ListNode new_head = null;
        ListNode pointer = head;

        while (k>0){
            ListNode next_node = pointer.next;
            pointer.next = new_head;
            new_head = pointer;

            pointer = next_node;

            k--;
        }
        return new_head;
    }
    public ListNode reverseK(ListNode head, int k){
        int count = 0;
        ListNode pointer = head;

        while (count < k && pointer != null){
            pointer = pointer.next;
            count++;
        }

        if (count==k){
            ListNode reverseHead = this.reverseNode(head,k);
            head.next = this.reverseK(pointer,k);
            return reverseHead;
        }
        return head;
    }
}
