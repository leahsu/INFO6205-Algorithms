package edu.northeastern.Leahsu;

public class Main {

    public static void main(String[] args) {
	    Tree<Integer> tree = initializeTree();
	    tree.preOrder();
        System.out.println("");
	    tree.inOrder();
        System.out.println("");
        tree.postOrder();
        System.out.println("");
    }
    private static Tree<Integer> initializeTree(){
        Tree<Integer> tree = new Tree<>();
        Node<Integer> root = new Node(3);

        //level 2
        root.left = new Node<Integer>(9);
        root.right = new Node<Integer>(20);

        //level 3
        root.right.left = new Node<Integer>(15);
        root.right.right = new Node<Integer>(7);

        tree.root = root;

        return tree;

    }
}
