package edu.northeastern.Leahsu;

public class ConvertBinary {
    /*
    5. LeetCode 1290 - Convert Binary Number in a Linked List to Integer
    */

    public int DecimalVal(ListNode head) {
        int temp = head.val;
        while (head.next != null) {
            temp = temp * 2 + head.next.val;
            head = head.next;
        }
        return temp;
    }
}