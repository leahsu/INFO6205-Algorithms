package edu.northeastern.Leahsu;

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
