package edu.northeastern.Leahsu;

//5. Tree Diameter

public class treeDiameter {

    Node root;

    int diameter(Node root)
    {
        // base case if tree is empty
        if (root == null)
            return 0;

        // get the height of left and right sub-trees
        int lheight = height(root.left);
        int rheight = height(root.right);

        // get the diameter of left and right sub-trees
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return Math.max(lheight + rheight + 1,
                Math.max(ldiameter, rdiameter));
    }

    int diameter() { return diameter(root); }


    static int height(Node node)
    {
        // base case tree is empty
        if (node == null)
            return 0;

        // If tree is not empty then height = 1 + max of
        //  left height and right heights
        return (1
                + Math.max(height(node.left),
                height(node.right)));
    }
}
