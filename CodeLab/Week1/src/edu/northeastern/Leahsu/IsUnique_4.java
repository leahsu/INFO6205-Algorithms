package edu.northeastern.Leahsu;

import java.util.HashSet;

public class IsUnique_4 {

 /*
 4. Is Unique : Implement an algorithm to determine if a string has all unique characters.
 */

    private static boolean IsUnique(int[] arr){
        if(arr == null || arr.length <=1){
            return true;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : arr){
            if (set.contains(i)){
                return false;
            }
            set.add(i);
        }
        return true;
    }
}

