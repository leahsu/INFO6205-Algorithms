package edu.northeastern.Leahsu;

//4. Construct a Binary tree from Inorder and Preorder traversal

public class Tree <T> {

    public Node<T> root;

    public Tree(){

    }

    public void preOrder(){
        preOrder(root);

    }
    private void preOrder(Node<T> node){
            if(node != null){
                System.out.printf(node.data + " ");
                preOrder(node.left);
                preOrder(node.right);

            }

        }

    public void inOrder(){
        inOrder(root);

    }
    private void inOrder(Node<T> node){
            if(node != null){
                inOrder(node.left);
                System.out.printf(node.data + " ");
                inOrder(node.right);

            }

        }

    public void postOrder(){
        postOrder(root);

    }
    private void postOrder(Node<T> node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.printf(node.data + " ");

        }

    }


}
