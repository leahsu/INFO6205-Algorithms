package edu.northeastern.Leahsu;

//5. Tree Diameter

public class treeDiameter {

    Node root;

    int diameter(Node root)
    {
        if (root == null)
            return 0;

        // get the height of left and right sub-trees
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        // get the diameter of left and right sub-trees
        int leftdiameter = diameter(root.left);
        int rightdiameter = diameter(root.right);

        return Math.max(leftheight + rightheight + 1,
                Math.max(leftdiameter, rightdiameter));
    }

    int diameter() { return diameter(root); }


    static int height(Node node)
    {
        if (node == null)
            return 0;


        return (1
                + Math.max(height(node.left),
                height(node.right)));
    }
}
