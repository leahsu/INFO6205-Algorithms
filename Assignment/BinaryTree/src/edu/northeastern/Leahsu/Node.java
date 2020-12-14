package edu.northeastern.Leahsu;

public class Node <T> {
    public T data;
    public Node<T> left;
    public Node<T> right;

    private Node(){}

    public Node (T data){
        this.data = data;
    }

}
