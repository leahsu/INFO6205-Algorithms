package edu.northeastern.Leahsu;

//2. Binary Tree Tilt

public class BTTilt {
    public int Tilt(TreeNode root) {
        if(root == null) return 0;
        else {
            int tilt = Math.abs(sumLeft(root.left) - sumRight(root.right));
            return tilt + Tilt(root.left) + Tilt(root.right);
        }
    }

    private int sumLeft(TreeNode root) {
        if(root == null) return 0;
        else {
            return root.val + sumLeft(root.left) + sumLeft(root.right);
        }
    }

    private int sumRight(TreeNode root) {
        if(root == null) return 0;
        else {
            return root.val + sumRight(root.left) + sumRight(root.right);
        }
    }
}
