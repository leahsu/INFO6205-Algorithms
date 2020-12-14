package edu.northeastern.Leahsu;

//1. Link List in Binary Tree

public class LinkList {
    boolean result = false;
    public boolean isSubPath(ListNode head, TreeNode root) {

        if(root == null || head == null)
            return false;

        if(root.val == head.val){
            if(isValid(head, root))
                return true;
        }

        if(root.left!= null)
            isSubPath(head, root.left);

        if(root.right!= null)
            isSubPath(head, root.right);

        return result;
    }

    public boolean isValid(ListNode head, TreeNode root){
        if(head == null || head.next == null){
            result = true;
            return true;
        }

        boolean left = false;
        boolean right = false;

        if(root.left!=null && head.next.val==root.left.val)
            left = isValid(head.next,root.left);

        if(root.right!=null && head.next.val==root.right.val)
            right = isValid(head.next,root.right);

        return (left || right);
    }
}
