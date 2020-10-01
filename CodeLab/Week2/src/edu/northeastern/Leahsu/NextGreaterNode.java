package edu.northeastern.Leahsu;

/*
8. Next Greater Node In Linked List: Leet code 1019
*/

import java.util.ArrayList;
import java.util.List;

public class NextGreaterNode {
    public int[] NextGreatNode(ListNode head){
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (head != null){
            list.add(head.val);
            head = head.next;
            count++;

        }
        int result[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            for (int j = i+1; j < list.size(); j++){
                if(list.get(i) < list.get(j)){
                    result[i] = list.get(j);
                    break;
                }
            }
        }return result;
    }
}
