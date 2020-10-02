package edu.northeastern.Leahsu;

/*
16.Remove Duplicate Letters: Leet code 316
 */

import java.util.Stack;

public class RemoveDuplicateLetters<stack> {

    Stack<Character> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();

    int[] count = new int[26];
    boolean[] used = new boolean[26];

    for (char c : s.toCharArray())
    {
        count[c - 'a']++;
    }
    for(char c : s.toCharArray())

    {
        count[c - 'a']--;
        if (used[c - 'a'] == true) continue;
        while (!stack.isEmpty() && stack.peek() > c && count[stack.peek() - 'a'] > 0) {
            used[stack.peek() - 'a'] = false;
            stack.pop();
        }
        stack.push(c);
        used[c - 'a'] = true;
    }
    for(char c :stack)

    {
        sb.append(c);

    }
    return sb.toString();
}

