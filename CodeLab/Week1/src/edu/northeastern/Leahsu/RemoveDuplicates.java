package edu.northeastern.Leahsu;

public class RemoveDuplicates {
    /*
    2. LeetCode 83 - Remove duplicates from sorted Link List
    */
    public ListNode RemoveDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == temp.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
