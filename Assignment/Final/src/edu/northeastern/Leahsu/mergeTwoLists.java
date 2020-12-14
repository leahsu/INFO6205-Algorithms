package edu.northeastern.Leahsu;

/*Q2
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
*/

public class mergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return l1;
        else{
            if(l1 == null && l2 != null)
                return l2;
            else if(l1 != null && l2 == null)
                return l1;
        }

        ListNode res = new ListNode();
        ListNode temp = res;

        if(l1.val < l2.val){
            res.val = l1.val;
            l1 = l1.next;
        }
        else{
            res.val = l2.val;
            l2 = l2.next;
        }


        while(l1 != null || l2 != null){
            ListNode node = new ListNode();
            int val;

            if(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    val = l1.val;
                    l1 = l1.next;
                }
                else{
                    val = l2.val;
                    l2 = l2.next;
                }
            }
            else if(l1 != null && l2 == null){
                val = l1.val;
                l1 = l1.next;
            }
            else{
                val = l2.val;
                l2 = l2.next;
            }

            node.val = val;
            temp.next = node;
            temp = temp.next;
        }

        return res;
    }

}
