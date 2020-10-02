package edu.northeastern.Leahsu;
/*
20. 132 Pattern: Leet code 456
 */

public class Pattern123 {
    public boolean return123Pattern(int[] num){
        for (int i =0; i<num.length-2; i++){
            for (int j= i+1; j< num.length-1; j++){
                for (int k= j+1; k< num.length; k++){
                    if (num[k]> num[i] && num[j]> num[k])
                        return true;
                }
            }
        }return false;
    }
}
