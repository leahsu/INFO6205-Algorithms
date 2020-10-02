package edu.northeastern.Leahsu;

/*
15. Basic Calculator: Leet code 224
 */

public class BasicCalculator {
    int index= 0;
    public int calculate(String s){
        int sum =0;
        int mark =1;
        while (index < s.length()){
            char c = s.charAt(index);
            if(c=='('){
                ++index;
                int subRes = calculate(s);
                sum += mark*subRes;
            }else if(c==')'){
                return sum;
            }else if (c=='+'){
                mark=1;
            }else if (c=='-'){
                mark=-1;
            }else if(Character.isDigit(c)){
                int num= c-'0';
                while (index+1<s.length() && Character.isDigit(s.charAt(index+1))){
                    num= 10*num+s.charAt(++index)-'0';
                }
                sum += mark*num;
            }
            ++index;

        }
        return sum;
    }
}
