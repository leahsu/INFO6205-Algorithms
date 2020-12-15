package edu.northeastern.Leahsu;

/*Q5
Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s.
A subtree of s is a tree consists of a node in s and all of this node's descendants.
The tree s could also be considered as a subtree of itself.
 */

public class Subtree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null && s == null) return true;
        if (t == null || s == null) return false;
        return this.isEqual(s, t) || this.isSubtree(s.left, t) || this.isSubtree(s.right, t);
    }
    public boolean isEqual(TreeNode s, TreeNode t) {
        if (t == null && s == null) return true;
        if (t == null || s == null) return false;
        if (s.val == t.val && this.isEqual(s.left, t.left) && this.isEqual(s.right, t.right)) return true;
        return false;
    }
}
