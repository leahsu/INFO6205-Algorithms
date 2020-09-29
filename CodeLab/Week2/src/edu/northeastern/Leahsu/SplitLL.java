package edu.northeastern.Leahsu;

/*
4. Split Linked List in Parts: Leet code 725
 */

public class SplitLL {
    public ListNode[] SplitLL(ListNode head, int t){
        ListNode curr = head;
        int length = 0;
        while (curr != null){
            length++;
            curr = curr.next;
        }
        ListNode[] result = new ListNode[t];
        curr = head;
        int index = 0;
        int size = length/t;
        int diff = length - (t * size);
        if(size==0){
            while (curr != null){
                ListNode temp = curr.next;
                curr.next = null;
                result[index] = curr;
                curr = temp;
                index++;
            }
        }else {
            for (int j = 0; j < t; j++){
                for (int i = 0; i < size -1; i++){
                    curr = curr.next;
                }
                if (diff != 0){
                    curr = curr.next;
                    diff--;
                }
                if (curr != null){
                    ListNode temp = curr.next;
                    curr.next = null;
                    result[index] = head;
                    head = temp;
                    curr = head;
                }
                index++;
            }
        }return result;
    }
}
