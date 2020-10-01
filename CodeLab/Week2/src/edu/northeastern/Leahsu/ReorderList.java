package edu.northeastern.Leahsu;

/*
7. Reorder List: [Leet code 143](Reorder List)
 */
public class ReorderList {
    public void ReorderList(ListNode head){
        if(head == null){
            return;
        }
        ListNode p = head;
        ListNode q = head.next;
        while (null != q && q.next != null){
            q = q.next.next;
            p = p.next;
        }

        ListNode t1 = p.next;
        p.next = null;
        p = t1;
        q = null;

        while (p != null){
            ListNode t2 = p.next;
            p.next = q;
            q = p;
            p = t2;
        }

        while (head != null && q != null){
            t1 = head.next;
            head.next = q;
            head = t1;
            p = q.next;
            q.next = p;
            q = p;
        }
    }
}
