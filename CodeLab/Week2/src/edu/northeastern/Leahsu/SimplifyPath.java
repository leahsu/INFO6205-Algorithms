package edu.northeastern.Leahsu;

/*
13. Simplify Path: Leet code 71
 */

import java.util.Stack;

public class SimplifyPath {
    public String SimplifyPath(String s){
        Stack<String> stack = new Stack<>();
        for(int i=0; i< s.length(); i++){
            int first = i;
            while (i+1 < s.length() && s.charAt(i+1) != ('/')){
                i++;
            }
            String path = s.substring(first,++i).trim();
            if(!(path.equals("/.")) && !(path.equals("/")) && !(path.equals("/.."))){
                stack.add(path);
            }
            if(path.equals("/..")){
                if(!(stack.isEmpty())){
                    stack.pop();
                }
            }
        }if(stack.isEmpty()){
            stack.add("/");
        }
        Stack<String> stk1 = new Stack<>();
        while (!stack.isEmpty()){
            stk1.add(stack.pop());
        }
        StringBuilder SimplePath = new StringBuilder();
        while (!stk1.isEmpty()){
            SimplePath.append(stk1.pop());
        }
        return SimplePath.toString();
    }
}
