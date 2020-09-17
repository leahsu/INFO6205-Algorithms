package edu.northeastern.Leahsu;

public class RotateArray_3 {

    public static void main(String[] args) {
        // write your code here
/*
3. Rotate and array : Given an array, rotate the array to the right by k steps, where k is non-negative.
*/
    }


private static void rotateArray(int[] arr, int r){
        r= r % arr.length;

        reverseArray(arr, 0, arr.length -1);
        reverseArray(arr, 0, r-1);
        reverseArray(arr, r, arr.length -1);
        }

private static void reverseArray(int[] arr, int start, int end){
    if(start < 0 || end <0 || end<=start || start >= arr.length || end >= arr.length){
        return;
    }
    while (start<end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

    }
}

