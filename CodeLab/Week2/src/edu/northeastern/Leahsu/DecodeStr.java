package edu.northeastern.Leahsu;

/*
18. Decode String: Leet code 394
 */

public class DecodeStr {
    int i = 0;
    String DecodeString(String s){
        StringBuilder result = new StringBuilder();
        while (i<s.length() && s.charAt(i) != ']'){
            if(!Character.isDigit(s.charAt(i))){
                result.append(s.charAt(i++));
            }else {
                int k =0;
                while (i<s.length() && Character.isDigit(s.charAt(i))){
                    k= k*10 + s.charAt(i++) -'0';
                    i++;
                    String Decoded = DecodeString(s);
                    i++;
                while (k-- >0){
                    result.append(Decoded);
                }
                }
            }
        }return new String(result);
    }
}
