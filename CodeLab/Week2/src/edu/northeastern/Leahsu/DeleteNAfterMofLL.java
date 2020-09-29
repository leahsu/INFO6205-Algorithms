package edu.northeastern.Leahsu;
/*
2. Delete N Nodes After M Nodes of a Linked List: Leet code 1474
 */
public class DeleteNAfterMofLL {
    public ListNode DeleteNode(ListNode head, int m, int n){
        if (m==0)
            return null;
        ListNode curr = head;
        while (curr != null){
            int mCount = 0;
            while (curr != null && mCount < m-1){
                curr = curr.next;
                mCount++;
            }
            ListNode temp = curr;
            int nCount = 0;
            while (curr != null && nCount <=n){
                curr = curr.next;
                nCount++;
            }
            if (temp != null){
                temp.next = curr;
            }
        }
        return head;
    }
}

