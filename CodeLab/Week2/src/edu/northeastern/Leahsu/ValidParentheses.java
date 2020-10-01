package edu.northeastern.Leahsu;

/*
12. Valid Parentheses: Leet code 20
 */

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isVaild(String s){
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(stack.empty()){
                    return false;
                }
                if (s.charAt(i) == map.get(stack.peek())){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }return (stack.empty());
    }
}
