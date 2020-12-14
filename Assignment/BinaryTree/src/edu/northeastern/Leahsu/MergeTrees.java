package edu.northeastern.Leahsu;

//3. Merge Two Binary Trees

public class MergeTrees {
    TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode mergedNode = null;
        if (t1 != null && t2 != null) {
            mergedNode = new TreeNode(t1.val + t2.val);
        }
        else if (t1 != null) {
            mergedNode = t1;
        }
        else if (t2 != null) {
            mergedNode = t2;
        }
        mergedNode.left = mergeTrees(t1.left, t2.left);
        mergedNode.right = mergeTrees(t1.right, t2.right);
        return mergedNode;
    }
}
