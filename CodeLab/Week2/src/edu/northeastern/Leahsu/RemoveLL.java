package edu.northeastern.Leahsu;

/*
11. Remove Linked List Elements: Leet code 203
 */

public class RemoveLL {
    public ListNode removeLL(ListNode head, int val){
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr = head;
        while (curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }else { prev = curr;
            curr = curr.next;
            }
        }
        return temp.next;
    }
}
