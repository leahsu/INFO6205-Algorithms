package edu.northeastern.Leahsu;

/*
3. Delete Node in a Linked List: Leet code 237
 */
public class DeleteNodeinLL {
    public void deleteNode(ListNode node){
        ListNode temp = node;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
