package edu.northeastern.Leahsu;

/*Q6
Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.
 */


public class TwoSum {

    public boolean findTarget(TreeNode root, int k) {
        Set < Integer > set = new HashSet();
        return find(root, k, set);
    }
    public boolean find(TreeNode root, int k, Set < Integer > set) {
        if (root == null)
            return false;
        if (set.contains(k - root.val))
            return true;
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }

    private class HashSet extends Set < Integer > {
    }

    private class Set<T> {
        public boolean contains(T i) {
            return false;
        }

        public void add(T val) {
        }
    }
}
