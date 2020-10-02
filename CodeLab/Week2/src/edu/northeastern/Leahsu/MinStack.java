package edu.northeastern.Leahsu;

/*
14. Min Stack: Leet code 155
 */

import java.util.Stack;

public class MinStack {
     Stack<Integer> stack = new Stack<>();
     Stack<Integer> minStack = new Stack<>();

     public void push(int x){
         stack.push(x);
         if(minStack.isEmpty() || x<=minStack.peek()){
             minStack.push(x);
         }
     }
     public void pop(){
         if(stack.peek().equals(minStack.peek())){
             minStack.pop();
         }
         stack.pop();
     }
     public int top(){
         return stack.peek();
     }
     public int getMin(){
         return minStack.peek();
     }
}
