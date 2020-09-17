package edu.northeastern.Leahsu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_2 {
        public static void main(String[] args) {
        // write your code here
/*
2. Two Sum Problem : Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
*/
    int[] arr = {4,5,12,15};
    System.out.println(twoSum(arr,3));
    }

private static boolean twoSum(int[] arr, int target) {
    if (arr == null || arr.length <= 1) {
        return false;
    }
    Arrays.sort(arr);

    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
        if (arr[start] + arr[end] == target) {
            return true;
        } else if (arr[start] + arr[end] > target) {
            end--;
        } else {
            start++;
        }
    }
    return false;
}
     private static int[] twoSumIndex(int[] arr, int target){
            if(arr == null || arr.length <= 1){
                return new int[]{-1,-1};
            }
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

         for(int i = 0; i < arr.length; i ++){
             int compliment = target - arr[i];
             if (map.containsKey(compliment)){
                 return new int[] {map.get(compliment), i};
             }
             map.put(arr[i], i);
         }
         return new int[] {-1,-1};

     }
}
